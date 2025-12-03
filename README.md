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
4.  Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main 
(mulai dari program dijalankan sampai daftar menu tampil di layar). 
Jawaban:Ketika program dijalankan, pertama komputer akan mengeksekusi bagian main() karena itulah titik awal program. Di dalam main(), terdapat perintah untuk memanggil fungsi menu(). Saat perintah itu dijalankan, alur program berpindah dari main() ke fungsi menu(), kemudian semua perintah System.out.println() di dalam fungsi tersebut dijalankan sehingga daftar menu tampil di layar. Setelah semua baris di fungsi menu() selesai dieksekusi, alur program kembali lagi ke main() dan melanjutkan perintah berikutnya (jika ada).

Pertanyaan Percobaan 2
1. Apakah kegunaan parameter di dalam fungsi? 
Jawaban: Parameter dalam fungsi digunakan sebagai tempat menerima data dari luar fungsi, sehingga fungsi bisa bekerja lebih fleksibel dan tidak hanya bergantung pada nilai yang sudah ditulis di dalamnya. Dengan parameter, satu fungsi bisa digunakan untuk berbagai input berbeda tanpa harus menulis ulang kodenya.
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter 
namaPelanggan dan isMember? 
Jawaban: Fungsi menu() menggunakan parameter namaPelanggan dan isMember karena menu yang ditampilkan tidak hanya bersifat statis, tetapi juga perlu menyesuaikan informasi yang diberikan pengguna. Parameter namaPelanggan digunakan agar program bisa memberikan sapaan yang berbeda untuk setiap orang, sedangkan parameter isMember digunakan untuk menentukan apakah pelanggan berhak mendapatkan informasi tentang diskon atau tidak. Dengan cara ini, fungsi menjadi lebih fleksibel karena dapat menampilkan menu dengan konteks yang berbeda sesuai data yang dikirim dari main().
3. Apakah parameter sama dengan variabel? Jelaskan.
Jawaban: Parameter mirip dengan variabel, tetapi keduanya tidak sepenuhnya sama. Parameter adalah variabel khusus yang digunakan untuk menerima nilai ketika fungsi dipanggil. Jadi, parameter baru mendapatkan nilai saat fungsi dipanggil, sedangkan variabel biasa langsung diberi nilai di dalam program tanpa perlu pemanggilan fungsi. Singkatnya, parameter adalah variabel yang digunakan sebagai penampung nilai kiriman dari luar fungsi.
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa 
perbedaan output ketika isMember bernilai true dan ketika false? 
Jawaban: Parameter isMember digunakan untuk mengecek status pelanggan melalui kondisi if. Saat nilainya true, program menampilkan informasi bahwa pelanggan mendapat diskon karena member. Namun, jika nilainya false, bagian pesan diskon tidak ditampilkan. Jadi, output yang muncul akan berbeda tergantung status member pelanggan tersebut.




