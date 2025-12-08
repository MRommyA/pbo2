package Tugas9;

public class Produk {
    protected String judul, penulis;

    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void getInfoProduk() {
        System.out.println("Judul: " + judul
                + "\nPenulis: " + penulis);
    }
}

class Komik extends Produk {
    int jumlahHalaman;

    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void getInfoProduk() {
        System.out.println("Judul: " + this.judul
                + "\nPenulis: " + this.penulis
                + "\nJumlah Halaman: " + this.jumlahHalaman);
    }
}

class Games extends Produk {
    int waktuMain;

    public Games(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    public void getInfoProduk() {
        System.out.println("Judul: " + this.judul
                + "\nPenulis: " + this.penulis
                + "\nWaktu Main: " + this.waktuMain + " jam");
    }
}
