package AbstrakAndInterfaces;
public class PascaSarjana1841720149Alief extends Mahasiswa1841720149Alief implements  ICumlaude1841720149Alief, IBerprestasi1841720149Alief{
    
    public PascaSarjana1841720149Alief(String Mnama){
        super(Mnama);
    }
    //CUMLAUDE-------------------------------------------------------------------------------------------------------------------------
    @Override
    public void lulus1841720149Alief() {
        System.out.println("Aku sudah menyelesaikann tesis");
    }

    @Override
    public void meraihIPKTinggi1841720149Alief() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
     @Override
    public void kuliahDiKampus1841720149Alief() {
        //System.out.println(" "+ super.kuliahDiKampus());
        super.kuliahDiKampus1841720149Alief();
    }
    
    //BERPRESTASI-----------------------------------------------------------------------------------------------------------------------
    @Override
    public void menjuaraiKompetisi1841720149Alief() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah1841720149Alief() {
        System.out.println("Saya menerbitkan artikel di jurnal Internasional");
    }
}
