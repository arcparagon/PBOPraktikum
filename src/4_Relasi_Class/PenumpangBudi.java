package Relasi;
public class PenumpangBudi {
    private String KTP;
    private String Nama;

    public PenumpangBudi() {
    }

    public PenumpangBudi(String KTP, String Nama) {
        this.KTP = KTP;
        this.Nama = Nama;
    }

    public String getKTP() {
        return KTP;
    }

    public void setKTP(String KTP) {
        this.KTP = KTP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public String info(){
        String info = "";
        info += "KTP : " + KTP + "\n";
        info += "Nama : " + Nama + "\n";
        return info;
    }
}