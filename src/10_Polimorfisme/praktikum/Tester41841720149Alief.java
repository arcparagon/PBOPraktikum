package job10;
public class Tester41841720149Alief {
    public static void main(String[] args) {
        Owner1841720149Alief ow = new Owner1841720149Alief();
        ElectricityBill1841720149Alief eBill = new ElectricityBill1841720149Alief(5, "R-34");
        ow.pay1841720065Rifqie(eBill); //pay for an electricity bill
        System.out.println("---------------------");
        
        PermanentEmployee1841720149Alief pEmp = new PermanentEmployee1841720149Alief("Dolph Ziggler", 500);
        ow.pay1841720065Rifqie(pEmp); //pay for permanent employee
        System.out.println("---------------------");
        
        InternshipEmployee1841720149Alief iEmp = new InternshipEmployee1841720149Alief("Seth Rollins", 5);
        ow.showMyEmployee1841720065Rifqie(pEmp); //showing for permanent employee
        System.out.println("---------------------");
        ow.showMyEmployee1841720065Rifqie(iEmp); //showing all of your data;
    }
}
