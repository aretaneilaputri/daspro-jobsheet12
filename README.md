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

Pertanyaan Percobaan 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return 
value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh 
dari program kafe pada Percobaan 3 untuk masing-masing kasus. 
Jawaban: Fungsi dalam pemrograman memiliki tujuan yang berbeda tergantung kebutuhan. Fungsi yang tidak mengembalikan nilai atau menggunakan void cocok digunakan ketika fungsinya hanya untuk melakukan suatu aksi, misalnya menampilkan menu kafe, ucapan selamat datang, atau informasi promo, karena tidak ada nilai yang perlu dikirim kembali ke program utama. Sebaliknya, fungsi yang mengembalikan nilai diperlukan ketika hasil dari fungsi tersebut akan dipakai lagi, misalnya menghitung total harga pesanan. Nilai yang dikembalikan kemudian dapat disimpan di variabel dan digunakan untuk menampilkan hasil atau melakukan perhitungan lebih lanjut.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan 
pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua 
buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing 
parameter dalam konteks program kafe.
Jawaban: Fungsi hitungTotalHargaNoAbsen menghitung total harga pesanan berdasarkan menu dan jumlah item. Tipe kembalian fungsi ini int, karena hasil perhitungannya perlu dipakai di program utama. Parameter pilihanMenu menentukan menu yang dipilih, sedangkan jumlahPesanan menunjukkan berapa banyak item yang dibeli. Fungsi ini membantu program kafe menghitung total bayar secara otomatis sesuai pesanan pelanggan.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima 
kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari 
totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka 
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode 
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga 
totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta 
menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga 
pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 
sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis 
menu)?  

Pertanyaan Percobaan 4
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... 
namaPengunjung!
Jawaban: Penulisan parameter String... namaPengunjung digunakan karena di bagian ini jumlah nama yang dimasukkan tidak selalu sama setiap pemanggilan fungsi. Kadang hanya satu nama, kadang banyak. Dengan varargs, program bisa menampung semua nama tanpa perlu menentukan jumlah parameternya dari awal. Jadi lebih fleksibel, simpel, dan tetap bekerja meskipun jumlah input berbeda-beda.
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban 
Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
Jawaban:Tidak, Java tidak mengizinkan dua varargs dalam satu fungsi karena bisa membuat program bingung membedakan data mana yang masuk ke varargs pertama dan mana yang masuk ke varargs kedua. Aturannya, satu fungsi hanya boleh punya satu varargs dan harus diletakkan di posisi paling akhir. Namun, varargs masih bisa digabung dengan parameter biasa selama posisinya tetap di akhir.
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. 
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? 
Jika tetap berjalan, bagaimana output yang dihasilkan?
Jawaban: Jika fungsi daftarPengunjung dipanggil tanpa argumen, program tetap berjalan dan tidak terjadi error, baik saat kompilasi maupun saat dijalankan. Hal ini karena varargs (String...) secara otomatis dianggap sebagai array kosong jika tidak ada data yang diberikan. Output yang muncul tetap menunjukkan judul daftar, tetapi tidak ada nama yang ditampilkan di bawahnya.

Pertanyaan Percobaan 5
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program 
dijalankan hingga menampilkan luas persegi panjang dan volume balok! 
Jawaban: 
1.Program dimulai pada method main() setelah dijalankan.
2.Program menyiapkan scanner untuk menerima input dari pengguna.
3 User memasukkan nilai panjang, lalu program menyimpannya ke variabel p.
4.User memasukkan nilai lebar, lalu disimpan ke variabel l.
5.User memasukkan nilai tinggi, lalu disimpan ke variabel t.
6.Program memanggil fungsi hitungLuas(p, l), lalu fungsi menghitung p * l dan mengembalikan hasilnya ke variabel L.
7.Program menampilkan hasil luas persegi panjang menggunakan nilai L.
8.Program memanggil fungsi hitungVolume(t, p, l), fungsi ini memanggil hitungLuas() lagi untuk menghitung luas, lalu mengalikannya dengan tinggi untuk mendapatkan volume.
9.Hasil perhitungan volume dikembalikan ke variabel vol.
10.Program menampilkan volume balok.
11.Scanner ditutup dan program selesai.
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna 
memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur 
jalannya program sampai output tersebut muncul.
Jawaban:output yang dihasilkan jika pengguna memasukkan:output yang dihasilkan jika pengguna memasukkan:
panjang = 4, lebar = 3, dan tinggi = 5 adalah:
Masukkan panjang
4
Masukkan lebar
3
Masukkan tinggi
5
Luas persegi adalah 12
Volume balok adalah 60
alur programnya:
Ketika program dijalankan, pengguna diminta memasukkan nilai panjang, lebar, dan tinggi. Setelah nilai dimasukkan, program memanggil fungsi hitungLuas(4, 3) yang menghitung luas persegi panjang dengan rumus 4 × 3 = 12, lalu hasilnya ditampilkan. Setelah itu, program memanggil fungsi hitungVolume(5, 4, 3) yang menghitung volume balok menggunakan luas yang sudah dihitung dan dikalikan dengan tinggi: 12 × 5 = 60. Hasil volume kemudian ditampilkan ke layar. Setelah semua perhitungan selesai, program berakhir.
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program 
tersebut!
Jawaban: Alur program:
1.Program dimulai dari method main().
2.Di dalam main, program memanggil fungsi Jumlah(1, 1) yang menghitung 1 + 1 dan hasilnya temp = 2.
3.Selanjutnya program memanggil fungsi TampilJumlah(temp, 5), berarti sebenarnya memanggil TampilJumlah(2, 5).
4.Di dalam TampilJumlah, program memanggil TampilHinggaKei(Jumlah(2, 5)).
5.Fungsi Jumlah(2, 5) menghitung 2 + 5 = 7.
6.Lalu program menjalankan TampilHinggaKei(7), yang mencetak angka dari 1 sampai 7 tanpa spasi.
7.Maka output akhirnya adalah:1234567
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? 
Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? 
Jelaskan! 
Jawaban:Penggunaan parameter atau nilai kembalian tergantung pada kebutuhan fungsi tersebut.
Fungsi perlu menggunakan parameter ketika fungsi membutuhkan data dari luar agar bisa diproses, misalnya menghitung luas berdasarkan panjang dan lebar. Jika fungsi tidak perlu data tambahan dan hanya menampilkan sesuatu yang sama setiap kali dipanggil (misalnya menampilkan menu), maka parameter tidak diperlukan.
Sedangkan untuk nilai kembalian, fungsi harus memilikinya ketika hasil perhitungan atau proses di dalam fungsi masih dibutuhkan untuk proses lanjutan, seperti menghitung total harga lalu dipakai kembali. Jika fungsi hanya menampilkan output ke layar dan hasilnya tidak perlu digunakan lagi oleh bagian program lain, maka fungsi tidak perlu nilai kembalian dan cukup menggunakan void.
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi 
boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume 
di Percobaan 5. 
Jawaban: Fungsi sebaiknya menggunakan parameter ketika nilai yang digunakan bisa berbeda-beda setiap kali fungsi dipanggil, seperti hitungLuas dan hitungVolume di percobaan 5 yang membutuhkan panjang, lebar, dan tinggi dari pengguna. Karena nilainya tidak tetap, maka fungsi harus memakai parameter.
Sebaliknya, fungsi boleh tanpa parameter jika tugasnya tetap sama meskipun dipanggil berulang kali, dan tidak membutuhkan input tambahan, misalnya fungsi hanya menampilkan teks atau menu yang tidak berubah.







