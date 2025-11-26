package Tugas7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ClassObject mhs = new ClassObject();
        mhs.nama = "Rommy";
        mhs.output();
        mhs.belajar();
                
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 5;
        pp.lebar = 3;
        System.out.println("\nKeliling Persegi Panjang = " + pp.keliling());
        
        TanggalLahir tl = new TanggalLahir();
        System.out.println("\nBulan Tanggal Lahir = " + tl.tebak(1, 14));
        System.out.println();
        
        SumpahPemuda sp = new SumpahPemuda();
        System.out.print(sp.kalimat);
        sp.lanjut1();
        System.out.print(sp.kalimat);
        sp.lanjut2();
        System.out.print(sp.kalimat);
        sp.lanjut3();
        
        Rekursif faktorial = new Rekursif();
        System.out.println("\nFaktorial dari 4 = " + faktorial.faktorial(4));
        System.out.println();
        
        new Dosen("Budi").info();
        new Mahasiswaa("Sinta").info();
        new Staff("Rani").info();
        
        System.out.println();
        
        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("NPM : ");
        String npm = input.nextLine();

        System.out.print("Kelas : ");
        String kelas = input.nextLine();
        
        Mahasiswa m = new Mahasiswa(nama, npm, kelas);
        m.output();
        
    }
}

class Civitas {
    String nama;
    String status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void info() {
        System.out.println(nama + " - " + status);
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama, "Dosen");
    }
}

class Mahasiswaa extends Civitas {
    Mahasiswaa(String nama) {
        super(nama, "Mahasiswa");
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        super(nama, "Staff");
    }
}