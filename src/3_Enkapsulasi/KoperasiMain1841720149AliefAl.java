/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author alief
 */
public class KoperasiMain1841720149Alief {
    public static void main(String[] args) {
        Anggota1841720149AliefAl anggota1 = new Anggota1841720149AliefAl("Alief", "Jalan Bantaran");
        System.out.println("Simpanan " +anggota1.getNama() +" : Rp " +anggota1.getSimpanan());
        
        anggota1.setNama("AliefAl");
        anggota1.setAlamat("Jl.Kendalsari Gang3");
        anggota1.setor(250000);
        System.out.println("Simpanan " +anggota1.getNama() +" : Rp " +anggota1.getSimpanan());
     
        anggota1.pinjam(50000);
        System.out.println("Simpanan " +anggota1.getNama() +" : Rp " +anggota1.getSimpanan());
    }
}