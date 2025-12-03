package Tugas8;

public class PersegiPanjang {
    int panjang, lebar;

    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    int luas() {
        return panjang * lebar;
    }
    
}

class Hitung {
    int hitam(PersegiPanjang besar, PersegiPanjang kecil) {
        return besar.luas() - kecil.luas();
    }
}