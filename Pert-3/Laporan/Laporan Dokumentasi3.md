# **Jobsheet 3**
## **Array of Object**



# **3.1 Tujuan Praktikum**

Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Memahami dan menjelaskan fungsi array yang berisikan variabel objek.
2. Mahasiswa mampu menangkap logika tentang permasalahan array of object dalam Java.
3. Mahasiswa mampu menerapkan pembuatan array of object dalam Java.

# **3.2 Membuat Array dari Object, Mengisi dan Menampilkan**

Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat array dari object, 
kemudian mengisi dan menampilkan array tersebut.

## **3.2.1 Langkah-langkah Percobaan**
1. Buat Project baru, dengan nama **“ArrayObjects”**. Buat package dengan nama minggu3.

2. Buat class **PersegiPanjang**:

<img src = "soal1 (1).png">

3. Pada fungsi main yaitu pada class **ArrayObjects**, buatlah array **PersegiPanjang** yang berisi 3 
elemen:

<img src = "soal1 (2).png">

4. Kemudian isikan masing-masing atributnya

<img src = "soal1 (3).png">

5. Cetak ke layar semua atribut dari objek **ppArray**:

<img src = "soal1 (4).png">

6. Jalankan dan amati hasilnya.


## **3.2.2 Verifikasi Hasil Percobaan**

Cocokkan hasil compile kode program anda dengan gambar berikut ini. 

<img src = "soal1 (5).png">

## **3.2.3 Pertanyaan**

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
atribut dan sekaligus method?Jelaskan!

- Ya

- Karena, atribut digunakan untuk method untuk menghasilkan output

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan 
konstruktur pada baris program berikut :

<img src = "soal1 (6).png">

- Tidak dilakukan pemanggilan konstruktor

- Deklarasi Array of Object


3. Apa yang dimaksud dengan kode berikut ini:

<img src = "soal1 (7).png">

- Instansiasi Array of Object dengan banyak array yang bisa diisi adalah 3.

4. Apa yang dimaksud dengan kode berikut ini:

<img src = "soal1 (8).png">

- Deklarasi dan Instansiasi Objek dari Array of Object untuk mengisi-nya

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

- Agar program bisa dijalankan dan tidak terjadi error 


# **3.3 Menerima Input Isian Array Menggunakan Looping**

Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat 
menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi panjang yang 
ada di ppArray.


## **3.3.1 Langkah-langkah Percobaan**
1. Import scanner pada class ArrayObjects

<img src = "soal2 (1).png">
Note: Letakkan kode import dibawah kode package.


2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek 
Scanner untuk menerima input, kemudian melakukan looping untuk menerima input: 

<img src = "soal2 (2).png">

3. Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping 
untuk mengakses isi array ppArray dan menampilkannya ke layar:

<img src = "soal2 (3).png">

4. Jalankan dan amati hasilnya.


## **3.3.2 Verifikasi Hasil Percobaan**

Contoh verifikasi hasil percobaan ini.

<img src = "soal2 (4).png">

## **3.3.3 Pertanyaan**

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?

- Bisa

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!

```sh
class MapEntity
{
    private final ICellEntity[][] cellMap;

    public MapEntity(ICellEntity[][] cellMap){
        this.cellMap = cellMap;
    }
}
```

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa?

<img src = "soal2 (5).png">

- karena belum dideklarasikan pgArray[5].sisi nya seperti ppArray[i] = new PersegiPanjang();

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!

<img src = "Lat3 (5).png">

<img src = "Lat3 (6).png">

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

- Tidak bisa, karena Deklarasi dan Instansiasi Array of Object, Array pertama sudah dideklarasikan di i, sehingga jika ada 0, maka akan terjadi error.

# **3.4 Operasi Matematika Atribut Object Array**

Pada praktikum ini kita akan melakukan pengoperasian matematika beberapa atribut pada 
masing-masing anggota array.

## **3.4.1 Langkah-langkah Percobaan**

1. Buat package baru “ArrayBalok”.

2. Buat class Balok

<img src = "soal3 (1).png">

3. Pada fungsi main yaitu pada class ArrayBalok, buat array Balok yang berisi 3 elemen:

