package Tugas2;

public class BelajarJava {
    String a;
    String b;
    
    BelajarJava(String a){
        this.a = a;
        this.b = a;
    }
    
    String LowerCase(){
        return a.toLowerCase();
    }
    
    String UpperCase(){
        return b.toUpperCase();
    }
    
    void output(){
        System.out.println("\n" + a + " -> " + LowerCase());
        System.out.println(b + " -> " + UpperCase());
    }
    
}
