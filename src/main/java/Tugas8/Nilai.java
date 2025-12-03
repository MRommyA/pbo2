package Tugas8;

public class Nilai {
    int[] data;

    Nilai(int... nilai) {
        this.data = nilai;
    }

    RataRata hitung() {
        int total = 0;
        for(int n : data) total += n;
        return new RataRata(total / data.length);
    }
}

class RataRata {
    int nilai;

    RataRata(int nilai) {
        this.nilai = nilai;
    }

    void tampil() {
        System.out.println("Rata-rata = " + nilai);
    }
}