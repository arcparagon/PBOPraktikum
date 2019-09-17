/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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