package Tugas8;

public class Data {
    int[] angka = {6,12,24,48,96};
}

class Proses {
    void tampil(Data d) {
        for(int n : d.angka)
            System.out.print(n + " ");
    }
}
