package job10;
public class Tester1841720149Alief {
    public static void main(String[] args) {
        PermanentEmployee1841720149Alief pEmp = new PermanentEmployee1841720149Alief("Dorp", 500);
        InternshipEmployee1841720149Alief iEmp = new InternshipEmployee1841720149Alief("Slashinging", 5);
        ElectricityBill1841720149Alief eBill = new ElectricityBill1841720149Alief(5, "C-4");
        Employee1841720149Alief e;
        Payable1841720149Alief p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}