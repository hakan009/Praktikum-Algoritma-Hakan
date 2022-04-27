# **JOBSHEET VIII**
# **QUEUE**

# **8.1 Tujuan Praktikum**

Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Mengenal struktur data Queue
2. Membuat dan mendeklarasikan struktur data Queue
3. Menerapkan algoritma Queue dengan menggunakan array

# **8.2 Praktikum 1**
Waktu percobaan : 45 menit
Pada percobaan ini, kita akan mengimplementasikan penggunaan class Queue.

## **8.2.1 Langkah-langkah Percobaan**
1. Perhatikan Diagram Class Queue berikut ini:

| Queue |
| ------- |
| data : int [] |
| front : int |
| rear : int |
| size : int |
| max : int |
|  |
|  |
|Queue(n:int) |
|isFull(): boolean|
|isEmpty(): boolean|
|enqueue(dt: int): void|
|dequeue(): int|
|peek: void|
|print(): void|
|clear(): void|

2. Buat package dengan nama Praktikum1, kemudian buat class baru dengan nama Queue.

3. Tambahkan atribut-atribut Queue sesuai diagram class, kemudian tambahkan pula 
konstruktornya seperti gambar berikut ini

<img src = "queue1 (1).png">

4. Buat method IsEmpty bertipe boolean yang digunakan untuk mengecek apakah queue kosong.

<img src = "queue1 (2).png">

5. Buat method IsFull bertipe boolean yang digunakan untuk mengecek apakah queue sudah penuh.

<img src = "queue1 (3).png">

6. Buat method peek bertipe void untuk menampilkan elemen queue pada posisi paling depan.

<img src = "queue1 (4).png">

7. Buat method print bertipe void untuk menampilkan seluruh elemen pada queue mulai dari posisi
front sampai dengan posisi rear.

<img src = "queue1 (5).png">

8. Buat method clear bertipe void untuk menghapus semua elemen pada queue

<img src = "queue1 (6).png">

9. Buat method Enqueue bertipe void untuk menambahkan isi queue dengan parameter dt yang 
bertipe integer

<img src = "queue1 (7).png">

10. Buat method Dequeue bertipe int untuk mengeluarkan data pada queue di posisi belakang

<img src = "queue1 (8).png">

11. Selanjutnya, buat class baru dengan nama QueueMain tetap pada package Praktikum1. Buat 
method menu bertipe void untuk memilih menu program pada saat dijalankan.

<img src = "queue1 (9).png">

12. Buat fungsi main, kemudian deklarasikan Scanner dengan nama sc.

13. Buat variabel n untuk menampung masukan berupa jumlah maksimal elemen yang dapat 
disimpan pada queue.

<img src = "queue1 (10).png">

14. Lakukan instansiasi objek Queue dengan nama Q dengan mengirimkan parameter n sebagai 
kapasitas elemen queue

<img src = "queue1 (11).png">

15. Deklarasikan variabel dengan nama pilih bertipe integer untuk menampung pilih menu dari 
pengguna.

16. Lakukan perulangan menggunakan do-while untuk menjalankan program secara terus menerus 
sesuai masukan yang diberikan. Di dalam perulangan tersebut, terdapat pemilihan kondisi 
menggunakan switch-case untuk menjalankan operasi queue sesuai dengan masukan pengguna.

<img src = "queue1 (12).png">

17. Compile dan jalankan class QueueMain, kemudian amati hasilnya.

## **8.2.2 Verifikasi Hasil Percobaan**
Samakan hasil compile kode program Anda dengan gambar berikut ini.

<img src = "queue1 (13).png">


