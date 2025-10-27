package Tugas4;

public class Main4 {
    public static void main(String[] args){
        
        GanjilGenap ganjilgenap = new GanjilGenap();
        ganjilgenap.output();
        
        Hari hari = new Hari();
        hari.output();
        
        Gaji gaji = new Gaji();
        gaji.input();
        
        Tahun tahun = new Tahun();
        tahun.output();

        Salesman salesman = new Salesman();
        salesman.output();

        Kasir kasir = new Kasir();
        kasir.output();

        Luas luas = new Luas();
        luas.output();
        
    }
}
