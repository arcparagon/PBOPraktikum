/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOPraktikum2;

/**
 *
 * @author alief
 */
public class SewaGame1841720149Alief {
    public int ID;
    public String namaMember;
    public String namaGame;
    public int hargaSewa;
    public int lamaSewa;
    public int hargaTotal;
    
public void tampilkanTotalHargaAlief(){
    hargaTotal = lamaSewa*hargaSewa;
    System.out.println("ID Member : " +ID);
    System.out.println("Nama Member : " +namaMember);
    System.out.println("Nama Game : " +namaGame);
    System.out.println("Lama Sewa : " +lamaSewa +("hari"));
    System.out.println("Harga Sewa : " +hargaSewa);
    System.out.println("Harga Total : " +hargaTotal);
}
}