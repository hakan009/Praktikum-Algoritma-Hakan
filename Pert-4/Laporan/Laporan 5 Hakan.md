# **JOBSHEET IV**
## **Brute Force dan Divide & Conquer**

# **4.1 Tujuan Praktikum**

Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Mahasiswa mampu membuat algoritma bruteforce dan divide-conquer
2. Mahasiswa mampu menerapkan penggunaan algorima bruteforce dan divide-conquer

# **4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer**

Perhatikan Diagram Class berikut ini :

| Faktorial |
| --------- |
| nilai : int |
| faktorialBF(): int |
| faktorialDC(): int |


Berdasarkan diagram class di atas, akan dibuat program class dalam Java. Untuk menghitung nilai 
faktorial suatu angka menggunakan 2 jenis algoritma, Brute Force dan Divide and Conquer. Jika 
digambarkan terdapat perbedaan proses perhitungan 2 jenis algoritma tersebut sebagai berikut :
Tahapan pencarian nilai faktorial dengan algoritma Brute Force :

<img src = "coba 4-1 (1).png">

Tahapan pencarian nilai faktorial dengan algoritma Divide and Conquer :

<img src = "coba 4-1 (2).png">

## **4.2.1 Langkah-langkah Percobaan**

1. Buat Project baru, dengan nama “BruteForceDivideConquer”. Buat package dengan nama 
minggu5.
2. Buatlah class baru dengan nama Faktorial
3. Lengkapi class Faktorial dengan atribut dan method yang telah digambarkan di dalam diagram 
class di atas, sebagai berikut:           
a) Tambahkan atribut nilai      
<img src = "coba 4-1 (3).png">  
b) Tambahkan method faktorialBF() nilai 
<img src = "coba 4-1 (4).png">  
c) Tambahkan method faktorialDC() nilai
<img src = "coba 4-1 (5).png">  

4. Coba jalankan (Run) class Faktorial dengan membuat class baru MainFaktorial.

    a) Di dalam fungsi main sediakan komunikasi dengan user untuk menginputkan jumlah angka 
    yang akan dicari nilai faktorialnya
    <img src = "coba 4-1 (6).png">  
    b) Buat Array of Objek pada fungsi main, kemudian inputkan beberapa nilai yang akan 
    dihitung faktorialnya
    <img src = "coba 4-1 (7).png">  
    c) Tampilkan hasil pemanggilan method faktorialDC() dan faktorialBF()
    <img src = "coba 4-1 (8).png">  
    d) Pastikan program sudah berjalan dengan baik!

## **4.2.2 Verifikasi Hasil Percobaan**

Cocokkan hasil compile kode program anda dengan gambar berikut ini. 
<img src = "coba 4-1 (9).png">

## **4.2.3 Pertanyaan**

1. Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!
    - Jika n (nilai) = 1 maka n akan di return 1
    - Selainnya (else) maka n * (n-1) hingga n mencapai 1 sehingga kembali ke if (return 1)

2. Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan 
divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!
    - Lengkap
    - Divide = if dan else nya dan n dengan (n-1)
    - Conquer = n dengan (n-1) hingga menjadi n=1
    - Combine = Setelah n menjadi 1 maka return 1 sehingga faktorial didapatkan

3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for? Buktikan!
    - Memungkinan, contoh dengan while loop
    - <img src = "jawab1 (1).png">
    - <img src = "jawab1 (2).png">

4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut!
    - <img src = "jawab1 (4).png">
    - <img src = "jawab1 (3).png">

5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?
    - <img src = "jawab1 (5).png">
    - <img src = "jawab1 (6).png">
    - <img src = "jawab1 (7).png">

# **4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer**

Pada praktikum ini kita akan membuat program class dalam Java. Untuk menghitung nilai pangkat 
suatu angka menggunakan 2 jenis algoritma, Brute Force dan Divide and Conquer.

## **4.3.1 Langkah-langkah Percobaan**