<img src = "soal3 (2).png">

4. Kemudian tambahkan kode berikut ini untuk mengisi array blArray menggunakan konstruktor 
dari class Balok:

<img src = "soal3 (3).png">

5. Tampilkan semua volume balok tersebut dengan cara memanggil method hitungVolume() di 
dalam looping seperti berikut ini:

<img src = "soal3 (4).png">

6. Jalankan dan amati hasilnya.

## **3.4.2 Verifikasi Hasil Percobaan**

Cocokkan hasil compile kode program anda dengan gambar berikut ini.

<img src = "soal3 (5).png">

## **3.4.3 Pertanyaan**

1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!

- Bisa 

- Konstruktor tanpa parameter dan dengan parameter

```sh
public class Persegi {
    public int sisi;
    
    public Persegi(int s){
        sisi = s;
    }

    public Persegi(){
        this.sisi;
    }
```

2. Jika diketahui terdapat class Segitiga seperti berikut ini

<img src = "soal3 (6).png">

Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut.

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut:

```sh
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10
```

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling().

<img src = "Lat3 (11).png">

<img src = "Lat3 (12).png">

<img src = "Lat3 (13).png">

# **3.5 Latihan Praktikum**

1. Buatlah program yang dapat menghitung luas permukaan dan volume beberapa bangun ruang 
(minimal 3, jenis bangun luas bebas). Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun 
ruang. Dan buat satu main class untuk membuat array of objek yang menginputkan atribut-atribut 
yang ada menggunakan konstruktor semua bangun ruang tersebut. 
Keterangan : Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan 
luas permukaan dan volume dari tiap jenis bangun ruang tersebut.

<img src = "Screenshot_1 (2).png">

<img src = "Screenshot_1 (3).png">

<img src = "Screenshot_1 (4).png">

<img src = "Screenshot_1 (5).png">

<img src = "Screenshot_1 (6).png">

<img src = "Screenshot_1 (7).png">

<img src = "Screenshot_1 (1).png">

2. Sebuah perusahaan jual beli tanah membutuhkan sebuah program yang dapat memberitahu luas 
tanah. Program tersebut dapat menerima input jumlah tanah yang akan dihitung dan atribut
panjang dan lebar masing-masing dari tanah yang diinputkan. Program dapat menampilkan luas 
tanah masing-masing tanah yang diinputkan tadi dan juga tanah terluas dari ketiga tanah yang 
ada. Contoh output program:

```sh
Jumlah tanah: 3
Tanah 1
Panjang: 100
Lebar: 40
Tanah 2
Panjang: 250
Lebar: 100
Tanah 3
Panjang: 120
Lebar: 100
Luas Tanah 1: 4000
Luas Tanah 2: 25000
Luas Tanah 3: 12000
Tanah terluas: Tanah 2
```

<img src = "Screenshot_2 (1).png">

<img src = "Screenshot_2 (2).png">

<img src = "Screenshot_2 (3).png">

<img src = "Screenshot_2 (4).png">


3. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, 
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi 
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika 
dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:

```sh
Masukkan data mahasiswa ke- 1
Masukkan nama :Rina
Masukkan nim :1234567
Masukkan jenis kelamin :P
Masukkan IPK :3.5
Masukkan data mahasiswa ke- 2
Masukkan nama :Rio
Masukkan nim :7654321
Masukkan jenis kelamin :L
Masukkan IPK :4.0
Masukkan data mahasiswa ke- 3
Masukkan nama :Reza
Masukkan nim :8765398
Masukkan jenis kelamin :L
Masukkan IPK :3.8
Data Mahasiswa ke-1
nama : Rina
nim : 1234567
Jenis kelamin : P
Nilai IPK : 3.5
Data Mahasiswa ke-2
nama : Rio
nim : 7654321
Jenis kelamin : L
Nilai IPK : 4.0
Data Mahasiswa ke-3
nama : Reza
nim : 8765398
Jenis kelamin : L
Nilai IPK : 3.8
```

<img src = "Screenshot_3 (1).png">

<img src = "Screenshot_3 (2).png">

<img src = "Screenshot_3 (3).png">

<img src = "Screenshot_3 (4).png">

