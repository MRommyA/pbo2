package Tugas8;

public class Main {
    public static void main(String[] args) {
        Faktorial f = new Faktorial(5);
        System.out.println(f.nilai + "! = " + f.hitung(f.nilai));
        
        Pangkat p = new Pangkat(2, 4);
        System.out.println("\nHasil = " + p.hitung());
        
        Biner b = new Biner(10);
        System.out.println("\nBiner = " + b.konversi());
        
        System.out.println();
        
        Kasir k1 = new Kasir(5000);
        Kasir k2 = new Kasir(5000, 4);
        Kasir k3 = new Kasir(5000, 4, 10);

        k1.tampil();
        k2.tampil();
        k3.tampil();
        
        PersegiPanjang luar = new PersegiPanjang(10, 5);
        PersegiPanjang dalam = new PersegiPanjang(8, 4);

        Hitung h = new Hitung();
        System.out.println("\nLuas hitam = " + h.hitam(luar, dalam));
        
        System.out.println();
        
        Nilai n = new Nilai(80,90,70,100);
        RataRata r = n.hitung();
        r.tampil();
        
        System.out.println();
        
        Data d = new Data();
        Proses proses = new Proses();
        proses.tampil(d);
        
    }
}
