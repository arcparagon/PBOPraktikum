package jobsheet7;
public class Karyawan1841720149Alief {
    private String Mnama;
    private String Mnip;
    private String Mgolongan;
    private double Mgaji;

    public void setNama1841720149Alief(String Mnama) {
        this.Mnama = Mnama;
    }

    public void setNip1841720149Alief(String Mnip) {
        this.Mnip = Mnip;
    }

    public void setGolongan1841720149Alief(String Mgolongan) {
        this.Mgolongan = Mgolongan;
    
    switch(Mgolongan.charAt(0)){
        case '1':this.Mgaji=5000000;
            break;
        case '2':this.Mgaji=3000000;
            break;
        case '3':this.Mgaji=2000000;
            break;
        case '4':this.Mgaji=1000000;
            break;
        case '5':this.Mgaji=750000;
            break;
    }
  }
    public void setGaji1841720149Alief(double Mgaji) {
        this.Mgaji = Mgaji;
    }

    public String getNama1841720149Alief() {
        return Mnama;
    }

    public String getNip1841720149Alief() {
        return Mnip;
    }

    public String getGolongan1841720149Alief() {
        return Mgolongan;
    }

    public double getGaji1841720149Alief() {
        return Mgaji;
    }
}