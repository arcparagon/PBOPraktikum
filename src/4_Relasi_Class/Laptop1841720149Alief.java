package Relasi;
public class Laptop1841720149Alief {
    private String merk;
    private Processor1841720149Alief proc;

    public Laptop1841720149Alief() {
    }

    public Laptop1841720149Alief(String merk, Processor1841720149Alief proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerk1841720149Alief() {
        return merk;
    }

    public void setMerk1841720149Alief(String merk) {
        this.merk = merk;
    }

    public Processor1841720149Alief getProc1841720149Alief() {
        return proc;
    }

    public void setProc1841720149Alief(Processor1841720149Alief proc) {
        this.proc = proc;
    }

    public void info1841720149Alief(){
        System.out.printf("Merk Laptop = " +merk);
        proc.info1841720149Alief();
    }
}