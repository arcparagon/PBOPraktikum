package backend;

import backend.DBHelper1841720149Alief;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Anggota1841720149Alief {
    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720149Alief() {
    }

    public Anggota1841720149Alief(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getmIdAnggotaAlief() {
        return mIdAnggota;
    }

    public void setmIdAnggotaAlief(int idAnggota) {
        this.mIdAnggota = idAnggota;
    }

    public String getmNamaAlief() {
        return mNama;
    }

    public void setmNamaAlief(String nama) {
        this.mNama = nama;
    }

    public String getmAlamatAlief() {
        return mAlamat;
    }

    public void setmAlamatAlief(String alamat) {
        this.mAlamat = alamat;
    }

    public String getmTeleponAlief() {
        return mTelepon;
    }

    public void setmTeleponAlief(String telepon) {
        this.mTelepon = telepon;
    }

    public Anggota1841720149Alief getByIdAlief(int id) {
        Anggota1841720149Alief agt = new Anggota1841720149Alief();
        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720149Alief();
                agt.setmIdAnggotaAlief(rs.getInt("idAnggota"));
                agt.setmNamaAlief(rs.getString("nama"));
                agt.setmAlamatAlief(rs.getString("alamat"));
                agt.setmTeleponAlief(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720149Alief> getAllAlief() {
        ArrayList<Anggota1841720149Alief> listAnggota1841720149Alief = new ArrayList<>();

        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720149Alief agt = new Anggota1841720149Alief();
                agt.setmIdAnggotaAlief(rs.getInt("idAnggota"));
                agt.setmNamaAlief(rs.getString("nama"));
                agt.setmAlamatAlief(rs.getString("alamat"));
                agt.setmTeleponAlief(rs.getString("telepon"));

                listAnggota1841720149Alief.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listAnggota1841720149Alief;
    }

    public ArrayList<Anggota1841720149Alief> searchAlief(String keyword) {
        ArrayList<Anggota1841720149Alief> listAnggota1841720149Alief = new ArrayList<>();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720149Alief.selectQueryAlief(sql);

        try {
            while (rs.next()) {
                Anggota1841720149Alief agt = new Anggota1841720149Alief();
                agt.setmIdAnggotaAlief(rs.getInt("idAnggota"));
                agt.setmNamaAlief(rs.getString("nama"));
                agt.setmAlamatAlief(rs.getString("alamat"));
                agt.setmTeleponAlief(rs.getString("telepon"));

                listAnggota1841720149Alief.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listAnggota1841720149Alief;
    }

    public void saveAlief() {
        if (getByIdAlief(mIdAnggota).getmIdAnggotaAlief()== 0) {
            String SQL = "Insert into anggota (nama,alamat,telepon) values("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "' "
                    + " )";
            this.mIdAnggota = DBHelper1841720149Alief.insertQueryGetIdAlief(SQL);
        } else {
            String SQL = "Update anggota set"
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + "Where idAnggota = '" + this.mIdAnggota + "'";
            DBHelper1841720149Alief.executeQueryAlief(SQL);
        }
    }

    public void deleteAlief() {
        String SQL = "DELETE FROM anggota WHERE idAnggota = '" + this.mIdAnggota + "'";
        DBHelper1841720149Alief.executeQueryAlief(SQL);
    }
}