1. Di dalam paket minggu5, buatlah class baru dengan nama Pangkat. Dan di dalam class Pangkat 
tersebut, buat atribut angka yang akan dipangkatkan sekaligus dengan angka 
<img src = "coba 4-2 (1).png">

2. Pada class Pangkat tersebut, tambahkan method PangkatBF()
<img src = "coba 4-2 (2).png">

3. Pada class Pangkat juga tambahkan method PangkatDC()
<img src = "coba 4-2 (3).png">

4. Perhatikan apakah sudah tidak ada kesalahan yang muncul dalam pembuatan class Pangkat

5. Selanjutnya buat class baru yang di dalamnya terdapat method main. Class tersebut dapat 
dinamakan MainPangkat. Tambahkan kode pada class main untuk menginputkan jumlah nilai 
yang akan dihitung pangkatnya.
<img src = "coba 4-2 (4).png">

6. Nilai pada tahap 5 selanjutnya digunakan untuk instansiasi array of objek. Di dalam Kode berikut 
ditambahkan proses pengisian beberapa nilai yang akan dipangkatkan sekaligus dengan 
pemangkatnya.
<img src = "coba 4-2 (5).png">

7. Kemudian, panggil hasil nya dengan mengeluarkan return value dari method PangkatBF() dan 
PangkatDC().
<img src = "coba 4-2 (6).png">


## **4.3.2 Verifikasi Hasil Percobaan**
Pastikan output yang ditampilkan sudah benar seperti di bawah ini.
<img src = "coba 4-2 (7).png">

4.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
    - Brute Force = hasil dimulai dari 1 dengan hasil dikali nilai(a) hingga kurang dari n(pangkat)
    - Divide & Conquer =  hasil pangkat didapat dengan membagi dua (genap dan ganjil) dan jika pangkat (n) = 0 maka hasil pemangkatan adalah 1

2. Pada method PangkatDC() terdapat potongan program sebagai berikut:
```sh
if(n%2==1) //bilangan ganjil
    return (pangkatDC(a,n/2)*(a,n/2)*a);
else //bilangan genap
    return (pangkatDC(a,n/2)*(a,n/2));
```
Jelaskan arti potongan kode tersebut
- Jika bilangan genap maka angka dengan setengah pangkat akan dikali dengan angka dengan setengah pangkat, $4^4/2$ * $4^4/2$ = $4^2$ * $4^2$
- Sedangkan angka ganjil , misal $~4~^3/2$ * $~4~^3/2$ * 4 = $4^3$.

3. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
    - Sudah, dengan membagi 2 pangkat lalu di return dengan hasil

4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor.

5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!

# **4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer**

Di dalam percobaan ini, kita akan mempraktekkan bagaimana proses divide, conquer, dan 
combine diterapkan pada studi kasus penjumlahan keuntungan suatu perusahaan dalam beberapa 
bulan.

## **4.4.1 Langkah-langkah Percobaan**

1. Pada paket minggu5. Buat class baru yaitu class Sum. DI salam class tersebut terdapat beberapa 
atribut jumlah elemen array, array, dan juga total. Tambahkan pula konstruktor pada class Sum.
<img src = "coba 4-3 (1).png">
<img src = "coba 4-3 (2).png">


2. Tambahkan method TotalBF() yang akan menghitung total nilai array dengan cara iterative.
<img src = "coba 4-3 (3).png">

3. Tambahkan pula method TotalDC() untuk implementasi perhitungan nilai total array 
menggunakan algoritma Divide and Conquer
<img src = "coba 4-3 (4).png">

4. Buat class baru yaitu MainSum. Di dalam kelas ini terdapat method main. Pada method ini user 
dapat menuliskan berapa bulan keuntungan yang akan dihitung. Dalam kelas ini sekaligus dibuat 
instansiasi objek untuk memanggil atribut ataupun fungsi pada class Sum
<img src = "coba 4-3 (5).png">

5. Karena yang akan dihitung adalah total nilai keuntungan, maka ditambahkan pula pada method 
main mana array yang akan dihitung. Array tersebut merupakan atribut yang terdapat di class 
Sum, maka dari itu dibutuhkan pembuatan objek Sum terlebih dahulu.
<img src = "coba 4-3 (6).png">

