package Relasi;
public class Gerbong {
    private String kode;
    private Kursi[] arraykursi;

    public Gerbong() {
    }

    public Gerbong(String kode, Kursi[] arraykursi) {
        this.kode = kode;
        this.arraykursi = arraykursi;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArraykursi() {
        return arraykursi;
    }

    public void setArraykursi(Kursi[] arraykursi) {
        this.arraykursi = arraykursi;
    }
    
    
    private void initKursi(){
        for(int i = 0; i < arraykursi.length; i++){
            this.arraykursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    
    public Gerbong (String kode, int jumlah){
        this.kode = kode;
        this.arraykursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    public String info(){
        String info = "";
        info += "Kode : " + kode + "\n";
        for (Kursi kursi : arraykursi){
            info += kursi.info();
        }
        return info;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
        this.arraykursi[nomor - 1].setPenumpang(penumpang);
    }
}