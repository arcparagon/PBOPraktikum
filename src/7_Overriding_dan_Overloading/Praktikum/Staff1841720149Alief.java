package jobsheet7;
public class Staff1841720149Alief extends Karyawan1841720149Alief{
    private int Mlembur;
    private double MgajiLembur;

    public int getLembur1841720149Alief() {
        return Mlembur;
    }

    public void setLembur1841720149Alief(int Mlembur) {
        this.Mlembur = Mlembur;
    }

    public double getGajiLembur1841720149Alief() {
        return MgajiLembur;
    }

    public void setGajiLembur1841720149Alief(double MgajiLembur) {
        this.MgajiLembur = MgajiLembur;
    }

    public double getGaji1841720149Alief(int Mlembur, double MgajiLembur) {
        return super.getGaji1841720149Alief() + Mlembur*MgajiLembur;
    }

    public double getGaji1841720149Alief() {
        return super.getGaji1841720149Alief() + Mlembur*MgajiLembur;
    }
    public void lihatInfo1841720149Alief(){
        System.out.println("NIP : " +this.getNip1841720149Alief());
        System.out.println("Nama : " +this.getNama1841720149Alief());
        System.out.println("Golongan : " +this.getGolongan1841720149Alief());
        System.out.println("Jumlah Lembur : " +this.getLembur1841720149Alief());
        System.out.printf("Gaji Lembur :%.0f\n",this.getGajiLembur1841720149Alief());
        System.out.printf("Gaji :%.0f\n", this.getGaji1841720149Alief());
    }
}