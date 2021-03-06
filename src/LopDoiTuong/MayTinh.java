package LopDoiTuong;

import LopDoiTuong.KetNoiQLBH;
import static LopDoiTuong.KetNoiQLBH.getJDBCConnect;
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
public class MayTinh {

    //cac thuoc tinh 
    private int maMayTinh;
    private String tenMayTinh;
    private String nhaSanXuat;
    private int namSanXuat;
    private int thoiGianBaoHanh;
    //constructor 

    public MayTinh() {
    }

    public MayTinh(int maMayTinh, String tenMayTinh, String nhaSanXuat, int namSanXuat, int thoiGianBaoHanh) {
        this.maMayTinh = maMayTinh;
        this.tenMayTinh = tenMayTinh;
        this.nhaSanXuat = nhaSanXuat;
        this.namSanXuat = namSanXuat;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    //setter va getter

    public int getMaMayTinh() {
        return maMayTinh;
    }

    public void setMaMayTinh(int maMayTinh) {
        this.maMayTinh = maMayTinh;
    }

    public String getTenMayTinh() {
        return tenMayTinh;
    }

    public void setTenMayTinh(String tenMayTinh) {
        this.tenMayTinh = tenMayTinh;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public static ArrayList<MayTinh> getlistMaytinh() throws ClassNotFoundException, SQLException {
        ArrayList<MayTinh> listMayTinhs = new ArrayList<>();
        String sql = "select * from maytinh ;";
        KetNoiQLBH ketNoiQLBH = new KetNoiQLBH();
        Connection connection = ketNoiQLBH.getJDBCConnect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            listMayTinhs.add(new MayTinh(
                    resultSet.getInt("maMayTinh"),
                    resultSet.getString("tenMayTinh"),
                    resultSet.getString("nhaSanXuat"),
                    resultSet.getInt("namSanXuat"),
                    resultSet.getInt("thoiGianBaoHanh")
            ));
        }

        return listMayTinhs;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<MayTinh> listMayTinhs = getlistMaytinh();
        System.out.println("Tong so may tinh trong kho la: " + listMayTinhs.size());

    }

    public static int add(MayTinh o) throws ClassNotFoundException {
        String sql = "insert into  maytinh values("
                + o.getMaMayTinh() + ", '"
                + o.getTenMayTinh() + "',' "
                + o.getNhaSanXuat() + "', '"
                + o.getNamSanXuat() + "', '"
                + o.getThoiGianBaoHanh() + "'"
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
