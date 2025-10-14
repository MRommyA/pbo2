package Tugas2;

public class KonversiSuhu {
    double c;
    double f;
    double r;
    
    KonversiSuhu(double c, double f, double r){
        this.c = c;
        this.f = f;
        this.r = r;
    }
    
    double cTof(){
        return 9 * c / 5 + 32;
    }
    
    double cTor(){
        return 4 * c / 5;
    }
    
    double fToc(){
        return 5 * (f - 32) / 9;
    }
    
    double fTor(){
        return 4 * (f - 32) / 9;
    }
    
    double rToc(){
        return 5 * r / 4;
    }
    
    double rTof(){
        return 9 * r / 4 + 32;
    }
    
    void output(){
        System.out.println("\n" + c + " C = " + cTof() + " F");
        System.out.println(f + " F = " + fToc() + " C");
        System.out.println(c + " C = " + cTor() + " R");
        System.out.println(r + " R = " + rToc() + " C");
        System.out.println(f + " F = " + fTor() + " R");
        System.out.println(r + " R = " + rTof() + " F");
    }
    
}
