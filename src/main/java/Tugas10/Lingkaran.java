package Tugas10;

public class Lingkaran extends Bentuk{
    float phi, r;
    
    Lingkaran(float r){
        this.phi = 3.14f;
        this.r = r;
    }
    
    @Override
    float Luas(){
        return phi * r * r;
    }
    
}
