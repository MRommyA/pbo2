package Tugas9;

public class Main {
    public static void main(String[] args) {
        new HewanDuaKaki().display();
        new HewanEnamKaki().display();
        new HewanEmpatKaki().display();
        new HewanDelapanKaki().display();
        
        System.out.println();
        
        HitungSegitiga s = new HitungSegitiga(4, 5);
        System.out.println("Luas: " + s.luas());
        
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        System.out.println("\nLuas Kubus: " + kubus.getLuas());
        
        System.out.println();
        
        Kucing h = new Kucing();
        h.nama = "Kucing";
        h.makan(h.display());
        
        System.out.println();
        
        Produk k = new Komik("Naruto", "Masashi Kishimoto", 15000);
        Produk g = new Games("Elden Ring", "Miyazaki", 120);

        k.getInfoProduk();
        g.getInfoProduk();
    }
}
