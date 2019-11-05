package job10;
public class Owner1841720149Alief{
    public void pay1841720149Alief(Payable1841720149Alief Mp){
        System.out.println("total payment = " +Mp.getPaymentAmount1841720149Alief());
        if(Mp instanceof ElectricityBill1841720149Alief){
            ElectricityBill1841720149Alief eb = (ElectricityBill1841720149Alief) Mp;
            System.out.println("" +eb.getBillInfo1841720149Alief());
        }else if(Mp instanceof PermanentEmployee1841720149Alief){
            PermanentEmployee1841720149Alief Mpe = (PermanentEmployee1841720149Alief) Mp;
            Mpe.getEmployeeInfo1841720149Alief();
            System.out.println("" +Mpe.getEmployeeInfo1841720149Alief());
        }
    }
    public void showMyEmployee1841720149Alief(Employee1841720149Alief Me){
        System.out.println(""+Me.getEmployeeInfo1841720149Alief());
        if(Me instanceof PermanentEmployee1841720149Alief)
            System.out.println("You have to pay immediately, STRANGER!!!");
        else
            System.out.println("Just Go. No need to pay me anymore, STRANGER!");
        }
    }