package Relasi;
public class Processor1841720149Alief{
    private String merk;
    private double cache;

    public Processor1841720149Alief() {
    }

    public Processor1841720149Alief(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public String getMerk1841720149Alief() {
        return merk;
    }

    public void setMerk1841720149Alief(String merk) {
        this.merk = merk;
    }

    public double getCache1841720149Alief() {
        return cache;
    }

    public void setCache1841720149Alief(double cache) {
        this.cache = cache;
    }
   
    public void info1841720149Alief(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
    
}