package job10;
public class ElectricityBill1841720149Alief implements Payable1841720149Alief{
    private int Mkwh;
    private String Mcategory;

    public ElectricityBill1841720149Alief(int Mkwh, String Mcategory) {
        this.Mkwh = Mkwh;
        this.Mcategory = Mcategory;
    }

    public int getKwh1841720149Alief() {
        return Mkwh;
    }

    public void setKwh1841720149Alief(int Mkwh) {
        this.Mkwh = Mkwh;
    }

    public String getCategory1841720149Alief() {
        return Mcategory;
    }

    public void setCategory1841720149Alief(String Mcategory) {
        this.Mcategory = Mcategory;
    }

    public int getPaymentAmount1841720149Alief(){
        return Mkwh*getBasePrice1841720149Alief();
    }
    public int getBasePrice1841720149Alief(){
        int MbPrice = 0;
        switch(Mcategory){
            case "R-1" : MbPrice = 100;
            break;
            case "R-2" : MbPrice = 200;
            break;
        }
        return MbPrice;
    }
    public String getBillInfo1841720149Alief(){
        return "kWH = "+Mkwh+"\n"+
                "Category = " +Mcategory +"("+getBasePrice1841720149Alief()+"per kWH)\n";
    }
}