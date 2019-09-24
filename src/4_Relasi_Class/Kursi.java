package Relasi;
public class Kursi{
    private String Nomor;
    private Penumpang penumpang;

    public Kursi() {
    }

    public Kursi(String Nomor) {
        this.Nomor = Nomor;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNomor(String Nomor) {
        this.Nomor = Nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    
    
    public String info(){
        String info = "";
        info += "Nomor : " + Nomor + "\n";
        if (this.penumpang != null){
        info += "Penumpang : " + penumpang + "\n";
        }
        return info;
    }
}