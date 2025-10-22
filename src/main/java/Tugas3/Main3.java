package Tugas3;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        
        GajiBersih gajibersih = new GajiBersih("5520124014", "M Rommy Arianugraha", "Selakopi", "Manajer", 2000000, 300000, 200000, 150000);
        gajibersih.output();
        
        Pembelanjaan pembelanjaan = new Pembelanjaan();
        pembelanjaan.input();
        pembelanjaan.output();
        
        ScannerVSBufferReader scanvsbr = new ScannerVSBufferReader();
        scanvsbr.output();
        
        Sentripetal sentripetal = new Sentripetal();
        sentripetal.ioput();
        
        Buah buah = new Buah();
        buah.ioput();
        
        SelisihWaktu selisihwaktu = new SelisihWaktu();
        selisihwaktu.ioput();
        
        Novel novel = new Novel();
        novel.ioput();
        
    }
}
