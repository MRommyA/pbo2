package Tugas7;

public class Rekursif {
    long faktorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * faktorial(n - 1);
    }
}
