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
public class SepedaGunung extends Sepeda {
 private String tipeSuspensi;
 public void setTipeSuspensi(String newValue)
 {
     tipeSuspensi = newValue;
 }
 public void cetakStatus(){
     super.cetakStatus();
     System.out.println("Tipe Suspensi: " + tipeSuspensi);
 }
}
