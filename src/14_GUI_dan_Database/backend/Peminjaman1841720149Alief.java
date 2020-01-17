package backend;

import backend.Buku1841720149Alief;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Peminjaman1841720149Alief {
    private int mIdpeminjaman, mIdanggota, mIdbuku;
    private Anggota1841720149Alief mAnggota = new 1841720149Alief();
    private Buku1841720149Alief = new Buku1841720149Alief();
    private String mTanggalPinjam;
    private String mTanggalKembali;

    public Peminjaman1841720149Alief() {

    }

    public Peminjaman1841720149Alief(Anggota1841720149Alief anggota, Buku1841720149Alief buku, String tanggalpinjam, String tanggalkembali) {
        this.mAnggota = anggota;
        this.mBuku = buku;
        this.mTanggalPinjam = tanggalpinjam;
        this.mTanggalKembali = tanggalkembali;
    }

    public int getmIdanggotaAlief() {
        return mIdanggota;
    }

    public void setmIdanggotaAlief(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public int getmIdbukuAlief() {
        return mIdbuku;
    }

    public void setmIdbukuAlief(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public int getmIdpeminjamanAlief() {
        return mIdpeminjaman;
    }

    public void setmIdpeminjamanAlief(int mIdpeminjaman) {
        this.mIdpeminjaman = mIdpeminjaman;
    }

    public Anggota1841720149Alief getmAnggotaAlief() {
        return mAnggota;
    }

    public void setmAnggotaAlief(Anggota1841720149Alief mAnggota) {
        this.mAnggota = mAnggota;
    }

    public Buku1841720149Alief getmBukuAlief() {
        return mBuku;
    }

    public void setmBukuAlief(Buku1841720149Alief mBuku) {
        this.mBuku = mBuku;
    }

    public String getmTanggalPinjamAlief() {
        return mTanggalPinjam;
    }

    public void setmTanggalPinjamAlief(String mTanggalPinjam) {
        this.mTanggalPinjam = mTanggalPinjam;
    }

    public String getmTanggalKembaliAlief() {
        return mTanggalKembali;
    }

    public void setmTanggalKembaliAlief(String mTanggalKembali) {
        this.mTanggalKembali = mTanggalKembali;
    }

    public Peminjaman1841720149Alief getByIdAlief(int id) {
        Peminjaman1841720149Alief pinjam = new Peminjaman1841720149Alief();
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
                + " a.idanggota AS idanggota, "
                + " b.idbuku AS idbuku "
                + " FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + " LEFT JOIN buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                pinjam = new Peminjaman1841720149Alief();
                pinjam.setmIdpeminjamanAlief(rs.getInt("idpeminjaman"));
                pinjam.setmIdanggotaAlief(rs.getInt("idanggota"));
                pinjam.setmIdbukuAlief(rs.getInt("idbuku"));
                pinjam.setmTanggalPinjamAlief(rs.getString("tanggalpinjam"));

                pinjam.setmTanggalKembaliAlief(rs.getString("tanggalkembali"));
                pinjam.setmAnggotaAlief(new Anggota1841720149Alief().getByIdAlief(getmIdanggotaAlief()));
                pinjam.setmBukuAlief(new Buku1841720149Alief().getByIdAlief(pinjam.getmIdbukuAlief()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman1841720149Alief> getAllAlief() {
        ArrayList<Peminjaman1841720149Alief> ListPinjam = new ArrayList<>();
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali, "
                + "a.idanggota AS idanggota, "
                + "b.idbuku AS idbuku "
                + "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720149Alief pinjam = new Peminjaman1841720149Alief();
                pinjam.setmIdpeminjamanAlief(rs.getInt("idpeminjaman"));
                pinjam.setmIdanggotaAlief(rs.getInt("idanggota"));
                pinjam.setmIdbukuAlief(rs.getInt("idbuku"));
                pinjam.setmTanggalPinjamAlief(rs.getString("tanggalpinjam"));

                pinjam.setmTanggalKembaliAlief(rs.getString("tanggalkembali"));
                pinjam.setmAnggotaAlief(new Anggota1841720149Alief().getByIdAlief(pinjam.getmIdanggotaAlief()));
                pinjam.setmBukuAlief(new Buku1841720149Alief().getByIdAlief(pinjam.getmIdbukuAlief()));

                ListPinjam.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveAlief() {
        if (getByIdAlief(mIdpeminjaman).getmIdpeminjamanAlief()== 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getmAnggotaAlief().getmIdAnggotaAlief()+ "', "
                    + "'" + this.getmBukuAlief().getmIdBukuAlief()+ "',"
                    + "'" + this.mTanggalPinjam + "', "
                    + "'" + this.mTanggalKembali + "' "
                    + ")";
            this.mIdpeminjaman = DBHelper1841720149Alief.insertQueryGetIdAlief(sql);
        } else {
            String sql = "UPDATE buku SET "
                    + "idanggota = '" + this.getmAnggotaAlief().getmIdAnggotaAlief()+ "', "
                    + "idbuku = '" + this.getmBukuAlief().getmIdBukuAlief()+ "', "
                    + "tanggalpinjam = '" + this.mTanggalPinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalKembali + "'";
            DBHelper1841720149Alief.executeQueryAlief(sql);
        }
    }

    public void cariAnggotaAlief(int id) {
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                getmAnggotaAlief().setmIdAnggotaAlief(rs.getInt("idanggota"));
                getmAnggotaAlief().setmNamaAlief(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuAlief(int id) {
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT * FROM buku WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                getmBukuAlief().setmIdBukuAlief(rs.getInt("idbuku"));
                getmBukuAlief().setmJudulAlief(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAlief() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1841720149Alief.executeQueryAlief(sql);
    }
}