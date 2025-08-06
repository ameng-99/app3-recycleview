package com.smkth.app3_recycleview

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AddEditActivity : AppCompatActivity() {

    private lateinit var etNama: EditText
    private lateinit var etNis: EditText
    private lateinit var etKelas: EditText
    private lateinit var btnSimpan: Button

    private var editIndex: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edit)

        etNama = findViewById(R.id.etNama)
        etNis = findViewById(R.id.etNis)
        etKelas = findViewById(R.id.etKelas)
        btnSimpan = findViewById(R.id.btnSimpan)

        // Cek apakah mode edit
        if (intent.hasExtra("student_nama")) {
            etNama.setText(intent.getStringExtra("student_nama"))
            etNis.setText(intent.getStringExtra("student_nis"))
            etKelas.setText(intent.getStringExtra("student_kelas"))
            editIndex = intent.getIntExtra("edit_index", -1)
        }

        btnSimpan.setOnClickListener {
            val intentResult = Intent().apply {
                putExtra("student_nama", etNama.text.toString())
                putExtra("student_nis", etNis.text.toString())
                putExtra("student_kelas", etKelas.text.toString())
                if (editIndex != -1) putExtra("edit_index", editIndex)
            }
            setResult(Activity.RESULT_OK, intentResult)
            finish()
        }
    }
}