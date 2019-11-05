package job10;
import static java.awt.SystemColor.info;
import java.util.logging.Level;
public class WalkingZombie1841720149Alief extends Zombie1841720149Alief{
    
    public WalkingZombie1841720149Alief(int Mhealth, int Mlevel){
    super.Mlevel=Mlevel;
    super.Mhealth=Mhealth;
    }
    public void heal1841720149Alief(){
        switch (Mlevel) {
            case 1:
                System.out.println(Mhealth - 20);
                break;
            case 2:
                System.out.println(Mhealth - 30);
                break;
            case 3:
                System.out.println(Mhealth - 40);
                break;
            default:
                System.out.println("----------");
                break;
        }
    }
    public void destroyed1841720149Alief(){
        if(super.Mhealth == -2){
            System.out.println(Mhealth - 2);
        } else  {
            System.out.println();
        }
    }
    public String getZombieInfo1841720149Alief(){
        String info = super.getZombie1841720149Alief()+"\n";
        info += "Walking Zombie Data =" +"\n health ="+Mhealth+"\n Level ="+Mlevel;
        
        return info;
    }
}
