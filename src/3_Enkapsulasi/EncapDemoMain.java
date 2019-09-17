/*
Copyright Alief Al Gaffari
 */
package Jobsheet3;

/**
 *
 * @author alief
 */
public class EncapDemoMain{
    public static void main(String args[]){
        EncapDemo encap1 = new EncapDemo(); 
        encap1.setName("Nunu");
        encap1.setAge(35);
    
        System.out.println("name : "+ encap1.getName());
        System.out.println("Age : "+ encap1.getAge());
    }
}