package Relasi;
public class MainPercobaan1_1841720149Alief {
    public static void main(String[] args) {
    Processor1841720149Alief p = new Processor1841720149Alief("Intel Core i5-8250U", 4);
    Laptop1841720149Alief L = new Laptop1841720149Alief("Lenovo ThinkPad ", new Processor1841720149Alief("Intel i5", 3));
    L.info1841720149Alief();
    
    Processor1841720149Alief p1 = new Processor1841720149Alief();
    p1.setMerk1841720149Alief("Intel Core i7-8550U");
    p1.setCache1841720149Alief(6);
    Laptop1841720149Alief L1 = new Laptop1841720149Alief();
    L1.setMerk1841720149Alief("Lenovo Thinkpad ");
    L1.setProc1841720149Alief(p1);
    L1.info1841720149Alief();
}
}