package Tugas2;

public class PersegiPanjang {
    int panjang;
    int lebar;
    
    PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    int Luas(){
        return panjang * lebar;
    }
    
    void output(){
        System.out.println("\nLuas Persegi Panjang = " + panjang + " * " +  lebar + " = " + Luas());
    }
    
}
