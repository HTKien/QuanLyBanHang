/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopDoiTuong;

import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author hantr
 */
public class KhachHang {

    private int maKhachHang;
    private String tenKhachHang;
    private String sdtKhachHang;
    private String diachi;
    private String soCMT;
    private Date ngaySinh; 
    private String gioiTinh;
    private String emailKhachHang;

    public KhachHang() {
    }

    public KhachHang(int maKhachHang, String tenKhachHang, String sdtKhachHang, String diachi, String soCMT, Date ngaySinh, String gioiTinh, String emailKhachHang) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.sdtKhachHang = sdtKhachHang;
        this.diachi = diachi;
        this.soCMT = soCMT;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.emailKhachHang = emailKhachHang;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSdtKhachHang() {
        return sdtKhachHang;
    }

    public void setSdtKhachHang(String sdtKhachHang) {
        this.sdtKhachHang = sdtKhachHang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmailKhachHang() {
        return emailKhachHang;
    }

    public void setEmailKhachHang(String emailKhachHang) {
        this.emailKhachHang = emailKhachHang;
    }

   

   

    

    public static ArrayList<KhachHang> getlist() throws ClassNotFoundException, SQLException {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "select * from khachhang ;";
        KetNoiQLBH ketNoiQLBH = new KetNoiQLBH();
        Connection connection = ketNoiQLBH.getJDBCConnect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new KhachHang(
                    resultSet.getInt("maKhachHang"),
                    resultSet.getString("tenKhachHang"),
                    resultSet.getString("sdtKhachHang"),
                    resultSet.getString("diachi"),
                    resultSet.getString("soCMT"),
                    resultSet.getDate("ngaySinh"),
                    resultSet.getString("gioiTinh"),
                    resultSet.getString("emailKhachHang")
            ));
        }

        return list;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<KhachHang> list = new ArrayList<>();
        list = KhachHang.getlist();

        System.out.println("so khach hang trong danh sach la: " + list.size());
        System.out.println("tên khách hàng đầu tiên là: " + list.get(0).getTenKhachHang());

    }

    public static int add(KhachHang o) throws ClassNotFoundException {
        String sql = "insert into  khachhang values("
                + o.getMaKhachHang() + ", '"
                + o.getTenKhachHang() + "',' "
                + o.getSdtKhachHang() + "', '"
                + o.getDiachi() + "', '"
                + o.getSoCMT() + "', '"
                + new SimpleDateFormat("yyyy-MM-dd").format(o.getNgaySinh()) + "', '"
                + o.getGioiTinh() + "', '"
                + o.getEmailKhachHang() + "'"
                + ");";
        return interact(sql);
    }

    public static int interact(String sql) throws ClassNotFoundException {
        int result = -1;
        try {
            KetNoiQLBH ketNoiQLBH = new KetNoiQLBH();
            Connection connection = ketNoiQLBH.getJDBCConnect();
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
