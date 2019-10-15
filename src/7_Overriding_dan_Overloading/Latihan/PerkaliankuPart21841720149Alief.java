package jobsheet7;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class PerkaliankuPart21841720149Alief {
       void perkalian1841720149Alief(int Ma, int Mb){
        System.out.println(Ma*Mb);
    }
    void perkalian1841720149Alief(double Ma, double Mb){ // overloading
        System.out.println(Ma*Mb);
    }
    public static void main (String args []){
        PerkaliankuPart21841720149Alief objek1 = new PerkaliankuPart21841720149Alief();
        
        objek1.perkalian1841720149Alief(25, 43);
        objek1.perkalian1841720149Alief(34.53 ,23.7);
    }
}
