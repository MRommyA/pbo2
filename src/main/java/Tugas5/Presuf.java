package Tugas5;

public class Presuf {
    int i;
    
    public void output(){
        this.i = 1;
        System.out.println("\nNilai awal i = " + i);
        while(i<=5){
            System.out.println("i++ ke-" + i + " = " + (i++));
        }
        System.out.println();
        i = 1;
        while(i<=5){
            System.out.println("++i ke-" + i + " = " + (++i));
        }
    }
}
