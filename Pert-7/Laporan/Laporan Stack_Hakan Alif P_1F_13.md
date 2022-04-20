# **Jobsheet 7**
# **Stack**

# **7.1 Tujuan Praktikum**
Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Mengenal struktur data Stack
2. Membuat dan mendeklarasikan struktur data Stack
3. Menerapkan algoritma Stack dengan menggunakan array

# **7.2 Praktikum 1**
Waktu percobaan : 45 menit
Pada percobaan ini, kita akan membuat program yang mengilustrasikan tumpukan pakaian yang 
disimpan ke dalam stack. Karena sebuah pakaian mempunyai beberapa informasi, maka implementasi 
Stack dilakukan dengan menggunakan array of object untuk mewakili setiap elemennya.

## **7.2.1 Langkah-langkah Percobaan**
1. Perhatikan Diagram Class Pakaian berikut ini:

| Pakaian |
| ------- |
| jenis : String |
| warna : String |
| merk : String |
| ukuran : String |
| harga : double |
|  |
| |
| Pakaian(jenis: String, warna: String, merk: String, ukuran: String, harga: double) |

Berdasarkan diagram class tersebut, akan dibuat program class Pakaian dalam Java.

2. Buat package dengan nama Praktikum1, kemudian buat class baru dengan nama Pakaian.
3. Tambahkan atribut-atribut Pakaian seperti pada Class Diagram Pakaian, kemudian tambahkan 
pula konstruktornya seperti gambar berikut ini.
<img src = "prak1 (1).png">

4. Setelah membuat class Pakaian, selanjutnya perlu dibuat class Stack yang berisi atribut dan 
method sesuai diagram Class Stack berikut ini:

| Stack |
| ------- |
| size : int |
| top : int |
| data [] : pakaian |
| |
| |
| Stack(size:int) |
| isEmpty() : boolean |
| isFull() : boolean |
| push() : void |
| pop() : void |
| peek() : void |
| print() : void |
| clear{} : void |

**Keterangan**: Tipe **data** pada variabel data menyesuaikan dengan data yang akan akan disimpan 
di dalam Stack. Pada praktikum ini, data yang akan disimpan merupakan array of object dari 
Pakaian, sehingga tipe data yang digunakan adalah **Pakaian**

5. Buat class baru dengan nama Stack. Kemudian tambahkan atribut dan konstruktor seperti 
gambar berikut ini.

<img src = "prak1 (2).png">

6. Buat method IsEmpty bertipe boolean yang digunakan untuk mengecek apakah stack kosong
<img src = "prak1 (3).png">

7. Buat method IsFull bertipe boolean yang digunakan untuk mengecek apakah stack sudah terisi 
penuh.
<img src = "prak1 (4).png">

8. Buat method push bertipe void untuk menambahkan isi elemen stack dengan parameter pkn
yang berupa object Pakaian
<img src = "prak1 (5).png">

9. Buat method Pop bertipe void untuk mengeluarkan isi elemen stack. Karena satu elemen stack
terdiri dari beberapa informasi (jenis, warna, merk, ukuran, dan harga), maka ketika mencetak 
data juga perlu ditampilkan semua informasi tersebut
<img src = "prak1 (6).png">

10. Buat method peek bertipe void untuk memeriksa elemen stack pada posisi paling atas.
<img src = "prak1 (7).png">

11. Buat method print bertipe void untuk menampilkan seluruh elemen pada stack.
<img src = "prak1 (8).png">

12. Buat method clear bertipe void untuk menghapus seluruh isi stack.
<img src = "prak1 (9).png">

13. Selanjutnya, buat class baru dengan nama StackMain. Buat fungsi main, kemudian lakukan 
instansiasi objek dari class Stack dengan nama stk dan nilai parameternya adalah 5.
<img src = "prak1 (10).png">

14. Deklarasikan Scanner dengan nama sc

