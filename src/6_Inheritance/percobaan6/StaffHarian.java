/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceenam;

/**
 *
 * @author Dell
 */
public class StaffHarian {
     public int jmlJamKerja;
    
    public StaffHarian(){
        
    }
    public StaffHarian(String nama, String alamat, String jk, int umur,
            int gaji, int lembur, int potongan, int jmlJamKerja){
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.jmlJamKerja=jmlJamKerja;
    }
    public void tampilStaffHarian(){
        System.out.println("==============Data Staff Tetap==============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja     ="+jmlJamKerja);
        System.out.println("Gaji Bersih          ="+(gaji*jmlJamKerja+lembur-potongan));
        
    }
}
