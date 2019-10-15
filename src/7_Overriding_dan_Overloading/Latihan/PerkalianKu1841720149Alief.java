package jobsheet7;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class PerkalianKu1841720149Alief {
    void perkalian1841720149Alief(int Ma, int Mb){
        System.out.println(Ma*Mb);
    }
    void perkalian1841720149Alief(int Ma,int Mb, int Mc){ // overloading
        System.out.println(Ma*Mb*Mc);
    }
    public static void main (String args []){
        PerkalianKu1841720149Alief objek = new PerkalianKu1841720149Alief();
        
        objek.perkalian1841720149Alief(25, 43);
        objek.perkalian1841720149Alief(34, 23, 56);
    }
}


//package jobsheet7;
//public class PerkalianKu1841720149Alief {
//    private int a;
//    private int b;
//
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }}