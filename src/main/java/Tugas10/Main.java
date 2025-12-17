package Tugas10;

public class Main {
    public static void main(String[] args) {
        Bentuk pp = new PersegiPanjang(5, 4);
        Bentuk bs = new BujurSangkar(4);
        Bentuk s = new Segitiga(4, 3);
        Bentuk l = new Lingkaran(10);
        
        System.out.println("Luas Persegi Panjang: " + pp.Luas());
        System.out.println("Luas Bujur Sangkar: " + bs.Luas());
        System.out.println("Luas Segitiga: " + s.Luas());
        System.out.println("Luas Lingkaran: " + l.Luas());
        
        System.out.println();
        
        new Universitas().tampilData();
        
        System.out.println();
        
        Produk k = new Komik("Naruto", "Masashi Kishimoto", 15000);
        Produk g = new Games("Elden Ring", "Miyazaki", 120);

        System.out.println(k.getInfoProduk());
        System.out.println(g.getInfoProduk());
        
        System.out.println();
        
        Kendaraan m = new Mobil("MPV-01", "Avanza", "MPV");
        Kendaraan p = new Pesawat("Boeing-777", "Garuda", "Jet");
        Kendaraan kl = new KapalLaut("KM-Tidar", "Pelni", "Penumpang");

        m.informasi();
        p.informasi();
        kl.informasi();
        
    }
    
}
