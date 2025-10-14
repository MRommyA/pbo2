package Tugas2;

public class OperasiMatematika {
    int x;
    int y;
    
    OperasiMatematika(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    int penjumlahan(){
        return x + y;
    }
    
    int pengurangan(){
        return x - y;
    }
    
    int perkalian(){
        return x * y;
    }
    
    float pembagian(){
        return (float)x / y;
    }
    
    void output(){
        System.out.println("\n" + x + " + " + y + " = " + penjumlahan());
        System.out.println(x + " - " + y + " = " + pengurangan());
        System.out.println(x + " * " + y + " = " + perkalian());
        System.out.println(x + " / " + y + " = " + pembagian());
    }
    
}
