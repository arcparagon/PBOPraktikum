package frontend;

import backend.Kategori1841720149Alief;

public class TestBackend1841720149Alief {
    public static void main(String[] args) {
        Kategori1841720149Alief kat1 = new Kategori1841720149Alief("Novel", "Koleksi buku novel");
        Kategori1841720149Alief kat2 = new Kategori1841720149Alief("Referensi", "Buku referensi ilmiah");
        Kategori1841720149Alief kat3 = new Kategori1841720149Alief("Komik", "Komik anak-anak");

        // test insert
        kat1.saveAlief();
        kat2.saveAlief();
        kat3.saveAlief();

        // test update
        kat2.setmKeteranganAlief("Koleksi buku referensi ilmiah");
        kat2.saveAlief();

        // test delete
        kat3.delete();

        // test select all
        for (Kategori1841720149Alief k : new Kategori1841720149Alief().getAllAlief()) {
            System.out.println("Nama: " + k.getmNamaAlief() + ", Ket: " + k.getmKeteranganAlief());
        }

        // test search
        for (Kategori1841720149Alief k : new Kategori1841720149Alief().searchAlief("ilmiah")) {
            System.out.println("Nama: " + k.getmNamaAlief() + ", Ket: " + k.getmKeteranganAlief());
        }
    }
}
