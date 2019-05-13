package LopDoiTuong;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hantr
 */
public class MayTinhChiTiet {

    //các thuộc tinh: 
    private int maMayTinhChiTiet;
    private int maMayTinh;
    private String moTa;
    private double giaNhap;
    private double giaBan;
    private String cauHinh;
    private String mauSac;
    private int soLuongTonKho;
    //constructor : 

    public MayTinhChiTiet() {
    }

    public MayTinhChiTiet(int maMayTinhChiTiet, int maMayTinh, String moTa, double giaNhap, double giaBan, String cauHinh, String mauSac, int soLuongTonKho) {
        this.maMayTinhChiTiet = maMayTinhChiTiet;
        this.maMayTinh = maMayTinh;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.cauHinh = cauHinh;
        this.mauSac = mauSac;
        this.soLuongTonKho = soLuongTonKho;
    }
    //cac phuong thuc setter va getter : 

    public int getMaMayTinhChiTiet() {
        return maMayTinhChiTiet;
    }

    public void setMaMayTinhChiTiet(int maMayTinhChiTiet) {
        this.maMayTinhChiTiet = maMayTinhChiTiet;
    }

    public int getMaMayTinh() {
        return maMayTinh;
    }

    public void setMaMayTinh(int maMayTinh) {
        this.maMayTinh = maMayTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public void setCauHinh(String cauHinh) {
        this.cauHinh = cauHinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }
    //cac ham doi voi MayTinhChiTiet: 

    //hàm load dữ liệu lên một array list : 
    public static ArrayList<MayTinhChiTiet> getList() throws ClassNotFoundException, SQLException {
        ArrayList<MayTinhChiTiet> list = new ArrayList<>();
        String sql = "select * from maytinhchitiet ;";
        KetNoiQLBH ketNoiQLBH = new KetNoiQLBH();
        Connection connection = ketNoiQLBH.getJDBCConnect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new MayTinhChiTiet(
                    resultSet.getInt("maMayTinhChiTiet"),
                    resultSet.getInt("maMayTinh"),
                    resultSet.getString("moTa"),
                    resultSet.getDouble("giaNhap"),
                    resultSet.getDouble("giaBan"),
                    resultSet.getString("cauHinh"),
                    resultSet.getString("mauSac"),
                    resultSet.getInt("soLuongTonKho")));

        }
        connection.close();
        return list;

    }

    public static int add(MayTinhChiTiet o) throws ClassNotFoundException {
        String sql = "insert into  maytinhchitiet values("
                + o.getMaMayTinhChiTiet() + ", '"
                + o.getMaMayTinh() + "',' "
                + o.getMoTa() + "', '"
                + o.getGiaNhap() + "', '"
                + o.getGiaBan() + "', '"
                + o.getCauHinh() + "', '"
                + o.getMauSac() + "', '"
                + o.getSoLuongTonKho() + "'"
                + ");";
        return interact(sql);
    }

    public static int interact(String sql) throws ClassNotFoundException {
        int result = -1;
        try {
            KetNoiQLBH ketNoiQLTV = new KetNoiQLBH();
            Connection connection = ketNoiQLTV.getJDBCConnect();
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
