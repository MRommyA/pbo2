package Tugas2;

public class Increment {
    int a;
    int b;
    
    Increment(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    void output(){
        System.out.print("Nilai a = " + a);
        System.out.println("\t\t\t\tNilai b = " + b);
        System.out.print("Nilai a++ = " + a++);
        System.out.println("\t\t\t\tNilai ++b = " + ++b);
        System.out.print("Nilai a setelah post-increment = " + a);
        System.out.println("\tNilai b setelah pre-increment = " + b);
    }
}
