package job10;
public class Plantz1841720149Alief{
    public void doDestroy1841720149Alief(Destroyable1841720149Alief d){
        if(d instanceof JumpingZombie1841720149Alief){
            ((JumpingZombie1841720149Alief) d).heal1841720149Alief();
            d.destroyed1841720149Alief();
        }
        else if(d instanceof WalkingZombie1841720149Alief){
            ((WalkingZombie1841720149Alief) d).heal1841720149Alief();
            d.destroyed1841720149Alief();
        }
    }
}
