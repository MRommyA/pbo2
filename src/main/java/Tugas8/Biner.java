package Tugas8;

public class Biner {
    int angka;

    Biner(int angka) {
        this.angka = angka;
    }

    String konversi() {
        return Integer.toBinaryString(angka);
    }
}
