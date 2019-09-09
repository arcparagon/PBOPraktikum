//ALIEF//
package PBOPraktikum2;
public class TestBarang1841720149Alief {
    public static void main(String[] args) {
        Barang1841720149AliefAG brg1 = new Barang1841720149AliefAG();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangAliefAG();
        System.out.println("Stok Baru adalah : " +brg1.tambahStokAliefAG(20));
}
}