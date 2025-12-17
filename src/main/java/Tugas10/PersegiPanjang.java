package Tugas10;

public class PersegiPanjang extends Bentuk{
    float panjang, lebar;
    
    PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    float Luas(){
        return panjang*lebar;
    }
    
}
