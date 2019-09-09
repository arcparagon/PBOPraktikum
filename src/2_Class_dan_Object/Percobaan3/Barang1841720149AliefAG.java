//ALIEF//
package PBOPraktikum2;
public class Barang1841720149AliefAG {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangAliefAG(){
        System.out.println("Nama Barang : " +namaBrg);
        System.out.println("Jenis Barang : " +jenisBrg);
        System.out.println("Stok : " +stok);
    }
    public int tambahStokAliefAG(int brgMasuk){
        int stokBaru = brgMasuk+stok;
        return stokBaru;
    }
}