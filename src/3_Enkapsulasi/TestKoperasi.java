/*
Copyright Alief Al Gaffari
 */
package Jobsheet3;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        Scanner in = new Scanner(System.in);
        String ktp;
        String nama;
        int limitPinjam;
        
        System.out.println("KTP = ");
        ktp = in.nextLine();
        
        System.out.println("Nama = ");
        nama = in.nextLine();
        
        System.out.println("pinjam = ");
        limitPinjam = in.nextInt();
        
        
        
        
        System.out.println("Nama Anggota :" + donny.getNama());
        System.out.println("Limit Pinjam :" + donny.getLimitPinjam());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini :" + donny.getJumlahPinjam());
        
        System.out.println("\nMeminjam uang 4.000.000..");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini :" + donny.getJumlahPinjam());
        
        System.out.println("\nMembayar angsuran 1.000.000..");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini :" + donny.getJumlahPinjam());
        
        System.out.println("\nMembayar angsuran 3.000.000..");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini :" + donny.getJumlahPinjam());
        
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("Nama Anggota :" + nama);
        System.out.println("Limit Pinjam :" + limitPinjam);
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini :" + donny.getJumlahPinjam());
        
        System.out.println("\nMeminjam uang 4.000.000..");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini :" + donny.getJumlahPinjam());
        
        System.out.println("\nMembayar angsuran 1.000.000..");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini :" + donny.getJumlahPinjam());
        
        System.out.println("\nMembayar angsuran 3.000.000..");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini :" + donny.getJumlahPinjam());
    }
}
