package Tugas3;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerVSBufferReader {
    Scanner input = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void output() throws IOException{
        System.out.println("\nPerbedaan Scanner dan Buffered Reader");
        System.out.println("Scanner lebih mudah digunakan untuk input sederhana (langsung bisa parsing angka, string, dll)");
        System.out.println("BufferedReader lebih cepat dan efisien untuk membaca teks dalam jumlah besar, tapi parsing datanya harus dilakukan manual.");
        System.out.println("--Scanner--");
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        System.out.println("Hasil penjumlahan dari angka pertama dan angka kedua adalah " + (angka1+angka2));
        System.out.println("--Buffered Reader--");
        System.out.print("Masukkan angka pertama: ");
        String angka1br = br.readLine();
        System.out.print("Masukkan angka kedua: ");
        String angka2br = br.readLine();
        System.out.println("Hasil penjumlahan dari angka pertama dan angka kedua adalah " + (angka1br+angka2br));
    }
    
    
}
