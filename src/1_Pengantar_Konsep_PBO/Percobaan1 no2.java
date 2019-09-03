/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SepedaDemo;

/**
 *
 * @author alief
 */
public class SepedaDemo {
    public static void main(String[] args){
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        
        spd1.setMerek("Folygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
    }
}
