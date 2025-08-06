package com.smkth.app3_recycleview.utils

import com.smkth.app3_recycleview.model.Student

object DummyData {
    fun getStudents(): MutableList<Student> {
        return mutableListOf(
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
    }
}