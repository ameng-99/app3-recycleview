# 📱 Aplikasi RecyclerView – Data Siswa
Project ini dibuat untuk menampilkan daftar siswa menggunakan komponen RecyclerView di Android Studio. 
Aplikasi ini merupakan tugas praktikum yang bertujuan untuk memahami cara kerja RecyclerView, adapter, dan model data.

## 👥 Tim
- Amelia Nur Auni 
- Erikza Assyifia Ahmad
- Jovita Acid Rahayu


## Penjelasan RecyclerView
RecyclerView adalah komponen yang disediakan oleh Android untuk menampilkan data dalam bentuk daftar (list) atau grid secara efisien. 
Dibandingkan dengan ListView, RecyclerView lebih fleksibel dan memiliki performa yang lebih baik, 
karena mampu mendaur ulang tampilan item yang tidak terlihat di layar (recycle view), sehingga menghemat penggunaan memori.


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
![WhatsApp Image 2025-08-06 at 09 25 37_dc9586a1](https://github.com/user-attachments/assets/ef1cee9c-a9bd-4edf-9030-1e4773d3a25a)


- Penjelasan: Kode ini untuk menampilkan daftar siswa secara vertikal menggunakan RecyclerView, di mana setiap item berisi nama, NIS, dan kelas siswa yang datanya dihubungkan melalui StudentAdapter.
- Hasil:
<img src="https://github.com/user-attachments/assets/0933b120-a177-4aa5-b3d6-3151334de93f" width="300"/>



- Setiap item memiliki tombol Edit dan Hapus (bisa mengubah data siswa dan bisa menghapus).
1. Melihat detail data siswa
<img width="1309" height="523" alt="image" src="https://github.com/user-attachments/assets/d5074732-fc10-4f12-9dab-7b3ea9d68089" />

- Penjelasan: Saat pengguna klik item RecyclerView (data siswa), akan muncul dialog "Lihat Detail?" kalau pilih “Lihat”, maka akan pindah ke halaman detail (DetailActivity) dan dapat memperlihatkan data siswa yang diklik.
- Hasil:
<img src="https://github.com/user-attachments/assets/7d7e4b49-399d-44f2-bc60-7c7bcc09fa33" width="300"/>

2. Hapus data siswa
<img width="1221" height="494" alt="image" src="https://github.com/user-attachments/assets/beec2c99-37e4-44aa-bf71-013f8077d99a" />

- Penjelasan: Untuk menghapus salah satu siswa dari list RecyclerView setelah dikonfirmasi lewat dialog.
- Hasil:
<img src="https://github.com/user-attachments/assets/30d1f112-d00d-4a77-9c83-a4eee469efea" width="300"/>

3. Edit data siswa
<img width="1172" height="424" alt="image" src="https://github.com/user-attachments/assets/a7fc37b4-2020-4733-ac3e-e178b51557cc" />

- Penjelasan: Kode ini bikin tombol Edit di tiap item siswa bisa membuka halaman AddEditActivity buat mengubah data siswa, sambil ngirim data siswa yang dipilih + posisi datanya di list.
- Hasil:
<img src="https://github.com/user-attachments/assets/4ee91ebf-3f92-4c17-b74b-db64108da669" width="300"/>

<img src="https://github.com/user-attachments/assets/48ce5989-e3fe-4dfd-815f-045723d4a6e5" width="300"/>


- Menambahkan gambar, NIS, dan kelas setiap siswa.
Pada bagian ini, saat sebelum dibuat CRUD, sistem otomatis di adakan opsi NIS, Kelas yang nantinya pengguna tinggal mengisinya saja. Bagian gambar, gambar di setting otomatis dengan gambar yang sudah di sesuaikan, atau jika ingin diganti gambar lain, maka harus di ganti langsung di dalam res>drawable.

- Menambahkan data siswa
<img width="1005" height="264" alt="Screenshot 2025-08-06 185137" src="https://github.com/user-attachments/assets/1f376eaa-0401-4f59-b44b-b77985985408" />


- Penjelasan:
1. val btnTambah: Button = findViewById(R.id.btnTambah)
Ini mengambil tombol "Tambah" dari layout XML (yang ID-nya btnTambah). Disimpan ke variabel btnTambah.
2. btnTambah.setOnClickListener { ... }
Ini membuat tombol bisa diklik. Saat diklik, akan menjalankan kode di dalam { ... }.
3. Intent(this, AddEditActivity::class.java)
Ini bikin Intent, yaitu "surat jalan" untuk pindah dari MainActivity ke AddEditActivity. Tujuannya untuk buka halaman tambah data siswa.
4. startActivityForResult(intent, REQUEST_ADD)
Fungsi ini memulai aktivitas baru (AddEditActivity) dan menunggu hasil baliknya. REQUEST_ADD itu semacam kode/nama untuk menandai bahwa kamu sedang menambahkan data baru. Setelah halaman tambah ditutup, hasilnya akan dikembalikan ke MainActivity (biasanya data siswa baru yg ditambah).

- Hasil:
<img src="https://github.com/user-attachments/assets/046d02e8-5b79-4708-9410-f6324e2cdefb" width="300"/>

## Kesimpulan
Melalui projek ini, kami mendapatkan tambahan ilmu bagaimana cara  untuk mengimplementasikan RecyclerView dalam menampilkan data siswa secara dinamis, serta mempelajari alur pengolahan data menggunakan adapter, intent antar activity, dan interaksi pengguna seperti tambah, edit, hapus, dan melihat detail data. Proyek ini dapat menambah wawasan pemahaman kami dalam membangun aplikasi Android, yang di buat di Android Studio.
