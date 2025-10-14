package Tugas2;

public class JarakBumi {
    double jarakBulan;
    double jarakMatahari;
    double c;
    
    JarakBumi(double jarakBulan, double jarakMatahari){
        this.jarakBulan = jarakBulan;
        this.jarakMatahari = jarakMatahari;
        this.c = 300000;
    }
    
    double jarakKeBulan(){
        return jarakBulan/c;
    }
    
    double jarakKeMatahari(){
        return jarakMatahari/c;
    }
    
    void output(){
        System.out.println("\nWaktu dari Bumi ke Bulan = " + jarakKeBulan() + " detik");
        System.out.println("Waktu dari Bumi ke Matahari = " + jarakKeMatahari() + " detik");
    }
    
}
