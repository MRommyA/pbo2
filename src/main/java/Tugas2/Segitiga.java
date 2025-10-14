package Tugas2;

public class Segitiga {
    double a;
    double b;
    double c;
    
    Segitiga(double a, double b){
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a*a + b*b);
    }
    
    double LuasSegitiga(){
        return a*b / 2;
    }
    
    double KelilingSegitiga(){
        return a + b + c;
    }
    
    void output(){
        System.out.println("\nLuas Segitiga = " + LuasSegitiga());
        System.out.println("Nilai c = " + c);
        System.out.println("Keliling Segitiga = " + KelilingSegitiga());
        
    }
    
}
