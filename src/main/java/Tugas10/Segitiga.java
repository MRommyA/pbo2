package Tugas10;

public class Segitiga extends Bentuk{
    float alas, tinggi;
    
    Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    float Luas(){
        return alas*tinggi/2;
    }
    
}
