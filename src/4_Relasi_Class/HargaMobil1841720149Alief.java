package Relasi;
public class HargaMobil1841720149Alief {
    private int Harga;

    public HargaMobil1841720149Alief() {
    }

    public HargaMobil1841720149Alief(int Harga) {
        this.Harga = Harga;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    
    public void info1841720149Alief(){
        System.out.printf("Harga Mobil = %s\n", Harga +"Euro");
    }
}