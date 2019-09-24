package Relasi;
public class VelocityMobil1841720149Alief {
    private double Acceleration;
    private int TopSpeed;

    public VelocityMobil1841720149Alief() {
    }

    public VelocityMobil1841720149Alief(double Acceleration, int TopSpeed) {
        this.Acceleration = Acceleration;
        this.TopSpeed = TopSpeed;
    }

    public double getAcceleration() {
        return Acceleration;
    }

    public void setAcceleration(double Acceleration) {
        this.Acceleration = Acceleration;
    }

    public int getTopSpeed() {
        return TopSpeed;
    }

    public void setTopSpeed(int TopSpeed) {
        this.TopSpeed = TopSpeed;
    }
    
    public void info1841720149Alief(){
        System.out.printf("Akselerasi mulai dari kecepatan 0-60 mph = %s\n", Acceleration +"detik");
        System.out.printf("Kecepatan Maksimum = %s\n", TopSpeed +"mph");
    }
}