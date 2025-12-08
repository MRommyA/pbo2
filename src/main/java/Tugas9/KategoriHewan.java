package Tugas9;

public class KategoriHewan {
    protected String kategori;

    public void display() {
        System.out.println(kategori);
    }
}

class HewanDuaKaki extends KategoriHewan {
    public HewanDuaKaki() {
        kategori = "hewan berkaki dua: kangguru, ayam, bebek, dll";
    }
}

class HewanEmpatKaki extends KategoriHewan {
    public HewanEmpatKaki() {
        kategori = "hewan berkaki empat: kucing, anjing, kuda, dll";
    }
}

class HewanEnamKaki extends KategoriHewan {
    public HewanEnamKaki() {
        kategori = "hewan berkaki enam: capung, nyamuk, kupu-kupu, dll";
    }
}

class HewanDelapanKaki extends KategoriHewan {
    public HewanDelapanKaki() {
        kategori = "hewan berkaki delapan: kepiting, belalang, laba-laba, dll";
    }
}
