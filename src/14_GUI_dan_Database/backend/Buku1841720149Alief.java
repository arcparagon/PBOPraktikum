package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Buku1841720149Alief {

    private int mIdBuku;
    private Kategori1841720149Alief mKategori = new Kategori1841720149Alief();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public Buku1841720149Alief() {
    }

    public Buku1841720149Alief(Kategori1841720149Alief mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public int getmIdBukuAlief() {
        return mIdBuku;
    }

    public void setmIdBukuAlief(int mIdBuku) {
        this.mIdBuku = mIdBuku;
    }

    public Kategori1841720149Alief getmKategoriAlief() {
        return mKategori;
    }

    public void setmKategoriAlief(Kategori1841720149Alief mKategori) {
        this.mKategori = mKategori;
    }

    public String getmJudulAlief() {
        return mJudul;
    }

    public void setmJudulAlief(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmPenerbitAlief() {
        return mPenerbit;
    }

    public void setmPenerbitAlief(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getmPenulisAlief() {
        return mPenulis;
    }

    public void setmPenulisAlief(String mPenulis) {
        this.mPenulis = mPenulis;
    }


    public Buku1841720149Alief getByIdAlief(int id) {
        Buku1841720149Alief buku = new Buku1841720149Alief();
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT "
                + "    b.idbuku as idbuku, "
                + "    b.judul as judul,"
                + "    b.penerbit as penerbit, "
                + "    b.penulis as penulis, "
                + "    k.idkategori as idkategori, "
                + "    k.nama as nama, "
                + "    k.keterangan as keterangan"
                + "    FROM buku b "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "    where b.idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku1841720149Alief();
                buku.setmIdBukuAlief(rs.getInt("idBuku"));
                buku.getmKategoriAlief().setmIdkategoriAlief(rs.getInt("idkategori"));
                buku.getmKategoriAlief().setmNamaAlief(rs.getString("nama"));
                buku.getmKategoriAlief().setmKeteranganAlief(rs.getString("keterangan"));
                buku.setmJudulAlief(rs.getString("judul"));
                buku.setmPenerbitAlief(rs.getString("penerbit"));
                buku.setmPenulisAlief(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720149Alief> getAllAlief() {
        ArrayList<Buku1841720149Alief> listBuku1841720149Alief = new ArrayList<>();
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT "
                + "    b.idbuku as idbuku, "
                + "    b.judul as judul, "
                + "    b.penerbit as penerbit,"
                + "    b.penulis as penulis, "
                + "    k.idkategori as idkategori, "
                + "    k.nama as nama, "
                + "    k.keterangan as keterangan "
                + "    FROM buku b "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        try {
            while (rs.next()) {
                Buku1841720149Alief buku = new Buku1841720149Alief();
                buku.setmIdBukuAlief(rs.getInt("idbuku"));
                buku.getmKategoriAlief().setmIdkategoriAlief(rs.getInt("idkategori"));
                buku.getmKategoriAlief().setmNamaAlief(rs.getString("nama"));
                buku.getmKategoriAlief().setmKeteranganAlief(rs.getString("keterangan"));
                buku.setmJudulAlief(rs.getString("judul"));
                buku.setmPenerbitAlief(rs.getString("penerbit"));
                buku.setmPenulisAlief(rs.getString("penulis"));

                listBuku1841720149Alief.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listBuku1841720149Alief;
    }

    public ArrayList<Buku1841720149Alief> searchAlief(String keyword) {
        ArrayList<Buku1841720149Alief> listBuku1841720149Alief = new ArrayList<>();

        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("Select "
                + "    b.idBuku as idbuku,"
                + "    b.judul as judul,"
                + "    b.penerbit as penerbit,"
                + "    b.penulis as penulis,"
                + "    k.idkategori as idkategori,"
                + "    k.nama as nama,"
                + "    k.keterangan as keterangan "
                + "    FROM buku b "
                + "    left join kategori k on b.idkategori = k.idkategori "
                + "    where b.judul like '%" + keyword + "%' "
                + "    OR b.penerbit like '%" + keyword + "%' "
                + "    OR b.penulis LIKE '%" + keyword + "%' ");
        try {
            while (rs.next()) {
                Buku1841720149Alief buku = new Buku1841720149Alief();
                buku.setmIdBukuAlief(rs.getInt("idbuku"));
                buku.getmKategoriAlief().setmIdkategoriAlief(rs.getInt("idkategori"));
                buku.getmKategoriAlief().setmNamaAlief(rs.getString("nama"));
                buku.getmKategoriAlief().setmKeteranganAlief(rs.getString("keterangan"));
                buku.setmJudulAlief(rs.getString("judul"));
                buku.setmPenerbitAlief(rs.getString("penerbit"));
                buku.setmPenerbitAlief(rs.getString("penulis"));

                listBuku1841720149Alief.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBuku1841720149Alief;
    }

    public void saveAlief() {
        if (getByIdAlief(mIdBuku).getmIdBukuAlief()== 0) {
            String SQL = "INSERT INTO buku (idkategori, judul, penulis, penerbit) VALUES("
                    + " '" + this.getmKategoriAlief().getmIdkategoriAlief() + "', "
                    + " '" + this.mJudul + "', "
                    + " '" + this.mPenulis + "', "
                    + " '" + this.mPenerbit + "' "
                    + " )";
            this.mIdBuku = DBHelper1841720149Alief.insertQueryGetIdAlief(SQL);
        } else {
            String SQL = "UPDATE buku set "
                    + " idkategori = '" + this.getmKategoriAlief().getmIdkategoriAlief() + "', "
                    + " judul = '" + this.mJudul + "', "
                    + " penulis = '" + this.mPenulis + "', "
                    + " penerbit = '" + this.mPenerbit + "' "
                    + " WHERE idbuku = '" + this.mIdBuku + "'";
            DBHelper1841720149Alief.executeQueryAlief(SQL);
        }
    }

    public void deleteAlief() {
        String SQL = "DELETE FROM buku where idbuku = '" + this.mIdBuku + "'";
        DBHelper1841720149Alief.executeQueryAlief(SQL);
    }
}
