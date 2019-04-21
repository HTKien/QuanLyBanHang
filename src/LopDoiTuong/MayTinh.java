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
    //cac ham doi voi MayTinh 
    
    //hàm load dữ liệu lên một array list : 
    public static ArrayList<MayTinh> getList(String sql ) throws ClassNotFoundException, SQLException{
        ArrayList<MayTinh> list = new ArrayList<>();
        KetNoiQLBH ketNoiQLBH= new KetNoiQLBH(); 
        Connection connection= ketNoiQLBH.getJDBCConnect();
        Statement statement = connection.createStatement(); 
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            list.add(new MayTinh(
            resultSet.getInt("maMayTinh"), 
            resultSet.getString("tenMayTinh"), 
            resultSet.getString("nhaSanXuat"),
            resultSet.getInt("namSanXuat"),
            resultSet.getInt("thoiGianBaoHanh")));
            
            
        }
        connection.close();
        return list; 
        
    }
    //hàm thêm máy tính : 
    public static int themMayTinh(MayTinh o) throws ClassNotFoundException{
        String sql = "insert into maytinh values ('"+o.getMaMayTinh()+"','" +o.getTenMayTinh()+"','"+o.getNhaSanXuat()+"','"+o.getNamSanXuat()+"','"+o.getThoiGianBaoHanh()+"') "; 
        return interact(sql );
    }
    //hàm sửa máy tính :
    public static int suaMayTinh(MayTinh o) throws ClassNotFoundException{
        String sql = "update maytinh set tenMayTinh='"+o.getTenMayTinh()+"',nhaSanXuat='"+o.getNhaSanXuat()+"',namSanXuat='"+o.getNamSanXuat()+"',thoiGianBaoHanh='"+o.getThoiGianBaoHanh()+"' where maMayTinh='"+o.getMaMayTinh()+"'"; 
        return interact(sql); 
    }
    //hàm xóa máy tính: 
    public static int xoaMayTinh(MayTinh o) throws ClassNotFoundException{
        String sql ="delete from maytinh where maMayTinh = '"+o.getMaMayTinh()+"';"; 
        return interact(sql); 
    }
    //hàm tìm kiếm máy tính: 
    //ham doc ma may tinh :
    
    
   
    
    //hàm để thực thi câu lệnh sql : 
    public static int interact(String sql) throws ClassNotFoundException {
        int result = -1;
        try {
            KetNoiQLBH connectDatabase = new KetNoiQLBH();
            Connection connection = connectDatabase.getJDBCConnect();
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static ArrayList<MayTinh> loadListMayTinhKien() throws ClassNotFoundException, SQLException{
            ArrayList<MayTinh> listMayTinhs= new ArrayList<>(); 

        String sql = "select * from maytinh";
        KetNoiQLBH ketNoiQLBH= new KetNoiQLBH(); 
        Connection connection= ketNoiQLBH.getJDBCConnect();
        Statement statement = connection.createStatement(); 
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            listMayTinhs.add(new MayTinh(
            resultSet.getInt("maMayTinh"), 
            resultSet.getString("tenMayTinh"), 
            resultSet.getString("nhaSanXuat"),
            resultSet.getInt("namSanXuat"),
            resultSet.getInt("thoiGianBaoHanh")));
            
            
        }
        connection.close();
        
        return listMayTinhs; 
        
    }
    
    
    
    
}
