/*
Copyright Alief Al Gaffari
 */
package Jobsheet3;

/**
 *
 * @author alief
 */
public class MotorMain {
    public static void main(String[] args) {
        Motor1841720149AliefAl motor = new Motor1841720149AliefAl();
        motor.printStatus();
        motor.tambahKecepatan();
        
        motor.nyalakanMesin();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
}