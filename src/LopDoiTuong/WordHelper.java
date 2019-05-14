/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopDoiTuong;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;

/**
 *
 * @author hantr
 */
public class WordHelper {

    public static void writeMayTinh(File file, ArrayList<MayTinh> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableMayTinh(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeKhachHang(File file, ArrayList<KhachHang> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableKhachHang(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }
    public static void writeKhachHangTheoTen(File file, ArrayList<ThongKeKhachHangType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableThongKeKhachHang(document, list,"Tên khách hàng");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }
    public static void writeKhachHangTheoGioiTinh(File file, ArrayList<ThongKeKhachHangType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableThongKeKhachHang(document, list,"Giới tính");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }
    public static void writeKhachHangTheoDiaChi(File file, ArrayList<ThongKeKhachHangType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableThongKeKhachHang(document, list,"Địa chỉ");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }
    public static void writeKhachHangTheoNamSinh(File file, ArrayList<ThongKeKhachHangType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableThongKeKhachHang(document, list,"Năm sinh");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMayTinhTheoTen(File file, ArrayList<ThongKeMayTinhType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableMayTinhType(document, list, "Tên máy tính");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMayTinhTheoNhaSanXuat(File file, ArrayList<ThongKeMayTinhType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableMayTinhType(document, list, "Nhà sản xuất");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMayTinhTheoNamSanXuat(File file, ArrayList<ThongKeMayTinhType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableMayTinhType(document, list, "Năm sản xuất");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMayTinhTheoThoiGianBaoHanh(File file, ArrayList<ThongKeMayTinhType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableMayTinhType(document, list, "Số tháng bảo hành");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMayTinhTheoGiaNhap(File file, ArrayList<ThongKeMayTinhType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableMayTinhType(document, list, "Giá nhập");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMayTinhTheoGiaBan(File file, ArrayList<ThongKeMayTinhType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableMayTinhType(document, list, "Giá bán");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMayTinhTheoMauSac(File file, ArrayList<ThongKeMayTinhType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableMayTinhType(document, list, "Màu sắc");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    private static void createTableMayTinh(XWPFDocument document, ArrayList<MayTinh> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(1000)); // set chiều rộng

        createNewCell(tittleRow, "Mã", 500, 1);
        createNewCell(tittleRow, "Tên máy tính", 2700, 2);
        createNewCell(tittleRow, "Nhà sản xuất", 2000, 3);
        createNewCell(tittleRow, "Năm sản xuất", 2000, 4);
        createNewCell(tittleRow, "Thời gian bảo hành", 2000, 5);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            MayTinh o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getMaMayTinh() + "", false);
            format(row.getCell(2), o.getTenMayTinh() + "", false);
            format(row.getCell(3), o.getNhaSanXuat() + "", false);
            format(row.getCell(4), o.getNamSanXuat() + "", false);
            format(row.getCell(5), o.getThoiGianBaoHanh() + "", false);

        }
    }

    private static void createTableKhachHang(XWPFDocument document, ArrayList<KhachHang> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(1000)); // set chiều rộng

        createNewCell(tittleRow, "Mã khách hàng", 1000, 1);
        createNewCell(tittleRow, "Tên khách hàng", 3000, 2);
        createNewCell(tittleRow, "Điện thoại", 1500, 3);
        createNewCell(tittleRow, "Địa chỉ", 2000, 4);
        createNewCell(tittleRow, "Số chứng minh", 2000, 5);
        createNewCell(tittleRow, "Ngày sinh ", 2000, 6);
        createNewCell(tittleRow, "Giới tính ", 2000, 7);
        createNewCell(tittleRow, "Email", 2700, 8);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            KhachHang o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getMaKhachHang() + "", false);
            format(row.getCell(2), o.getTenKhachHang() + "", false);
            format(row.getCell(3), o.getSdtKhachHang() + "", false);
            format(row.getCell(4), o.getDiachi() + "", false);
            format(row.getCell(5), o.getSoCMT() + "", false);
            format(row.getCell(6), o.getNgaySinh()+ "", false);
            format(row.getCell(7), o.getGioiTinh()+ "", false);
            format(row.getCell(8), o.getEmailKhachHang()+ "", false);

        }
    }
    private static void createTableThongKeKhachHang(XWPFDocument document, ArrayList<ThongKeKhachHangType> list,String tieuChi) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(1000)); // set chiều rộng

        
        createNewCell(tittleRow, ""+tieuChi, 3000, 1);
        createNewCell(tittleRow, "Số lượng khách hàng ", 2900, 2);
       

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            ThongKeKhachHangType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getThuocTinh()+ "", false);
            format(row.getCell(2), o.getSoLuong()+ "", false);
           

        }
    }

    private static void createTableMayTinhType(XWPFDocument document, ArrayList<ThongKeMayTinhType> list, String tieuChi) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng
        createNewCell(tittleRow, "" + tieuChi, 2000, 1);
        createNewCell(tittleRow, "Số lượng", 1700, 2);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            ThongKeMayTinhType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getThuocTinh() + "", false);
            format(row.getCell(2), o.getSoLuong() + "", false);

        }
    }

    private static XWPFDocument loadHeader(String tittle) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\hantr\\Documents\\tittle may tinh.docx"));
        // load header
        XWPFDocument document = new XWPFDocument(fis);
        List<XWPFParagraph> paragraphList = document.getParagraphs();

        // tạo tiêu đề biểu mẫu
        XWPFParagraph paragraphTittle = document.createParagraph();
        paragraphTittle.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun runTittle = paragraphTittle.createRun();
        runTittle.setBold(true);
        //runTittle.setItalic(true);
        runTittle.setFontFamily("Times New Roman");//set Kiểu chữ
        runTittle.setFontSize(16);//set size text
        runTittle.setColor("000000");// set color text
        runTittle.setText(tittle);// set content text
        runTittle.addBreak();
        runTittle.setText("                                                                                Hà Nội, " + java.time.LocalDate.now());// set content text

        return document;
    }

    private static void loadFooter(XWPFDocument document) {
        // tạo footer
        XWPFParagraph paragraphFooter = document.createParagraph();
//        paragraphFooter.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun runF1 = paragraphFooter.createRun();
        runF1.addBreak();
        runF1.setBold(true);
        runF1.setFontFamily("Times New Roman");//set Kiểu chữ
        runF1.setFontSize(12);//set size text
        runF1.setColor("000000");// set color text
        runF1.setText("                           Người lập                                            "
                + "                         Xác nhận của chủ quán");// set content text
        runF1.addBreak();

        XWPFRun runF2 = paragraphFooter.createRun();
        runF2.setItalic(true);
        runF2.setFontFamily("Times New Roman");//set Kiểu chữ
        runF2.setFontSize(12);//set size text
        runF2.setColor("000000");// set color text
        runF2.setText("                   (Ký và ghi rõ họ tên)                                            "
                + "                         (Ký và ghi rõ họ tên)");// set content text
    }

    private static void format(XWPFTableCell cell, String s, boolean b) {
        cell.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);// chính giữa theo chiều cao
        XWPFParagraph p = cell.getParagraphs().get(0);//lấy doạn văn bản
        p.setIndentationLeft(10);// tương đượng padding left
        p.setIndentationRight(10);// tương đượng padding right
        p.setAlignment(ParagraphAlignment.CENTER);// căn giữa văn bản
        XWPFRun r = p.createRun();// nội dung
        r.setBold(b);
        r.setFontFamily("Times New Roman");//set Kiểu chữ
        r.setFontSize(11);//set size text
        r.setColor("000000");// set color text
        r.setText(s);// set content text
    }

    private static void createNewCell(XWPFTableRow tittleRow, String s, int i, int stt) {
        tittleRow.addNewTableCell();// tạo cell mới
        format(tittleRow.getCell(stt), s, true);
        tittleRow.getCell(stt).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(i));
    }

    public static void setTableAlign(XWPFTable table, ParagraphAlignment align) {
        CTTblPr tblPr = table.getCTTbl().getTblPr();
        CTJc jc = (tblPr.isSetJc() ? tblPr.getJc() : tblPr.addNewJc());
        STJc.Enum en = STJc.Enum.forInt(align.getValue());
        jc.setVal(en);
    }

}
