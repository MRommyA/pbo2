package Tugas9;

public class Kubus {
    private int sisi;
    
    public void setSisi(int sisi){
        if(sisi <= 0){
            System.out.println("Sisi harus lebih dari 0");
        }else{
            this.sisi = sisi;
        }
    }
    
    public int getSisi(){
        return sisi;
    }
    
    private int luas(){
        return sisi * sisi * sisi;
    }
    
    public int getLuas(){
        return luas();
    }
    
}
