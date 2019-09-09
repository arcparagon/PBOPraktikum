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
public class DiscountPackage1841720149Alief {
    public int code;
    public String nameofPackage;
    public int basicPrice;
    public float discount;
    
    public float afterDiscountedPackageAlief(){
       float afterDiscountedPackageRifqie = (basicPrice * discount);
       return afterDiscountedPackageRifqie;
    }
    public void tampilDataAlief(){
        System.out.println("Kode Barang : " +code);
        System.out.println("Nama Barang : " +nameofPackage);
        System.out.println("Harga Dasar : " +basicPrice);
        System.out.println("Diskon : " +discount +("%"));
    }
}