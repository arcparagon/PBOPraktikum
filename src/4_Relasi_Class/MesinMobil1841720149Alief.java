package Relasi;
public class MesinMobil1841720149Alief{
    private String EngineCar;
    private int Turbo;
    private int HorsePower;

    public MesinMobil1841720149Alief() {
    }

    public MesinMobil1841720149Alief(String EngineCar, int Turbo, int HorsePower) {
        this.EngineCar = EngineCar;
        this.Turbo = Turbo;
        this.HorsePower = HorsePower;
    }

    public String getEngineCar() {
        return EngineCar;
    }

    public void setMesinMobil(String EngineCar) {
        this.EngineCar = EngineCar;
    }

    public int getTurbo() {
        return Turbo;
    }

    public void setTurbo(int Turbo) {
        this.Turbo = Turbo;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int HorsePower) {
        this.HorsePower = HorsePower;
    }
    
    public void info1841720149Alief(){
        System.out.printf("Tipe Mesin Mobil = %s\n", EngineCar);
        System.out.printf("Jumlah Turbo = %d\n", Turbo);
        System.out.printf("Power = %s\n", HorsePower +"HP");
    }
}