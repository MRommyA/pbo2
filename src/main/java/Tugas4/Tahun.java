package Tugas4;

import java.util.Scanner;

public class Tahun {
    int tahun;
    
    Scanner input = new Scanner(System.in);
    
    public void output(){
        System.out.print("\nMasukkan tahun: ");
        this.tahun = input.nextInt();
        if(tahun % 4 == 0){
            System.out.println(tahun + " merupakan tahun kabisat");
        }else{
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}
