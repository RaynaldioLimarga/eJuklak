# Penjelasan Cara Membuat Aplikasi

##Persiapan Markdown

Buat file-file markdown dengan menggunakan aplikasi dari [web dillinger](http://dillinger.io "Web Dillinger) agar tampilan dari kode markdown dapat langsung terlihat

![Buka Aplikasi E-juklak](manuals/dillinger.jpg)

Jika ada beberapa kesalahan, editor bisa langsung mengubah kode markdown dari github.

![Buka Aplikasi E-juklak](manuals/editdarigithub.jpg)

Setelah semua file markdown final, file-file markdown perlu dikonversi menjadi file-file html. Konversi file markdown menjadi html dilakukan dengan menggunakan aplikasi pandoc. Aplikasi pandoc dapat diakses melalui command prompt (cmd).

##Build .apk dari source code

Buka file E-Juklak yang terdapat di GitHub dengan IDE yang mendukung Android (Eclipse, Andorid Studio, etc).
Ganti HTML yang terdapat di E-Juklak/assets dengan html yang diinginkan (format penulisan html harus sama persis dengan format penulisan html hasil convert oleh pandoc)
Nama file html yang akan diganti harus sama persis dengan nama tiap file saat ini (bab1.html, bab2.html, etc)
Export project tersebut untuk mendapatkan .apk dari aplikasi tersebut
Aplikasi dapat berjalan di semua device Android
