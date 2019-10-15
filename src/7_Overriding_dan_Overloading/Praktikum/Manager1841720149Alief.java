package jobsheet7;
public class Manager1841720149Alief extends Karyawan1841720149Alief{
    private double Mtunjangan;
    private String Mbagian;
    private Staff1841720149Alief Mst[];

    public double getTunjangan1841720149Alief() {
        return Mtunjangan;
    }

    public void setTunjangan1841720149Alief(double Mtunjangan) {
        this.Mtunjangan = Mtunjangan;
    }

    public String getBagian1841720149Alief() {
        return Mbagian;
    }

    public void setBagian1841720149Alief(String Mbagian) {
        this.Mbagian = Mbagian;
    }

    public Staff1841720149Alief[] getSt1841720149Alief() {
        return Mst;
    }

    public void setSt1841720149Alief(Staff1841720149Alief[] Mst) {
        this.Mst = Mst;
    }
    
    public void viewStaff1841720149Alief(){
        int i;
        System.out.println("---------------------------");
        for (int j = 0; j < Mst.length; j++) {
           Mst[j].lihatInfo1841720149Alief();    
        }
        System.out.println("----------------------------");
    }
    public void lihatInfo1841720149Alief(){
        System.out.println("Manager : " +this.getBagian1841720149Alief());
        System.out.println("NIP : " +this.getNip1841720149Alief());
        System.out.println("Nama : " +this.getNama1841720149Alief());
        System.out.println("Golongan : " +this.getGolongan1841720149Alief());
        System.out.printf("Tunjangan :%.0f\n", this.getTunjangan1841720149Alief());
        System.out.printf("Gaji :%.0f\n",this.getGaji1841720149Alief());
        System.out.println("Bagian : " +this.getBagian1841720149Alief());
        this.viewStaff1841720149Alief();
    }
    public double getGaji1841720149Alief() {
        return super.getGaji1841720149Alief() + Mtunjangan;
    }
}