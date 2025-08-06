package com.smkth.app3_recycleview.adapter

import android.app.AlertDialog
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.*
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.smkth.app3_recycleview.AddEditActivity
import com.smkth.app3_recycleview.DetailActivity
import com.smkth.app3_recycleview.MainActivity
import com.smkth.app3_recycleview.R
import com.smkth.app3_recycleview.model.Student

class StudentAdapter(
    private val context: Context,
    private val studentList: MutableList<Student>
) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvNama)
        val tvNis: TextView = itemView.findViewById(R.id.tvNis)
        val tvKelas: TextView = itemView.findViewById(R.id.tvKelas)
        val btnEdit: Button = itemView.findViewById(R.id.btnEdit)
        val btnHapus: Button = itemView.findViewById(R.id.btnHapus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = studentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = studentList[position]
        holder.tvName.text = student.nama
        holder.tvNis.text = "NIS: ${student.nis}"
        holder.tvKelas.text = "Kelas: ${student.kelas}"

        // 🔍 Lihat detail
        holder.itemView.setOnClickListener {
            AlertDialog.Builder(context)
                .setTitle("Lihat Detail?")
                .setMessage("Ingin melihat detail dari ${student.nama}?")
                .setPositiveButton("Lihat") { _, _ ->
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra("student_nama", student.nama)
                    intent.putExtra("student_nis", student.nis)
                    intent.putExtra("student_kelas", student.kelas)
                    context.startActivity(intent)
                }
                .setNegativeButton("Batal", null)
                .show()
        }

        // ❌ Hapus data
        holder.btnHapus.setOnClickListener {
            AlertDialog.Builder(context)
                .setTitle("Hapus Data")
                .setMessage("Yakin ingin menghapus ${student.nama}?")
                .setPositiveButton("Hapus") { _, _ ->
                    studentList.removeAt(position)
                    notifyItemRemoved(position)
                    notifyItemRangeChanged(position, studentList.size)
                    Toast.makeText(context, "${student.nama} dihapus", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Batal", null)
                .show()
        }

        // ✏ Edit data
        holder.btnEdit.setOnClickListener {
            val intent = Intent(context, AddEditActivity::class.java).apply {
                putExtra("student_nama", student.nama)
                putExtra("student_nis", student.nis)
                putExtra("student_kelas", student.kelas)
                putExtra("edit_index", holder.adapterPosition)
            }
            (context as Activity).startActivityForResult(intent, MainActivity.REQUEST_EDIT)
        }
    }
}