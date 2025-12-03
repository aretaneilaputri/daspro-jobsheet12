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
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter 
namaPelanggan dan isMember?
Jawaban: Jika fungsi Menu() dipanggil tanpa menyertakan parameter namaPelanggan dan isMember, maka program akan error (compile error). ini terjadi karena fungsi tersebut sudah didefinisikan dengan dua parameter, sehingga pemanggilannya harus sesuai dengan format tersebut. Dengan kata lain, Java tidak dapat menjalankan fungsi karena tidak ada data yang dikirim untuk mengisi parameter yang dibutuhkan.
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). 
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo 
adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang 
berlaku, tampilkan kode invalid.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan 
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris 
perintah pemanggilan fungsi menu yang benar. 
Jawaban: Perintah pemanggilan fungsi yang benar adalah menu("Budi", true, "DISKON30");
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember 
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan 
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? 
Jelaskan alasan Anda.
Jawaban: Iya,karena penggunaan parameter membuat program lebih mudah dibaca dan dikembangkan. Dengan adanya parameter namaPelanggan dan isMember, fungsi dapat digunakan untuk berbagai kondisi tanpa harus mengubah isi fungsi setiap kali ada pelanggan baru atau status berbeda. Program jadi lebih fleksibel, rapi, dan mudah diperbaiki karena nilai yang digunakan tidak dikunci di dalam fungsi, melainkan dikirim saat pemanggilan fungsi. Selain itu, jika nanti ada fitur tambahan seperti level member atau promo lain, fungsi dapat ditambah tanpa harus menulis ulang kode dari awal.





