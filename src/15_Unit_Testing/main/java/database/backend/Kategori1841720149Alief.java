package backend;
import java.util.ArrayList;
import java.sql.*;
public class Kategori1841720149Alief {
    private int idkategori;
    private String nama;
    private String keterangan;

    public int getIdkategoriAlief() {
        return idkategori;
    }

    public void setIdkategoriAlief(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNamaAlief() {
        return nama;
    }

    public void setNamaAlief(String nama) {
        this.nama = nama;
    }

    public String getKeteranganAlief() {
        return keterangan;
    }

    public void setKeteranganAlief(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1841720149Alief() {
    }

    public Kategori1841720149Alief(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public Kategori1841720149Alief getByIdAlief(int id){
        Kategori1841720149Alief kat = new Kategori1841720149Alief();
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT * FROM kategori " 
                                            + " WHERE idkategori = '" + id + "'");
    
    try
    {
        while(rs.next())
        {
            kat = new Kategori1841720149Alief();
            kat.setIdkategoriAlief(rs.getInt("idkategori"));
            kat.setNamaAlief(rs.getString("nama"));
            kat.setKeteranganAlief(rs.getString("keterangan"));
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return kat;
}
    public ArrayList<Kategori1841720149Alief> getAllAlief(){
        ArrayList<Kategori1841720149Alief> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT * FROM kategori");
    
    try
    {
        while(rs.next())
        {
            Kategori1841720149Alief kat = new Kategori1841720149Alief();
            kat.setIdkategoriAlief(rs.getInt("idkategori"));
            kat.setNamaAlief(rs.getString("nama"));
            kat.setKeteranganAlief(rs.getString("keterangan"));
            
            ListKategori.add(kat);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return ListKategori;
}
    public ArrayList<Kategori1841720149Alief> searchAlief(String keyword){
        ArrayList<Kategori1841720149Alief> ListKategori = new ArrayList();
        
        String sql = "SELECT * FROM kategori WHERE "
                + "     nama LIKE '%" + keyword + "%' "
                + "     OR keterangan LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief(sql);
    
    try
    {
        while(rs.next())
        {
            Kategori1841720149Alief kat = new Kategori1841720149Alief ();
            kat.setIdkategoriAlief(rs.getInt("idkategori"));
            kat.setNamaAlief(rs.getString("nama"));
            kat.setKeteranganAlief(rs.getString("keterangan"));
            
            ListKategori.add(kat);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return ListKategori;
}
    public void saveAlief(){
        if(getByIdAlief(idkategori).getIdkategoriAlief()== 0){
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + "     '" + this.nama + "', "
                    + "     '" + this.keterangan + "' "
                    + "     )";
            this.idkategori = DBHelper1841720149Alief.insertQueryGetIdAlief(SQL);
        }
        else
        {
            String SQL = "UPDATE kategori SET "
                    + "     nama = '" + this.nama + "', "
                    + "     keterangan = '" + this.keterangan + "' "
                    + "     WHERE idkategori = '" + this.idkategori + "'";
            DBHelper1841720149Alief.executeQueryAlief(SQL);
        }
    }
    public void delete()
    {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper1841720149Alief.executeQueryAlief(SQL);
    }
}