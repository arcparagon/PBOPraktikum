package frontend;

import backend.Anggota1841720149Alief;

public class TestBackendAnggota1841720149Alief {
    public static void main(String[] args) {
        Anggota1841720149Alief agt1 = new Anggota1841720149Alief("Alief", "Malang", "123");
        Anggota1841720149Alief agt2 = new Anggota1841720149Alief("Muhammad", "Blitar", "456");
        Anggota1841720149Alief agt3 = new Anggota1841720149Alief("Ambrose", "Surabya", "789");

        //test insert
        agt1.saveAlief();
        agt2.saveAlief();
        agt3.saveAlief();

        //test update
        agt2.setmAlamatAlief("Jawa Timur");
        agt2.saveAlief();

        //test delete
        agt3.deleteAlief();

        //tes select all
        for (Anggota1841720149Alief k : new Anggota1841720149Alief().getAllAlief()) {
            System.out.println("Nama: " + k.getmNamaAlief()+ ", Alamat : " + k.getmAlamatAlief()+ ", Telepon : " + k.getmTeleponAlief());
        }

        //test search
        for (Anggota1841720149Alief a : new Anggota1841720149Alief().searchAlief("Timur")) {
            System.out.println("Nama: " + a.getmNamaAlief()+ ", Alamat : " + a.getmAlamatAlief()+ ", Telepon : " + a.getmTeleponAlief());
        }
    }
}
