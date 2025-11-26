package Tugas7;

public class ClassObject {
    
    String nama;
    
    void belajar() {
        System.out.println(nama + " sedang belajar.");
    }
    
    void output(){
        System.out.println("Dalam pemrograman Java, kelas berfungsi sebagai blueprint yang mendefinisikan atribut dan perilaku, "
                + "sedangkan objek merupakan instance nyata dari blueprint tersebut. "
                + "Proses pembentukan objek dimulai ketika kode Java dikompilasi menjadi bytecode dan dijalankan oleh JVM, "
                + "kemudian perintah new digunakan untuk mengalokasikan memori serta memanggil konstruktor guna menginisialisasi nilai awal. "
                + "Setelah terbentuk, objek dapat menyimpan data melalui atribut dan menjalankan aksi melalui method, "
                + "sehingga kelas yang bersifat abstrak berubah menjadi entitas konkret yang dapat digunakan dalam program.");
    }
}
