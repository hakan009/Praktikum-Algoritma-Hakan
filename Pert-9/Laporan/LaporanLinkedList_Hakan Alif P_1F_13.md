# **JOBSHEET IX**

# **LINKED LIST**

# **1. Tujuan Praktikum**

Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Membuat struktur data linked list
2. Membuat linked list pada program
3. Membedakan permasalahan apa yang dapat diselesaikan menggunakan linked list

# **2. Praktikum**

## **2.1 Pembuatan Single Linked List**
 Waktu percobaan : 30 menit
Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat Single Linked List dengan 
representasi data berupa Node, pengaksesan linked list dan metode penambahan data.
1. Pada Project StrukturData yang sudah dibuat pada Minggu sebelumnya, buat package dengan 
nama minggu11

2. Tambahkan class-class berikut:
a. Node.java
b. SingleLinkedList.java
c. SLLMain.java

3. Implementasi class Node

<img src = "prak1l (1).png">

4. Tambahkan atribut pada class SingleLinkedList

<img src = "prak1l (2).png">

5. Sebagai langkah berikutnya, akan diimplementasikan method-method yang terdapat pada 
SingleLinkedList.

6. Tambahkan method isEmpty().

<img src = "prak1l (3).png">

7. Implementasi method untuk mencetak dengan menggunakan proses traverse.

<img src = "prak1l (4).png">

8. Implementasikan method addFirst().

<img src = "prak1l (5).png">

9. Implementasikan method addLast().

<img src = "prak1l (6).png">

10. Implementasikan method insertAfter, untuk memasukkan node yang memiliki data 
input setelah node yang memiliki data key.

<img src = "prak1l (7).png">

11. Tambahkan method penambahan node pada indeks tertentu.

<img src = "prak1l (8).png">

12. Pada class SLLMain, buatlah fungsi main, kemudian buat object dari class SingleLinkedList.

<img src = "prak1l (9).png">

13. Tambahkan Method penambahan data dan pencetakan data di setiap penambahannya agar 
terlihat perubahannya.

<img src = "prak1l (10).png">

## **2.1.1 Verifikasi Hasil Percobaan**

Cocokkan hasil compile kode program anda dengan gambar berikut ini.

<img src = "prak1l (11).png">

## **2.1.2 Pertanyaan**

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?

- dikarenakan memang kosong, langsung melakukan print tanpa memasukkan nilai apapun

2. Pada step 10, jelaskan kegunaan kode berikut

```
ndInput.next = temp.next;
temp.next = ndInput;
```

- Menyimpan variabel ndInput.next ke **temporary** dan temp.next memasukkannya ke dalam ndInput untuk agar data linked list tersebut diubah

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut

```
if(temp.next.next == null) tail = temp.next;
```

- Jika temp.next.next (**temporary** setelah setelahnya null) null, maka tail akan dimasukkan nilai dari temp.next

# **2.2 Modifikasi Elemen pada Single Linked List**

Waktu percobaan : 30 menit
Didalam praktikum ini, kita akan mempraktekkan bagaimana mengakses elemen, mendapatkan 
indeks dan melakukan penghapusan data pada Single Linked List.

## **2.2.1 Langkah-langkah Percobaan**

1. Implementasikan method untuk mengakses data dan indeks pada linked list

2. Tambahkan method untuk mendapatkan data pada indeks tertentu pada class Single 
Linked List

<img src = "prak2l (1).png">

3. Implementasikan method indexOf.

<img src = "prak2l (2).png">

4. Tambahkan method removeFirst pada class SingleLinkedList

<img src = "prak2l (3).png">

5. Tambahkan method untuk menghapus data pada bagian belakang pada class 
SingleLinkedList

<img src = "prak2l (4).png">

6. Sebagai langkah berikutnya, akan diimplementasikan method remove.

<img src = "prak2l (5).png">

7. Implementasi method untuk menghapus node dengan menggunakan index.

<img src = "prak2l (6).png">

8. Kemudian, coba lakukan pengaksesan dan penghapusan data di method main pada class 
SLLMain dengan menambahkan kode berikut

<img src = "prak2l (7).png">

9. Method SLLMain menjadi:

<img src = "prak2l (8).png">

10. Jalankan class SLLMain 

## **2.2.2 Verifikasi Hasil Percobaan**
Cocokkan hasil compile kode program anda dengan gambar berikut ini.

<img src = "prak2l (9).png">

## **2.2.3 Pertanyaan**

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!

- agar program dihentikan setelah menghapus datanya dan tidak dilanjutkan ke data lain

2. Jelaskan kegunaan kode dibawah pada method remove

```
else if(temp.next.data == key){
    temp.next = temp.next.next;
}
```

- Jika node punya data yang sama dengan key, maka posisi nya digantikan oleh node selanjutnya

3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud 
masing-masing kembalian tersebut!

- Jika temp = kosong maka mengembalikan index -1 yang berarti semua index tidak ada datanya. Selain itu akan mengembalikan index data yang di key

# **3. Tugas**

Waktu pengerjaan : 50 menit
1. Buat method insertBefore untuk menambahkan node sebelum keyword yang diinginkan

<img src = "insertbefore (1).png">

<img src = "insertbefore (2).png">

<img src = "insertbefore (3).png">


2. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah 
dipelajari sebelumnya untuk menginputkan data

<img src = "tug2.png">


<img src = "impstring (1).png">

<img src = "impstring (2).png">

<img src = "impstring (3).png">

<img src = "impstring (4).png">

<img src = "impstring (5).png">

<img src = "impstring (6).png">

3. Buatlah Implementasi Stack berikut menggunakan Single Linked List
<img src = "tug3.png">

<img src = "stackl (1).png">

<img src = "stackl (2).png">

<img src = "stackl (3).png">

<img src = "stackl (4).png">

<img src = "stackl (5).png">

<img src = "stackl (6).png">


4. Buatlah implementasi program antrian untuk mengilustasikan mahasiswa yang sedang meminta 
tanda tangan KRS pada dosen DPA di kampus pada tugas jobsheet 8 menggunakan LinkedList.
Implementasikan Queue pada antrian mahasiswa dengan menggunakan konsep LinkedList

<img src = "mahasiswal (1).png">

<img src = "mahasiswal (2).png">

<img src = "mahasiswal (3).png">

<img src = "mahasiswal (4).png">

<img src = "mahasiswal (5).png">

<img src = "mahasiswal (6).png">

<img src = "mahasiswal (7).png">

<img src = "mahasiswal (8).png">

<img src = "mahasiswal (9).png">

<img src = "hasilmhs (1).png">

<img src = "hasilmhs (2).png">

<img src = "hasilmhs (3).png">

<img src = "hasilmhs (4).png">
