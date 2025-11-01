package Tugas5;

import java.util.Scanner;

public class Minmax {
    int bilangan, max, min;
    
    Scanner input = new Scanner(System.in);
    
    public void output(){
        for(int i = 0; i < 10; i++){
            System.out.print("Masukkan bilangan ke-" + (i+1) + " : ");
            this.bilangan = input.nextInt();
            if(i == 0){
                this.max = bilangan;
                this.min = bilangan;
            }
            if(bilangan > max){
                this.max = bilangan;
            }else if(bilangan < min){
                this.min = bilangan;
            }
        }
        System.out.println("\nBilangan Terkecil = " + min);
        System.out.println("Bilangan Terbesar = " + max);
    }
}
