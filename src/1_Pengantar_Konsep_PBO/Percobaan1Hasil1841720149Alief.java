/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * andt open the template in the editor.
 */
package SepedaDemo;

/**
 *
 * @author alief
 */
public class Sepeda1841720149Alief {

    private String merek, colour;
    private int kecepatan;
    private int gear;

    public void setMerekAlief(String newValue) {
        merek = newValue;
    }
    
    public void setColourAlief(String newValue) {
        colour = newValue;
    }

    public void gantiGearAlief(int newValue) {
        gear = newValue;
    }

    public void tambahKecepatanAlief(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void remAlief(int decrement) {
        kecepatan = kecepatan - decrement;
    }
    

    public void cetakStatusAlief() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("Warna: " + colour);
    }
}
