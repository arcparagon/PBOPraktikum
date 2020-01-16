/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan12JavaAPI4;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class InputData1841720065Rifqie {
    ArrayList<Mahasiswa1841720065Rifqie> ListMahasiswa;
    
    public InputData1841720065Rifqie(){
       ListMahasiswa=new ArrayList();
    }
    public void isiData(String Nim,String Nama, String Alamat){
        Mahasiswa1841720065Rifqie mhs=new Mahasiswa1841720065Rifqie(Nim,Nama,Alamat);
        ListMahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa1841720065Rifqie> getData(){
        return ListMahasiswa;
    }
}

