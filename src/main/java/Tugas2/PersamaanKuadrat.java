package Tugas2;

public class PersamaanKuadrat {
    int a;
    int b;
    int c;
    
    PersamaanKuadrat(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    int rumus(){
        return (b*b) - (4*a*c);
    }
    
    void output(){
        System.out.println("\nNilai persamaan kuadrat = " + rumus());
    }
    
}
