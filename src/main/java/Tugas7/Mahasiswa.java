package Tugas7;

public class Mahasiswa {
    String nama;
    String npm;
    String kelas;

    public Mahasiswa(String nama, String npm, String kelas){
        this.nama = nama;  
        this.npm = npm;
        this.kelas = kelas;
    }

    void output(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NPM  : " + this.npm);
        System.out.println("Kelas: " + this.kelas);
    }
}
