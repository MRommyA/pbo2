package Tugas4;

import java.util.Scanner;

public class GanjilGenap {
    int angka;
    
    Scanner input = new Scanner(System.in);
    
    String validasi(int angka){
        if (angka % 2 == 0){
            return "Genap";
        }else{
            return "Ganjil";
        }
    }
    
    public void output(){
        System.out.println("Menentukan bilangan ganjil/genap");
        System.out.print("Masukkan angka: ");
        this.angka = input.nextInt();
        System.out.println("Angka " + angka + " merupakan bilangan " + validasi(angka));
    }
    
}
