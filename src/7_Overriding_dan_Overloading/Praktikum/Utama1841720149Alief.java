package jobsheet7;
public class Utama1841720149Alief {
    public static void main(String[] args) {
        System.out.println("Beta Test Class Manager & Staff: ");
        Manager1841720149Alief man[] = new Manager1841720149Alief[2];
        Staff1841720149Alief staff1[] = new Staff1841720149Alief[2];
        Staff1841720149Alief staff2[] = new Staff1841720149Alief[3];
        
        //making some managers
        
        man[0]=new Manager1841720149Alief();
        man[0].setNama1841720149Alief("Superman");
        man[0].setNip1841720149Alief("212");
        man[0].setGolongan1841720149Alief("1");
        man[0].setTunjangan1841720149Alief(5000000);
        man[0].setBagian1841720149Alief("Administrator");
        
        man[1]=new Manager1841720149Alief();
        man[1].setNama1841720149Alief("Lucifer");
        man[1].setNip1841720149Alief("619");
        man[1].setGolongan1841720149Alief("1");
        man[1].setTunjangan1841720149Alief(2500000);
        man[1].setBagian1841720149Alief("Marketing");
        
        staff1[0]=new Staff1841720149Alief();
        staff1[0].setNama1841720149Alief("Succubus");
        staff1[0].setNip1841720149Alief("316");
        staff1[0].setGolongan1841720149Alief("2");
        staff1[0].setLembur1841720149Alief(10);
        staff1[0].setGajiLembur1841720149Alief(10000);
        
        staff1[1]=new Staff1841720149Alief();
        staff1[1].setNama1841720149Alief("Azazel");
        staff1[1].setNip1841720149Alief("450");
        staff1[1].setGolongan1841720149Alief("2");
        staff1[1].setLembur1841720149Alief(10);
        staff1[1].setGajiLembur1841720149Alief(55000);
        man[0].setSt1841720149Alief(staff1);
        
        staff2[0]=new Staff1841720149Alief();
        staff2[0].setNama1841720149Alief("Ixchiel");
        staff2[0].setNip1841720149Alief("505");
        staff2[0].setGolongan1841720149Alief("3");
        staff2[0].setLembur1841720149Alief(15);
        staff2[0].setGajiLembur1841720149Alief(5500);
        
        staff2[1]=new Staff1841720149Alief();
        staff2[1].setNama1841720149Alief("Darklord");
        staff2[1].setNip1841720149Alief("559");
        staff2[1].setGolongan1841720149Alief("4");
        staff2[1].setLembur1841720149Alief(5);
        staff2[1].setGajiLembur1841720149Alief(100000);
        
        staff2[2]=new Staff1841720149Alief();
        staff2[2].setNama1841720149Alief("Virtoz");
        staff2[2].setNip1841720149Alief("238");
        staff2[2].setGolongan1841720149Alief("3");
        staff2[2].setLembur1841720149Alief(6);
        staff2[2].setGajiLembur1841720149Alief(20000);
        man[1].setSt1841720149Alief(staff2);
        
        //print out the informations from manager and staff
        
        man[0].lihatInfo1841720149Alief();
        man[1].lihatInfo1841720149Alief();
    }
}