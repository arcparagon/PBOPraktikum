
    package inheritancelima;
    public class Karyawan {
        public  String nama, alamat, jk;
        public int umur,gaji;
    
         public Karyawan(){

        }
        public Karyawan(String nama, String alamat, String jk, int umur, int gaji ){
        this.nama=nama;
        this.alamat=alamat;
        this.jk=jk;
        this.umur=umur;
        this.gaji=gaji;
        }
        public void tampilDataKaryawan(){
            System.out.println("nama             ="+nama);
            System.out.println("alamat           ="+alamat);
            System.out.println("jenis kelamin    ="+jk);
            System.out.println("Umur             ="+umur);
            System.out.println("gaji             ="+gaji);
        }
}