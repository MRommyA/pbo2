package Tugas5;

import java.util.Scanner;

public class Floyd {
    int n;
    
    Scanner input = new Scanner(System.in);
    
    public void output(){
        System.out.print("\nMasukkan banyak baris : ");
        this.n = input.nextInt();
        
        int angka = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((angka++) + "\t");
            }
            System.out.println();
        }
    }
    
}
