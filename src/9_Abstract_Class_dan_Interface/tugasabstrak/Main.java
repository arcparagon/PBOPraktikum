/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAbstract;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        PengemudiAmatir amatir = new PengemudiAmatir();
        PengemudiProfesional profesional = new PengemudiProfesional();
        
        
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Niva");
        
        ani.laju(amatir);
        budi.laju(profesional);
        
        ani.ketKecepatanMobil();
        budi.ketKecepatanMobil();
    }
}
