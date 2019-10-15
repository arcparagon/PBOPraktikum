
package inheritancelima;
public class InheritanceLima {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama="Vivin";
        M.alamat="Jl. Vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManager();
        System.out.println("--------------------------------------------------------------------");
        Staff S = new Staff();
        S.nama="Vovon";
        S.alamat="Jl. Voniloa";
        S.umur=25;
        S.jk="Laki-laki";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaff();
    }    
}
