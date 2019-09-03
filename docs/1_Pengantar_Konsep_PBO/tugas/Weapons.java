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
public class Weapons {
    private String nama, style, setRating;
    private int fastbullet;
    private int reload;

    public void setName(String newValue) {
        nama = newValue;
    }
    
    public void setStyle(String newValue) {
        style = newValue;
    }

    public void setBullet(int newValue) {
        reload = newValue;
    }

    public void fastBullet(int increment) {
        fastbullet = fastbullet + increment;
    }

    public void loadBullet(int decrement) {
        fastbullet = fastbullet - decrement;
    }
    
    public void setRating(String newValue)
 {
     setRating = newValue;
 }
    

    public void cetakStatus() {
        System.out.println("Name : " + nama);
        System.out.println("Fast Bullet : " + fastbullet);
        System.out.println("Reloading Speed : " + reload);
        System.out.println("Style weapons : " + style );
        System.out.println("Rating weapons : " + setRating );
    }
}
