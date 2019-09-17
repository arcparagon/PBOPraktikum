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
public class Anggota{
    private String ktp;
    private String nama;
    private int limitPinjam;
    private int pinjam;
    private int angsur;
    
  Anggota(String ktp, String nama,int limitPinjam){
        this.nama = nama;
        this.ktp = ktp;
        this.limitPinjam = limitPinjam;
    }
    
    public int getPinjam(int pinjam){
        this.limitPinjam = pinjam;
        return limitPinjam;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getLimitPinjam(){
        return limitPinjam;
    }
    
    public int pinjam(int pinjam1){
        this.pinjam = pinjam1;
        return this.pinjam;   
    }
    public int angsur(int angsur1){
        this.angsur = angsur1;
        return this.angsur;   
    }
    public int getJumlahPinjam(){
        if( this.pinjam >= 5000000 && pinjam <= 0.1){
            System.out.println("Maaf jumlah pinjaman melebihi limit");
            System.out.println("Maaf Angsuran harus 10% dari jumlah pinjam");
        }else{
            System.out.println(" "+ pinjam);
            pinjam = pinjam - angsur;
            return pinjam;
        }
        return pinjam;
    }    
}