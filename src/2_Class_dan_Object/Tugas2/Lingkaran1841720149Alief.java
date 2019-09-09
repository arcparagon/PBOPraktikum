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
public class Lingkaran1841720149Alief {
    public double phi;
    public double jarijari;
    public double hitungLuas;
    public double hitungKeliling;
public void tampilkanDetailLingkaranAlief(){
    hitungLuas = phi*jarijari*jarijari;
    hitungKeliling = 2*phi*jarijari;
    System.out.println("phi lingkaran = " +phi);
    System.out.println("jari-jari lingkaran = " +jarijari);
    System.out.println("Total Keliling Lingkaran : " +hitungKeliling +("cm"));
    System.out.println("Total Luas Lingkaran : " +hitungLuas +("cm"));
}
}