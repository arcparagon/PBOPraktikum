package frontend;

import backend.Anggota1841720149Alief;
import backend.Buku1841720149Alief;
import backend.Peminjaman1841720149Alief;

public class TestBackendPeminjaman1841720149Alief {

    public static void main(String[] args) {
        Anggota1841720149Alief agt = new Anggota1841720149Alief().getByIdAlief(1);
        Buku1841720149Alief TimunMas = new Buku1841720149Alief().getByIdAlief(1);
        Peminjaman1841720149Alief peminjaman1 = new Peminjaman1841720149Alief(agt, TimunMas, "2019/12/26", "2019/12/28");
        peminjaman1.saveAlief();
        for (Peminjaman1841720149Alief p : new Peminjaman1841720149Alief().getAllAlief()) {
            System.out.println("Nama Peminjam : " + p.getmAnggotaAlief().getmNamaAlief() + "\n"
                    + "Nama Buku : " + p.getmBukuAlief().getmJudulAlief()+ "\n"
                    + "Tanggal Pinjam: " + p.getmTanggalPinjamAlief()+ "\n"
                    + "Tanggal Kembali: " + p.getmTanggalKembaliAlief());
        }
    }
}
