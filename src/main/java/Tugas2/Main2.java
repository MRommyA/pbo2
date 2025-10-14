package Tugas2;

public class Main2 {
    public static void main(String[] args) {
        
        
        Increment increment = new Increment(5, 5);
        increment.output();
        
        PersegiPanjang persegipanjang = new PersegiPanjang(50, 45);
        persegipanjang.output();
        
        PersamaanKuadrat persamaankuadrat = new PersamaanKuadrat(2, 10, 5);
        persamaankuadrat.output();
        
        OperasiMatematika operasimatematika = new OperasiMatematika(22, 33);
        operasimatematika.output();
        
        Segitiga segitiga = new Segitiga(6, 8);
        segitiga.output();
        
        BelajarJava belajarjava = new BelajarJava("Saya Belajar Java");
        belajarjava.output();
        
        JarakBumi jarakbumi = new JarakBumi(384400, 152100000);
        jarakbumi.output();
        
        KonversiSuhu konversisuhu = new KonversiSuhu(10, 15, 5);
        konversisuhu.output();
        
    }
}
