package Tugas8;

public class Faktorial {
    long nilai;

    Faktorial(int nilai) {
        this.nilai = nilai;
    }

    long hitung(long n) {
        if(n == 0 || n == 1){
            return 1;
        }
        return n * hitung(n-1);
    }
}
