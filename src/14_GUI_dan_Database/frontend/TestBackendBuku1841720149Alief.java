package frontend;

import backend.Buku1841720149Alief;
import backend.Kategori1841720149Alief;

public class TestBackendBuku1841720149Alief {
    public static void main(String[] args) {
        Kategori1841720149
    Alief novel = new Kategori1841720149
    Alief().getByIdAlief(1);
        Kategori1841720149
    Alief referensi = new Kategori1841720149
    Alief().getByIdAlief(2);

        Buku1841720149
    Alief buku1 = new Buku1841720149
    Alief(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720149
    Alief buku2 = new Buku1841720149
    Alief(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720149
    Alief buku3 = new Buku1841720149
    Alief(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
        buku1.saveAlief();
        buku2.saveAlief();

        // test update
        buku2.setmJudulAlief("Aljabar Linier");
        buku2.saveAlief();

        // test delete
        buku3.deleteAlief();

        // test select all
        for (Buku1841720149
    Alief b : new Buku1841720149
    Alief().getAllAlief()) {
            System.out.println("Kategori: " + b.getmKategoriAlief().getmNamaAlief() + ", Judul: " + b.getmJudulAlief());
        }

        // test search
        for (Buku1841720149
    Alief b : new Buku1841720149
    Alief().searchAlief("timun")) {
            System.out.println("Kategori: " + b.getmKategoriAlief().getmNamaAlief() + ", Judul: " + b.getmJudulAlief());
        }

    }
}
