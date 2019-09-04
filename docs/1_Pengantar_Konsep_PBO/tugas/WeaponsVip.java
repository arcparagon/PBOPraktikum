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
public class VipWeapons extends Weapons {
    private String setRating;
 public void setRating(String newValue)
 {
     setRating = newValue;
 }
 public void cetakStatus(){
     super.cetakStatus();
     System.out.println("Rating Weapons : " + setRating);
 }
}
