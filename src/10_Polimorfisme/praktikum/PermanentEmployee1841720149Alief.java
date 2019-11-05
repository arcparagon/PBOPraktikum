package job10;
public class PermanentEmployee1841720149Alief extends Employee1841720149Alief implements Payable1841720149Alief{
    private int Msalary;

    public PermanentEmployee1841720149Alief(String Mname, int Msalary) {
        this.Mname = Mname;
        this.Msalary = Msalary;
    }

    public int getSalary1841720149Alief() {
        return Msalary;
    }

    public void setSalary1841720149Alief(int Msalary) {
        this.Msalary = Msalary;
    }
    @Override
    public int getPaymentAmount1841720149Alief(){
        return (int) (Msalary+0.05*Msalary);
    }
    @Override
    public String getEmployeeInfo1841720149Alief(){
        String info = super.getEmployeeInfo1841720149Alief()+"\n";
        info += "Registered as Permanent Employees with salary "+Msalary+"\n";
        return info;
    }
}