## **8.2.3 Pertanyaan**

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0?
- Artinya atribut front dan rear kosong. Jika diinisialisasi 0 maka artiya ada nilai di index 0 sedangkan -1 berarti tidak ada nilai di index manapun

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```sh
if(rear == max -1){
    rear =0;
}
```
- Artinya jika rear berada di tempat paling belakang indeks, maka jika ditambah nilai lagi rear akan berada di indeks 0

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```sh
if(front == max -1){
    front =0;
}
```
- Jika front berada di terakhir indeks dan jika dihapus nilai maka front akan berada di indeks 0 / terdepan

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front?
- Dikarenakan seperti no 3, front tidak selalu berada di depan bisa di tengah, atau di belakang indeks. Perulangan di mulai dari front

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
```sh
i = (i + 1) % max
```
- Memberitahu indeks sudah di indeks terakhir (max) sehingga jika iya akan dihentikan

6. Tunjukkan potongan kode program yang merupakan queue overflow!
- 
```sh
if(isFull()){
    System.out.println("Queue sudah penuh");
}
```

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan 
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi 
queue overflow dan queue underflow, program dihentikan!

<img src = "jawab1-7 (1).png">

<img src = "jawab1-7 (2).png">


# **8.3 Praktikum 2**

Waktu percobaan : 45 menit
Pada percobaan ini, kita akan membuat program yang mengilustrasikan teller di bank dalam 
melayani nasabah.

## **8.3.1 Langkah-langkah Percobaan**

1. Perhatikan Diagram Class berikut ini:

|Nasabah|
| ------ |
|norek: String|
|nama: String|
|alamat: String|
|umur: int|
|saldo: double|
| |
|Nasabah(norek: String, nama: String, alamat: String, umur: int, saldo: double)|

Berdasarkan diagram class tersebut, akan dibuat program class Nasabah dalam Java.

2. Buat package dengan nama Praktikum2, kemudian buat class baru dengan nama Nasabah.

3. Tambahkan atribut-atribut Nasabah seperti pada Class Diagram, kemudian tambahkan pula 
konstruktornya seperti gambar berikut ini.

<img src = "queue2 (1).png">

4. Salin kode program class Queue pada Praktikum 1 untuk digunakan kembali pada Praktikum 2
ini. Karena pada Praktikum 1, data yang disimpan pada queue hanya berupa array bertipe 
integer, sedangkan pada Praktikum 2 data yang digunakan adalah object, maka perlu dilakukan 
modifikasi pada class Queue tersebut.

5. Lakukan modifikasi pada class Queue dengan mengubah tipe int[] data menjadi Nasabah[] data
karena pada kasus ini data yang akan disimpan pada queue berupa object Nasabah. Modifikasi 
perlu dilakukan pada atribut, method Enqueue, dan method Dequeue.

<img src = "queue2 (2).png">

<img src = "queue2 (3).png">

<img src = "queue2 (4).png">

<img src = "queue2 (5).png">

Baris program Nasabah dt = new Nasabah(); akan ditandai sebagai error, untuk mengatasinya, 
tambahkan konstruktor default di dalam class Nasabah.

<img src = "queue2 (6).png">

6. Karena satu elemen queue terdiri dari beberapa informasi (norek, nama, alamat, umur, dan 
saldo), maka ketika mencetak data juga perlu ditampilkan semua informasi tersebut, sehingga 

<img src = "queue2 (7).png">

<img src = "queue2 (8).png">

meodifikasi perlu dilakukan pada method peek dan method print.
7. Selanjutnya, buat class baru dengan nama QueueMain tetap pada package Praktikum2. Buat 
method menu untuk mengakomodasi pilihan menu dari masukan pengguna

<img src = "queue2 (9).png">

8. Buat fungsi main, deklarasikan Scanner dengan nama sc

9. Buat variabel max untuk menampung kapasitas elemen pada queue. Kemudian lakukan 
instansiasi objek queue dengan nama antri dan nilai parameternya adalah variabel jumlah.

<img src = "queue2 (10).png">

10. Deklarasikan variabel dengan nama pilih bertipe integer untuk menampung pilih menu dari 
pengguna.

