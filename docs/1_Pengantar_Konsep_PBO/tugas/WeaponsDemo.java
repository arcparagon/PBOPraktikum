/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weapons;

/**
 *
 * @author alief
 */
public class WeaponsDemo {
    public static void main(String[] args){
        Weapons wps1 = new Weapons();
        Weapons wps2 = new Weapons();
        VipWeapons wps3 = new VipWeapons();
        
        wps1.setName("AK 47 Weapon");
        wps1.setStyle(" Dragon Mechanical");
        wps1.setRating(" Rating * ");
        wps1.fastBullet(10);
        wps1.loadBullet(2);
        wps1.cetakStatus();
        
        wps2.setName(" AWM Sniper ");
        wps2.setStyle(" Hell Cerberus ");
        wps2.setRating(" Rating *** ");
        wps2.fastBullet(10);
        wps2.loadBullet(5);
        wps2.fastBullet(10);
        wps2.loadBullet(3);
        wps2.cetakStatus();
        
        wps3.setName(" Cheytac and 100x Scope");
        wps3.setStyle(" Darkness Spear ");
        wps3.setRating(" Rating ***** ");
        wps3.fastBullet(7);
        wps3.loadBullet(3);
        wps3.cetakStatus();
    }
}