15. Tambahkan kode berikut ini untuk menerima input data Pakaian, kemudian semua informasi 
tersebut dimasukkan ke dalam stack
<img src = "prak1 (11).png">

Catatan: sintaks sc.nextLine() sebelum sintaks st.push(p) digunakan untuk mengabaikan karakter 
new line

16. Lakukan pemanggilan method print, method pop, dan method peek dengan urutan sebagai 
berikut.

<img src = "prak1 (12).png">

17. Compile dan jalankan class StackMain, kemudian amati hasilnya.

## **7.2.2 Verifikasi Hasil Percobaan**

<img src = "prak1 (13).png">

## **7.2.3 Pertanyaan**

1. Berapa banyak data pakaian yang dapat ditampung di dalam stack? Tunjukkan potongan kode 
program untuk mendukung jawaban Anda tersebut!
- <img src = "jawab1 (1).png">

2. Perhatikan class StackMain, pada saat memanggil fungsi push, parameter yang dikirimkan adalah 
p. Data apa yang tersimpan pada variabel p tersebut?
- data pakaian
- <img src = "jawab1 (3).png">

3. Apakah fungsi penggunaan do-while yang terdapat pada class StackMain?
- Untuk melakukan perulangan, memasukkan data pakaian hingga user menginputkan (n) untuk menambahkan data baru
- <img src = "jawab1 (2).png">

4. Modifikasi kode program pada class StackMain sehingga pengguna dapat memilih operasi-operasi pada stack (push, pop, peek, atau print) melalui pilihan menu program dengan 
memanfaatkan kondisi IF-ELSE atau SWITCH-CASE!
- <img src = "jawab1-4 (1).png">
- <img src = "jawab1-4 (2).png">
- <img src = "jawab1-4 (3).png">
- <img src = "jawab1-4 (4).png">
- <img src = "jawab1-4 (5).png">


# **7.3 Praktikum 2**
Pada percobaan ini, kita akan membuat program untuk melakukan konversi notasi infix menjadi 
notasi postfix.

## **7.3.1 Langkah-langkah Percobaan**

1. Perhatikan Diagram Class berikut ini:

| PostFix |
| ------- |
| n : int |
| top : int |
| stack : char[] |
| |
| |
| postfix(total:int) |
| push(c : char) : void |
| pop() : void |
| isOperand(c : char) : boolean |
| isOperator(c : char) : boolean |
| derajat(c : char) : int |
| konversi(Q : String) : String |

2. Buat package dengan nama Praktikum2, kemudian buat class baru dengan nama Postfix. 
Tambahkan atribut n, top, dan stack sesuai diagram class Postfix tersebut.

3. Tambahkan pula konstruktor berparameter seperti gambar berikut ini.
<img src = "prak2 (1).png">
<img src = "prak2 (2).png">

4. Buat method push dan pop bertipe void.
<img src = "prak2 (3).png">

5. Buat method IsOperand dengan tipe boolean yang digunakan untuk mengecek apakah elemen 
data berupa operand
<img src = "prak2 (4).png">

6. Buat method IsOperator dengan tipe boolean yang digunakan untuk mengecek apakah elemen 
data berupa operator.
<img src = "prak2 (5).png">

7. Buat method derajat yang mempunyai nilai kembalian integer untuk menentukan derajat 
operator.

<img src = "prak2 (6).png">

8. Buat method konversi untuk melakukan konversi notasi infix menjadi notasi postfix dengan cara 
mengecek satu persatu elemen data pada String Q sebagai parameter masukan.
<img src = "prak2 (7).png">

9. Selanjutnya, buat class baru dengan nama PostfixMain tetap pada package Praktikum2. Buat 
class main, kemudian buat variabel P dan Q. Variabel P digunakan untuk menyimpan hasil akhir 
notasi postfix setelah dikonversi, sedangkan variabel Q digunakan untuk menyimpan masukan 
dari pengguna berupa ekspresi matematika dengan notasi infix. Deklarasikan variabel Scanner 
dengan nama sc, kemudian panggil fungsi built-in trim yang digunakan untuk menghapus adanya 
spasi di depan atau di belakang teks dari teks persamaan yang dimasukkan oleh pengguna.
<img src = "prak2 (8).png">

