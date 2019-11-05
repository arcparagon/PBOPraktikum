package job10;
public class Tester1841720149Alief{
    public static void main(String[] args) {
        WalkingZombie1841720149Alief wz = new WalkingZombie1841720149Alief(100, 1);
        JumpingZombie1841720149Alief jz = new JumpingZombie1841720149Alief(100, 2);
        Barrier1841720149Alief b = new Barrier1841720149Alief(100);
        Plantz1841720149Alief p = new Plantz1841720149Alief();
        System.out.println(""+wz.getZombieInfo1841720149Alief());
        System.out.println(""+jz.getZombieInfo1841720149Alief());
        System.out.println(""+b.getBarrierInfo1841720149Alief());
        System.out.println("-------------------");
        for(int i=0;i<4;i++){
            p.doDestroy1841720149Alief(wz);
            p.doDestroy1841720149Alief(jz);
            p.doDestroy1841720149Alief(b);
        }
        System.out.println(""+wz.getZombieInfo1841720149Alief());
        System.out.println(""+jz.getZombieInfo1841720149Alief());
        System.out.println(""+b.getBarrierInfo1841720149Alief());
    }
}
