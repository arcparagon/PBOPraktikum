package job10;
public class Barrier1841720149Alief implements Destroyable1841720149Alief{
    private int Mstrength;
    
    public Barrier1841720149Alief(int Mstrength){
        this.Mstrength=Mstrength;
    }
    public void setStrength1841720149Alief(int Mstrength){
        this.Mstrength=Mstrength;
    }
    public int getStrength1841720149Alief(){
        return Mstrength;
    }
    @Override
    public void destroyed1841720149Alief() {
        System.out.println("");
    }
    public String getBarrierInfo1841720149Alief(){
        return "Barrier Strength ="+ Mstrength;
        
    }
}