Penambahan string “)” digunakan untuk memastikan semua simbol/karakter yang masih berada 
di stack setelah semua persamaan terbaca, akan dikeluarkan dan dipindahkan ke postfix.

10. Buat variabel total untuk menghitung banyaknya karaketer pada variabel Q.
<img src = "prak2 (9).png">

11. Lakukan instansiasi objek dengan nama post dan nilai parameternya adalah total. Kemudian 
panggil method konversi untuk melakukan konversi notasi infix Q menjadi notasi postfix P.
<img src = "prak2 (10).png">

12. Compile dan jalankan class PostfixMain dan amati hasilnya.

## **7.3.2 Verifikasi Hasil Percobaan**
<img src = "prak2 (11).png">

## **7.3.3 Pertanyaan**

1. Perhatikan class Postfix, jelaskan alur kerja method derajat!
- Alurnya = jika operand **'^'** maka mereturn 3 (prioritas), Jika operandnya **'*'** , **'/'** dan/atau **'%'** maka mereturn 2 , jika **'+'** atau **'-'** maka mereturn 1

2. Apa fungsi kode program berikut?
```sh
c = Q.charAt(i);
```
- Mengecek karakter (Operand dan Operator) satu per satu dan memisahkannya dengan tabel postfix dan stack sampai postfix selesai. char c untuk menampung karakternya

3. Jalankan kembali program tersebut, masukkan ekspresi 3*5^(8-6)%3. Tampilkan hasilnya!
- <img src = "jawab2.png">

4. Pada soal nomor 3, mengapa tanda kurung tidak ditampilkan pada hasil konversi? Jelaskan!
- karena tanda kurung hanya digunakan untuk prioritas di infix sedangkan di postfix sudah ada prioritas sendiri-sendiri. Tanda kurung hanya di keluarkan(pop) tanpa dimasukkan kedalam postfix.

# **7.4 Tugas**

1. Perhatikan dan gunakan kembali kode program pada Praktikum 1. Tambahkan method getMin
pada class Stack yang digunakan untuk mencari dan menampilkan data pakaian dengan harga 
terendah dari semua data pakaian yang tersimpan di dalam stack!
- <img src = "tug1 (1).png">
- <img src = "tug1 (2).png">
- <img src = "tug1 (3).png">


2. Setiap hari Minggu, Dewi pergi berbelanja ke salah satu supermarket yang berada di area 
rumahnya. Setiap kali selesai berbelanja, Dewi menyimpan struk belanjaannya di dalam laci. 
Setelah dua bulan, ternyata Dewi sudah mempunyai delapan struk belanja. Dewi berencana 
mengambil lima struk belanja untuk ditukarkan dengan voucher belanja.
Buat sebuah program stack untuk menyimpan data struk belanja Dewi, kemudian lakukan juga 
proses pengambilan data struk belanja sesuai dengan jumlah struk yang akan ditukarkan dengan 
voucher. Informasi yang tersimpan pada struk belanja terdiri dari:

 Nomor transaksi

 Tanggal pembelian

 Jumlah barang yang dibeli

 Total harga bayar

Tampilkan informasi struk belanja yang masih tersimpan di dalam stack

- <img src = "tug2 (1).png">
- <img src = "tug2 (2).png">
- <img src = "tug2 (3).png">
- <img src = "tug2 (4).png">
- <img src = "tug2 (5).png">
- <img src = "tug2 (6).png">
- <img src = "tug2 (7).png">
- <img src = "tug2 (8).png">
- <img src = "tug2 (9).png">
- <img src = "tug2 (10).png">

