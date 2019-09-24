package Relasi;
public class MobilDetail1841720149Alief{
    private MerkMobil1841720149Alief MerkMobil;
    private MesinMobil1841720149Alief MesinMobil;
    private HandlingMobil1841720149Alief HandlingMobil;
    private VelocityMobil1841720149Alief VelocityMobil;
    private HargaMobil1841720149Alief HargaMobil;

    public MobilDetail1841720149Alief() {
    }

    public MobilDetail1841720149Alief(MerkMobil1841720149Alief MerkMobil, MesinMobil1841720149Alief MesinMobil, HandlingMobil1841720149Alief HandlingMobil, VelocityMobil1841720149Alief VelocityMobil, HargaMobil1841720149Alief HargaMobil) {
        this.MerkMobil = MerkMobil;
        this.MesinMobil = MesinMobil;
        this.HandlingMobil = HandlingMobil;
        this.VelocityMobil = VelocityMobil;
        this.HargaMobil = HargaMobil;
    }

    public MerkMobil1841720149Alief getMerkMobil() {
        return MerkMobil;
    }

    public void setMerkMobil(MerkMobil1841720149Alief MerkMobil) {
        this.MerkMobil = MerkMobil;
    }

    public MesinMobil1841720149Alief getMesinMobil() {
        return MesinMobil;
    }

    public void setMesinMobil(MesinMobil1841720149Alief MesinMobil) {
        this.MesinMobil = MesinMobil;
    }

    public HandlingMobil1841720149Alief getHandlingMobil() {
        return HandlingMobil;
    }

    public void setHandlingMobil(HandlingMobil1841720149Alief HandlingMobil) {
        this.HandlingMobil = HandlingMobil;
    }

    public VelocityMobil1841720149Alief getVelocityMobil() {
        return VelocityMobil;
    }

    public void setVelocityMobil(VelocityMobil1841720149Alief VelocityMobil) {
        this.VelocityMobil = VelocityMobil;
    }

    public HargaMobil1841720149Alief getHargaMobil() {
        return HargaMobil;
    }

    public void setHargaMobil(HargaMobil1841720149Alief HargaMobil) {
        this.HargaMobil = HargaMobil;
    }

    
    public void info1841720149Alief(){
        MerkMobil.info1841720149Alief();
        MesinMobil.info1841720149Alief();
        HandlingMobil.info1841720149Alief();
        VelocityMobil.info1841720149Alief();
        HargaMobil.info1841720149Alief();
    }
}