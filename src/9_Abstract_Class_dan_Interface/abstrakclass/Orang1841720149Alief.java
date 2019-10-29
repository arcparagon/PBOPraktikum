package AbstrakAndInterfaces;
public class Orang1841720149Alief {
    private String Mnama;
    private Hewan1841720149Alief MhewanPeliharaan;
    
    public Orang1841720149Alief(String Mnama){
        this.Mnama=Mnama;
    }
    public void peliharaanHewan1841720149Alief(Hewan1841720149Alief MhewanPeliharaan){
        this.MhewanPeliharaan = MhewanPeliharaan;
    }
    public void ajakPeliharaanJalanjalan1841720149Alief(){
        System.out.println("Namaku "+this.Mnama);
        System.out.println("Hewan peliharaanku berjalan dengan cara :");
        this.MhewanPeliharaan.bergerak1841720149Alief();
        System.out.println("-------------------------------------------------------");
    }
}
