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
public class SepedaDemo1841720149Alief {
    public static void main(String[] args){
        Sepeda1841720149Alief spd1 = new Sepeda1841720149Alief();
        Sepeda1841720149Alief spd2 = new Sepeda1841720149Alief();
        SepedaGunung1841720149Alief spd3 = new SepedaGunung1841720149Alief();
        spd1.setMerekAlief("Folygone");
        spd1.tambahKecepatanAlief(10);
        spd1.gantiGearAlief(2);
        spd1.cetakStatusAlief();
        spd1.setColourAlief("Merah");
        
        spd2.setMerekAlief("Wiim Cycle");
        spd2.tambahKecepatanAlief(10);
        spd2.gantiGearAlief(2);
        spd2.tambahKecepatanAlief(10);
        spd2.gantiGearAlief(3);
        spd2.cetakStatusAlief();
        
        spd3.setMerekAlief("Klinee");
        spd3.tambahKecepatanAlief(5);
        spd3.gantiGearAlief(7);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatusAlief();
    }
}
