/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAbstract;

/**
 *
 * @author Dell
 */
public class Orang {
        private String nama;
        private Pengemudi kecepatan;
    
    public Orang(String nama){
        this.nama=nama;
    }
    public void laju(Pengemudi kecepatan){
        this.kecepatan = kecepatan;
    }
    public void ketKecepatanMobil(){
        System.out.println("Namaku "+this.nama);
        this.kecepatan.Kecepatan();
        System.out.println("-------------------------------------------------------");
    }
}