6. Tampilkan hasil perhitungan melalui objek yang telah dibuat untuk kedua cara yang ada (Brute 
Force dan Divide and Conquer)
<img src = "coba 4-3 (7).png">


## **4.4.2 Verifikasi Hasil Percobaan**
Cocokkan hasil compile kode program anda dengan gambar berikut ini
<img src = "coba 4-3 (8).png">

## **4.4.3 Pertanyaan**

1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun 
TotalDC()
    - pangkatBF langsung menambah inputan, sedangkan pangkatDC membagi atau  memecah sebuah inputan lalu mengcombine lagi di akhir proses dan ada hasilnya 

2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di 
belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk 
kedua jenis algoritma tersebut.
    - Membagi masalah menjadi beberapa masalah kecil, menyelesaikan masing-masing masalah 
secara rekrusif dan menggabungkan sebuah solusi masalah sehingga membentuk sebuah 
solusi masalah semula

3. Mengapa terdapat formulasi return value berikut? Jelaskan!
```sh
return lsum+rsum+arr[mid];
```
    - Untuk mereturnkan semua hasil dari penjumlahan keuntungan dari lsum (penjumlahan left/kiri) lalu dengan rsum (penjumlahan right/kanan) dan dengan arr[mid] (penjumlahan mid/tengah), sehingga dari penjumlahan ketiganya bisa diketemukan berapa banyak keuntungan yang didapat dari perusahaan tersebut dalam rentang waktu n bulan.

4. Kenapa dibutuhkan variable mid pada method TotalDC()?
    - Karena perhitungan keuntungan pada method totalDC() tersebut membagi bagiannya menjadi left(l) dan right(r) dan dibutuhkan variable mid untuk menghitungan semua bagian tengahnya. Misalkan array = 1,2,3,4,5 maka l adalah indeks 0/awal dan r adalah indeks 4/terakhir dan l masih belum == dengan r maka dibagi menjadi 2 bagian dan mid = indeks 2 karena (l+r)/2. Lalu pada bagian left berarti dimulai dari indeks l(l=0) dan diakhiri indeks mid-1, sedangkan pada bagian right dimulai dari indeks mid dan diakhiri r (r=4). Dan terus menerus dibagi 2 hingga indeks l==r dan mereturnkan nilai tersebut.


5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. 
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa 
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program!
    - <img src = "jawab3 (1).png">
    - <img src = "jawab3 (2).png">
    - <img src = "jawab3 (3).png">
    - <img src = "jawab3 (4).png">

# **4.5 Latihan Praktikum**

1. Suatu Perguruan Tinggi di kota Malang sedang mengadakan pemilihan suara untuk memilih ketua 
BEM tahun 2022. Jika jumlah suara yang terkumpul diumpamakan selalu genap. Maka dengan 
inputan kandidat terpilih, carilah mayoritas jumlah suara untuk masing-masing kandidat. (Jumlah 
elemen array dan hasil pemilhan suara merupakan inputan user).

Elemen Mayoritas : Elemen mayoritas di dalam A adalah elemen yang terdapat pada lebih dari 
n/2 posisi. Contohnya, jika n=6 atau n=7 maka nilai mayoritas paling sedikit adalah 4. Berasal 
dari (7/2)+1 atau (6/2)+1). 

**Nilai mayoritas berbeda konsep dengan menghitung total suara terbanyak kandidat terpilih!**

Contoh : Hasil pemilihan suara sebagai berikut (m adalah mayoritas, nm adalah no mayoritas)
<img src = "Latprak 4 (1).png">
<img src = "Latprak 4 (2).png">

Karena n = 8, nilai mayoritas paling sedikit sejumlah 5 (8/2+1)

Keterangan : Warna Biru adalah proses **divide**, warna kuning dimulainya proses conquer, warna 
hijau dimulainya proses **combine**

<img src = "latprak4-5 (1).png">
<img src = "latprak4-5 (2).png">
<img src = "latprak4-5 (3).png">
