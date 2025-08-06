package com.smkth.app3_recycleview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.smkth.app3_recycleview.adapter.StudentAdapter
import com.smkth.app3_recycleview.model.Student
import com.smkth.app3_recycleview.utils.DummyData

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var studentAdapter: StudentAdapter
    private val studentList = DummyData.getStudents()


    companion object {
        const val REQUEST_ADD = 1
        const val REQUEST_EDIT = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Data awal
        studentList.addAll(
            listOf(
                Student("Raka Pratama", "123001", "XI RPL 1"),
                Student("Dina Maulida", "123002", "XI TKJ 2"),
                Student("Galang Saputra", "123003", "XI DKV 1"),
                Student("Nadya Lestari", "123004", "XI MM 1"),
                Student("Ilham Ramadhan", "123005", "XI RPL 2"),
                Student("Sinta Aulia", "123006", "XI TKJ 1"),
                Student("Rian Hidayat", "123007", "XI TEI 1"),
                Student("Putri Cahyani", "123008", "XI RPL 1"),
                Student("Andi Saputra", "123009", "XI TKJ 2"),
                Student("Mega Pratiwi", "123010", "XI MM 2")
            )
        )

        // Set adapter
        studentAdapter = StudentAdapter(this, studentList)
        recyclerView.adapter = studentAdapter


        // Tombol tambah siswa
        val btnTambah: Button = findViewById(R.id.btnTambah)
        btnTambah.setOnClickListener {
            val intent = Intent(this, AddEditActivity::class.java)
            startActivityForResult(intent, REQUEST_ADD)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode != RESULT_OK || data == null) return

        val nama = data.getStringExtra("student_nama") ?: return
        val nis = data.getStringExtra("student_nis") ?: return
        val kelas = data.getStringExtra("student_kelas") ?: return
        val student = Student(nama, nis, kelas)

        when (requestCode) {
            REQUEST_ADD -> {
                studentList.add(student)
                studentAdapter.notifyItemInserted(studentList.size - 1)
            }

            REQUEST_EDIT -> {
                val index = data.getIntExtra("edit_index", -1)
                if (index in studentList.indices) {
                    studentList[index] = student
                    studentAdapter.notifyItemChanged(index)
                }
            }
        }
    }

}