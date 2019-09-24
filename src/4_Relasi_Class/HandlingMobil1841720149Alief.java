package Relasi;
public class HandlingMobil1841720149Alief {
    private String FrontSuspension;
    private String RearSuspension;
    private String Brakes;
    private String Tyres;
    private int Weight;

    public HandlingMobil1841720149Alief() {
    }

    public HandlingMobil1841720149Alief(String FrontSuspension, String RearSuspension, String Brakes, String Tyres, int Weight) {
        this.FrontSuspension = FrontSuspension;
        this.RearSuspension = RearSuspension;
        this.Brakes = Brakes;
        this.Tyres = Tyres;
        this.Weight = Weight;
    }

    public String getFrontSuspension() {
        return FrontSuspension;
    }

    public void setFrontSuspension(String FrontSuspension) {
        this.FrontSuspension = FrontSuspension;
    }

    public String getRearSuspension() {
        return RearSuspension;
    }

    public void setRearSuspension(String RearSuspension) {
        this.RearSuspension = RearSuspension;
    }

    public String getBrakes() {
        return Brakes;
    }

    public void setBrakes(String Brakes) {
        this.Brakes = Brakes;
    }

    public String getTyres() {
        return Tyres;
    }

    public void setTyres(String Tyres) {
        this.Tyres = Tyres;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }
    
    public void info1841720149Alief(){
        System.out.printf("Suspensi Depan = %s\n", FrontSuspension);
        System.out.printf("Suspensi Belakang = %s\n", RearSuspension);
        System.out.printf("Tipe Rem = %s\n", Brakes);
        System.out.printf("Tipe Ban = %s\n", Tyres);
        System.out.printf("Berat Mobil = %s\n", Weight +"kg");
    }
}