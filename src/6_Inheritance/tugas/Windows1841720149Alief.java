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
public class Windows1841720149Alief extends Laptop1841720149Alief{
    protected String mfitur;
    
    public Windows1841720149Alief(){
    
    }
    
    public Windows1841720149Alief(String mMerk, int mkecProsesor, int msizeMemory,String mjnsProsesor,String mjnsBaterai,String mfitur){
        this.mMerk=mMerk;
        this.mjnsProsesor=mjnsProsesor;
        this.mjnsBaterai=mjnsBaterai;
        this.msizeMemory=msizeMemory;
        this.mkecProsesor=mkecProsesor;
        this.mfitur=mfitur;
    }
    
    public void tampilWindows1841720149Alief(){
    System.out.println("Merk                    ="+mMerk);
    System.out.println("Jenis Prosesor          ="+mjnsProsesor);
    System.out.println("Jenis Baterai           ="+mjnsBaterai);
    System.out.println("Size Memory             ="+msizeMemory);
    System.out.println("Size Memory             ="+mkecProsesor);
    System.out.println("Fitur                   ="+mfitur);
    }
}
