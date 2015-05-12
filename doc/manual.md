__Cara Menggunakan Aplikasi__

1. Buka aplikasi E-juklak

  ![Buka Aplikasi E-juklak](manuals/manual1.jpg)

2. Ketika aplikasi E-Juklak di buka akan muncul halaman awal dari E-Juklak.

  ![Halaman Awal E-Juklak](manuals/manual2.jpg)

  Pada halaman awal ini terdapat 3 fitur yaitu:
  - Fitur Read: fitur ini berfungsi untuk membaca isi dari juklak yang telah dikonversikan ke dalam bentuk html. Bila tombol read di klik, pengguna akan diarahkan pada halaman isi yang berfungsi untuk menampilkan isi dari dokumen juklak. Pada halaman ini juga terdapat fitur navigasi yang ditandai dengan lingkaran berwarna merah.

    ![Navigasi](manuals/manual3.jpg)

    Apabila tombol navigasi ini di tekan, maka user dapat melihat isi dari Bab dan sub-bab yang ada.

    ![Navigasi sub-bab](manuals/manual4.jpg)

    User dapat berpindah ke halaman yang dituju dengan menekan salah satu dari bab ataupun sub-bab yang ada. Sebagai contoh apabila user menekan sub-bab 3.1 seperti yang diperlihatkan pada gambar di bawah ini.

    ![Navigasi sub-bab](manuals/manual5.jpg)

    Maka halaman isi akan berpindah sesuai dengan bab ataupun sub-bab yang telah dipilih.

    ![Navigasi sub-bab](manuals/manual6.jpg)

  - Fitur Settings: fitur ini memiliki fungsi untuk mengatur ukuran dari teks yang akan dipergunakan. Terdapat 3 ukuran untuk mengatur ukuran teks yaitu small, medium, dan big.

    ![Setting Font](manuals/manual7.jpg)

    User juga bisa mengubah mode untuk membaca dengan mengaktifkan fitur night mode. Hasil perubahan yang telah dilakukan disimpan dengan menekan tombol save, sehingga perubahan pada ukuran teks dan mode baca dapat dilihat pada gambar di bawah ini.

    ![Setting Mode](manuals/manual8.jpg)

  - Fitur About us: fitur ini berfungsi untuk menampilkan informasi tentang pihak-pihak yang terlibat dalam pembuatan aplikasi E-Juklak.

    ![About Us](manuals/manual9.jpg)

__Cara mem-build aplikasi dari source code yang ada di repositori__

__Struktur program__

- Usecase Diagram

  ![Usecase Diagram](manuals/UseCase Diagram.jpg)

- Class Diagram

  ![Class Diagram](manuals/Class Diagram.jpg)
  
  Penjelasan tiap kelas:
  - AboutUs: Kelas yang merepresentasikan About Us.
  - Group: Kelas yang merepresentasikan sebuah bab dan sub-bab.
  - HomeActivity: Kelas yang merepresentasikan menu utama.
  - MenuAdapter: Kelas untuk memproses bab dan sub-bab sebagai parent atau child yg diimplementasikan oleh kelas group.
  - NavigationDrawerFragment: Kelas yang merepresentasikan sidebar menu.
  - Persistence: Kelas untuk menyimpan variabel global yang digunakan oleh kelas Settings.
  - Settings: Kelas yang merepresentasikan pengaturan aplikasi.
  - TagHtml: Kelas untuk mengolah file HTML.
  - WebviewActivity: Kelas yang digunakan untuk membaca file HTML dan ditampilkan pada layar.

- Sequence Diagram

  ![Sequence Diagram](manuals/Sequence Diagram.jpg)
