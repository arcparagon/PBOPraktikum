package job10;
public class InternshipEmployee1841720149Alief extends Employee1841720149Alief{
    private int Mlength;

    public InternshipEmployee1841720149Alief(String Mname, int Mlength) {
        this.Mlength = Mlength;
        this.Mname = Mname; 
    }

    public int getLength1841720149Alief() {
        return Mlength;
    }

    public void setLength1841720149Alief(int Mlength) {
        this.Mlength = Mlength;
    }
    @Override
    public String getEmployeeInfo1841720149Alief(){
        String info = super.getEmployeeInfo1841720149Alief()+"\n";
        info += "Registered as Internship Employees for "+Mlength +" month/s\n";
        return info;
    }
}