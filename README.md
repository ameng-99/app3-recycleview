# 📱 Aplikasi RecyclerView – Data Siswa
Project ini dibuat untuk menampilkan daftar siswa menggunakan komponen RecyclerView di Android Studio. 
Aplikasi ini merupakan tugas praktikum yang bertujuan untuk memahami cara kerja RecyclerView, adapter, dan model data.

## Penjelasan RecyclerView
RecyclerView adalah komponen yang disediakan oleh Android untuk menampilkan data dalam bentuk daftar (list) atau grid secara efisien. 
Dibandingkan dengan ListView, RecyclerView lebih fleksibel dan memiliki performa yang lebih baik, 
karena mampu mendaur ulang tampilan item yang tidak terlihat di layar (recycle view), sehingga menghemat penggunaan memori.

## 👥 Tim
- Amelia Nur Auni 
- Erikza Assyifia Ahmad
- Jovita Acid Rahayu 

## Penjelasan Alur Data 
1. Student.kt (Model)
- Kelas data (data class) yang menyimpan properti siswa seperti nama, nis, kelas, dan foto. Digunakan untuk merepresentasikan satu objek data siswa.
2. StudentAdapter.kt (Adapter)
- Berfungsi untuk menghubungkan data siswa ke tampilan list di RecyclerView (mengatur tampilan dan klik pada setiap item siswa).
3. item_student.xml (Layout Item)
- Layout XML untuk satu item siswa di dalam RecyclerView. Isinya berupa gambar siswa, nama, NIS, dan Kelas.
4. MainActivity.kt
- Menampilkan data list siswa dalam RecyclerView. Di bagian sini data siswa dikirim ke adapter, recyclerView dikonfigurasi, handle klik item untuk berpindah ke detail.
5. DetailActivity.kt
- Menampilkan detail lengkap dari siswa yang dipilih (menerima data siswa melalui Intent dari MainActivity).

## Fitur Aplikasi
- Menampilkan daftar 10 siswa.
  ![WhatsApp Image 2025-08-06 at 09 27 39_734b00e7](https://github.com/user-attachments/assets/8bcfb8eb-8fa7-404f-b83f-20c503b0c63c)
Fungsi kode tersebut adalah untuk menampilkan daftar siswa secara vertikal menggunakan RecyclerView, di mana setiap item berisi nama, NIS, dan kelas siswa yang datanya dihubungkan melalui StudentAdapter.

- Setiap item memiliki tombol Edit dan Hapus (bisa mengubah data siswa dan bisa menghapus).
- Menambahkan gambar, NIS, dan kelas setiap siswa.
