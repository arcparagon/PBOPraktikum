/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

/**
 *
 * @author Dell
 */
public class Laptop1841720149Alief extends Komputer1841720149Alief{
    protected String mjnsBaterai;
    
    public Laptop1841720149Alief(){
    
    }
    
    public Laptop1841720149Alief(String mMerk, int msizeMemory,String mjnsProsesor,String mjnsBaterai){
        this.mMerk=mMerk;
        this.mjnsProsesor=mjnsProsesor;
        this.mjnsBaterai=mjnsBaterai;
        this.msizeMemory=msizeMemory;
    }
    
    public void tampilLaptop1841720149Alief(){
    System.out.println("Merk                    ="+mMerk);
    System.out.println("Jenis Prosesor          ="+mjnsProsesor);
    System.out.println("Jenis Baterai           ="+mjnsBaterai);
    System.out.println("Size Memory             ="+msizeMemory);
    }
}