11. Tambahkan kode berikut untuk melakukan perulangan menu sesuai dengan masukan yang 
diberikan oleh pengguna.

<img src = "queue2 (11).png">

<img src = "queue2 (12).png">

12. Compile dan jalankan class QueueMain, kemudian amati hasilnya.

## **8.3.2 Verifikasi Hasil Percobaan**
Samakan hasil compile kode program Anda dengan gambar berikut ini.

<img src = "queue2 (13).png">

<img src = "queue2 (14).png">

## **8.3.3 Pertanyaan**
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
```sh
if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo !=
                            0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " 
                        + data.umur + " " + data.saldo);
                        break;
                    }
```
- Pengecekan data nasabah apakah sama dengan yang sudah dimasukkan, jika sama maka data akan di-dequeue

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!

<img src = "jawab2-2 (1).png">

<img src = "jawab2-2 (2).png">

<img src = "jawab2-2 (3).png">

# **8.4 Tugas**

1. Tambahkan dua method berikut ke dalam class Queue pada Praktikum 1:

a. Method **peekPosition(data: int) : void**

Untuk menampilkan posisi dari sebuah data di dalam queue, misalnya dengan mengirimkan 
data tertentu, akan diketahui posisi (indeks) data tersebut berada di urutan ke berapa

b. Method **peekAt(position: int) : void**

Untuk menampilkan data yang berada pada posisi (indeks) tertentu
Sesuaikan daftar menu yang terdapat pada class QueueMain sehingga kedua method tersebut 
dapat dipanggil!

<img src = "tug1q (1).png">

<img src = "tug1q (2).png">

<img src = "tug1q (3).png">

<img src = "tug1q (4).png">

<img src = "tug1q (5).png">

2. Buatlah program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan 
KRS pada dosen DPA di kampus. Ketika seorang mahasiswa akan mengantri, maka dia harus 
menuliskan terlebih dulu NIM, nama, absen, dan IPK seperti yang digambarkan pada Class 
diagram berikut:

|Mahasiswa|
| ------- |
|nim: String|
|nama: String|
|absen: int|
|ipk: double|
| |
|Mahasiswa(nim: String, nama: String, absen: int, ipk: double)|

Class diagram Queue digambarkan sebagai berikut:

|Queue|
|-----|
|antrian: Mahasiswa[]|
|front: int|
|rear: int|
|size: int|
|max: int|
||
|Queue(n: int)|
|isEmpty(): boolean|
|isFull(): boolean|
|enqueue(antri: Mahasiswa): void|
|dequeue(): int|
|print(): void|
|peek(): void|
|peekRear(): void|
|peekPosition(nim: String): void|
|printMahasiswa(posisi: int): void|

Keterangan:

 Method create(), isEmpty(), isFull(), enqueue(), dequeue() dan print(), kegunaannya sama seperti 
yang telah dibuat pada Praktikum

 Method peek(): digunakan untuk menampilkan data Mahasiswa yang berada di posisi antrian 
paling depan

 Method peekRear(): digunakan untuk menampilkan data Mahasiswa yang berada di posisi antrian 
paling belakang

 Method peekPosition(): digunakan untuk menampilkan posisi antrian ke berapa, seorang 
Mahasiswa berada. Pengecekan dilakukan berdasarkan NIM

 Method printMahasiswa(): digunakan untuk menampilkan data mahasiswa pada suatu posisi 
tertentu dalam antria

**Jawab**

<img src = "tug2q (1).png">

<img src = "tug2q (2).png">

<img src = "tug2q (3).png">

<img src = "tug2q (4).png">

<img src = "tug2q (5).png">

<img src = "tug2q (6).png">

<img src = "tug2q (7).png">

<img src = "tug2q (8).png">

<img src = "tug2q (9).png">

<img src = "tug2q (10).png">

<img src = "tug2q (11).png">

<img src = "tug2q (12).png">

<img src = "tug2q (13).png">
