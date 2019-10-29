package AbstrakAndInterfaces;
public class Program1841720149Alief {
    public static void main(String[] args) {
        Rektor1841720149Alief pakRektor = new Rektor1841720149Alief();
        
        Mahasiswa1841720149Alief mahasiswaBiasa = new Mahasiswa1841720149Alief("Charlie");
        Sarjana1841720149Alief sarjanaCumlaude = new Sarjana1841720149Alief("Dini");
        PascaSarjana1841720149Alief masterCumlaude = new PascaSarjana1841720149Alief("Elok");
        
        //pakRektor.beriSertifikatCunlaude(mahasiswaBiasa);
        pakRektor.beriSertifikatCunlaude1841720149Alief(sarjanaCumlaude);
        pakRektor.beriSertifikatCunlaude1841720149Alief(masterCumlaude);
        
        
        System.out.println("-----------------------------------------------");
        
        pakRektor.beriSertifikatMawapres1841720149Alief(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres1841720149Alief(masterCumlaude);
        
    }
}
