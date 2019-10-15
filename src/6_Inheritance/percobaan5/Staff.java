/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancelima;

/**
 *
 * @author Dell
 */
public class Staff extends Karyawan{
    public int lembur, potongan;
    
    public Staff(){
    
    }
    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
    super(nama,alamat,jk,umur,gaji);
    this.lembur=lembur;
    this.potongan=potongan;
    }
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("lembur          ="+lembur);
        System.out.println("potongan        ="+potongan);
        System.out.println("total gaji      ="+(gaji+lembur-potongan));
    }
}

