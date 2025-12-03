# daspro-jobsheet12
Pertanyaan Percobaan 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
Jawaban:Tidak, fungsi tanpa parameter tidak harus bertipe void. Yang menentukan sebuah fungsi bertipe void atau bukan adalah apakah fungsi tersebut mengembalikan nilai atau tidak, bukan karena ada atau tidak adanya parameter. Jika sebuah fungsi tidak mengembalikan nilai, maka tipe kembalian yang digunakan adalah void. Namun, bila fungsi tersebut menghasilkan suatu nilai, seperti angka, teks, atau data lain, maka tipe pengembalian dapat berupa int, double, String, dan sebagainya, meskipun fungsi tersebut tidak memiliki parameter. Jadi, hal yang wajib dalam fungsi tanpa parameter hanyalah tanda kurung kosong () pada deklarasinya, sementara tipe kembalian tetap fleksibel sesuai kebutuhan program.
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi 
Menu()?
Jawaban:Ya, daftar menu pada program kafe tetap dapat ditampilkan meskipun tanpa menggunakan fungsi menu(). Fungsi hanya digunakan untuk mempermudah pemanggilan dan agar kode lebih rapi, terutama jika menu perlu ditampilkan berulang kali. Namun, jika hanya ingin menampilkan menu satu kali atau tidak ingin menggunakan fungsi, maka perintah System.out.println() yang menampilkan daftar menu dapat langsung dituliskan di dalam metode main(). Jadi, penggunaan fungsi menu() bukanlah kewajiban, melainkan pilihan untuk membuat program lebih terstruktur dan mudah.
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua 
perintah penampilan menu langsung di dalam fungsi main.
Jawaban: Menggunakan fungsi menu() lebih menguntungkan karena kode jadi lebih rapi dan tidak perlu menulis ulang bagian menu berkali-kali. Kalau nanti ada perubahan harga atau penambahan menu, cukup mengubah di satu tempat saja tanpa harus mencari di seluruh program. Jadi lebih praktis, mudah dibaca, dan lebih cepat diperbaiki.

