/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopDoiTuong;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.reflect.generics.scope.ClassScope;

/**
 *
 * @author hantr
 */
public class KetNoiQLBH {

//    public static Connection getJDBCConnect() throws ClassNotFoundException {
//        Connection connection = null;
//
//        final String url = "jdbc:mysql://localhost:3306/qlbh";
//        final String password = "175065539";
//        final String user = "root";
//
//        try {
//            Class.forName("com/mysql/cj/jdbc/Driver");
//
//            connection = DriverManager.getConnection(url, user, password);
//        } catch (SQLException ex) {
//            Logger.getLogger(KetNoiQLBH.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return connection;
//
//    }
//
//    public static void main(String[] args) {
//        Connection con = null;
//        try {
//            con = getJDBCConnect();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(KetNoiQLBH.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        if (con != null) {
//            System.out.println("Kết nối thành công với cơ sở dữ liệu!");
//        } else {
//            System.out.println("Kết nối thất bại!");
//        }
//
//    }
    public static Connection getJDBCConnect(){
        final String url ="jdbc:mysql://localhost:3306/qlbh?useUnicode=true&characterEncoding=utf-8"; 
        final String password="175065539"; 
        final String user = "root"; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            return DriverManager.getConnection(url, user, password); 
        } catch (ClassNotFoundException | SQLException e) {
        }
        return null; 
    }
    public static void main(String[] args) throws SQLException {
        //ket noi java voi mysql 
        Connection conn = getJDBCConnect() ;
        if(conn!=null){
                System.out.println(" Kết nối thành công với cơ sở dữ liệu!");

        }else{
                System.out.println("Kết nối thất bại");

        }
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/quan_ly_thu_vien","root","");
//            if(conn!=null){
//                System.out.println(" Kết nối thành công với cơ sở dữ liệu!");
//            }
//        } catch (SQLException e) { 
//                System.out.println("Kết nối thất bại");
//        }
        //doc du lieu tu mysql 
        
    }

}
