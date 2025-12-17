package Tugas10;

public class BujurSangkar extends Bentuk{
    float sisi;
    
    BujurSangkar(float sisi){
        this.sisi = sisi;
    }
    
    @Override
    float Luas(){
        return sisi*sisi;
    }
    
}
