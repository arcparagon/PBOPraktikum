package AbstrakAndInterfaces;
public class Sarjana1841720149Alief extends Mahasiswa1841720149Alief implements ICumlaude1841720149Alief,IBerprestasi1841720149Alief{
    
    public Sarjana1841720149Alief(String Mnama){
        super(Mnama);    
    }
    //ICUMLAUDE----------------------------------------------------------------------
    @Override
    public void lulus1841720149Alief() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi1841720149Alief() {
        System.out.println("IPS-ku lebih dari 3,51");
    }
    
    @Override
    public void kuliahDiKampus1841720149Alief() {
        super.kuliahDiKampus1841720149Alief();
    }
    
    //IBerprestasi------------------------------------------------------------------------
    @Override
    public void menjuaraiKompetisi1841720149Alief() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah1841720149Alief() {
        System.out.println("Saya menerbitkan artikel di jurnal Internasional");
    }
    
}
