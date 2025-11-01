package Tugas5;

import java.util.Scanner;



public class Ratarata {
    int n;
    double bilangan;
    
    Scanner input = new Scanner(System.in);
    
    public void output(){
        System.out.print("\nMasukkan jumlah bilangan : ");
        this.n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Masukkan bilangan ke-" + (i+1) + " : ");
            this.bilangan += input.nextDouble();
        }
        System.out.println("Total jumlah bilangan = " + bilangan);
        System.out.println("Rata-rata total bilangan = " + bilangan/n);
    }
}
