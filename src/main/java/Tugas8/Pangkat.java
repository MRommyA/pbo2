package Tugas8;

public class Pangkat {
    int angka, pangkat;

    Pangkat(int angka, int pangkat) {
        this.angka = angka;
        this.pangkat = pangkat;
    }

    int hitung() {
        int hasil = 1;
        for(int i = 0; i < pangkat; i++) {
            hasil *= angka;
        }
        return hasil;
    }
}
