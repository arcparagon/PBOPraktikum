package frontend;

import backend.Anggota1841720149Alief;

public class TestBackendAnggota1841720149Alief {
    public static void main(String[] args) {
        Anggota1841720149Alief agt1 = new Anggota1841720149Alie149Alief", "Malang", "123");
        Anggota1841720149Alief agt2 = new Anggota1841720149Alief("Muhammad", "Blitar", "456");
        Anggota1841720149Alief agt3 = new Anggota1841720149Alief("Ambrose", "Surabya", "789");

        //test insert
        agt1.s149Alief();
        agt2.s149Alief();
        agt3.s149Alief();

        //test update
        agt2.setmAla149Alief("Jawa Timur");
        agt2.s149Alief();

        //test delete
        agt3.del149Alief();

        //tes select all
        for (Anggota1841720149Alief k : new Anggota1841720149Alief().get149Alief()) {
            System.out.println("Nama: " + k.getmN149Alief()+ ", Alamat : " + k.getmAla149Alief()+ ", Telepon : " + k.getmTele149Alief());
        }

        //test search
        for (Anggota1841720149Alief a : new Anggota1841720149Alief().sea149Alief("Timur")) {
            System.out.println("Nama: " + a.getmN149Alief()+ ", Alamat : " + a.getmAla149Alief()+ ", Telepon : " + a.getmTele149Alief());
        }
    }
}
