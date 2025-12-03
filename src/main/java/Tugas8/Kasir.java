package Tugas8;

public class Kasir {
    double harga, total;
    int jumlah;
    double diskon;

    Kasir(double harga) {
        this.total = harga;
    }

    Kasir(double harga, int jumlah) {
        this.total = harga * jumlah;
    }

    Kasir(double harga, int jumlah, double diskon) {
        this.total = harga * jumlah - (harga * jumlah * diskon / 100);
    }

    void tampil() {
        System.out.println("Total Bayar = " + total);
    }
}
