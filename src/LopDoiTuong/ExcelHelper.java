/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopDoiTuong;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author hantr
 */
public class ExcelHelper {

    public static ArrayList<MayTinh> readMayTinh(File file) throws Exception {
        ArrayList<MayTinh> list = new ArrayList<>();
        // Đọc một file XSL.
        FileInputStream inputStream = new FileInputStream(file);
        String type = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        Iterator<Row> rowIterator = null;
        if (type.equals("xls")) {
            // Đối tượng workbook cho file XSL.
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        } else if (type.equals("xlsx")) {
            // Đối tượng workbook cho file XLSX.
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        }
        rowIterator.next();// tránh dòng đầu - tên của các cột
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // Lấy Iterator cho tất cả các cell của dòng hiện tại.
            Iterator<Cell> cellIterator = row.cellIterator();
            int i = 0;
            MayTinh o = new MayTinh();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (i) {
                    case 0:
                        o.setMaMayTinh((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 1:
                        o.setTenMayTinh(cell.getStringCellValue());
                        i++;
                        break;
                    case 2:
                        o.setNhaSanXuat(cell.getStringCellValue());
                        i++;
                        break;
                    case 3:
                        o.setNamSanXuat((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 4:
                        o.setThoiGianBaoHanh((int) cell.getNumericCellValue());
                        i++;
                        break;

                }
            }
            list.add(o);
        }
        return list;
    }
    public static ArrayList<KhachHang> readKhachHang(File file) throws Exception {
        ArrayList<KhachHang> list = new ArrayList<>();
        // Đọc một file XSL.
        FileInputStream inputStream = new FileInputStream(file);
        String type = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        Iterator<Row> rowIterator = null;
        if (type.equals("xls")) {
            // Đối tượng workbook cho file XSL.
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        } else if (type.equals("xlsx")) {
            // Đối tượng workbook cho file XLSX.
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        }
        rowIterator.next();// tránh dòng đầu - tên của các cột
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // Lấy Iterator cho tất cả các cell của dòng hiện tại.
            Iterator<Cell> cellIterator = row.cellIterator();
            int i = 0;
            KhachHang o = new KhachHang();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (i) {
                    case 0:
                        o.setMaKhachHang((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 1:
                        o.setTenKhachHang(cell.getStringCellValue());
                        i++;
                        break;
                    case 2:
                        o.setSdtKhachHang("0"+String.valueOf((int) cell.getNumericCellValue()));
                        i++;
                        break;
                    case 3:
                        o.setDiachi(cell.getStringCellValue());
                        i++;
                        break;
                    case 4:
                        o.setSoCMT(String.valueOf((int) cell.getNumericCellValue()));
                        i++;
                        break;
                    case 5:
                        o.setNgaySinh( cell.getDateCellValue());
                        i++;
                        break;
                    case 6:
                        o.setGioiTinh(cell.getStringCellValue());
                        i++;
                        break;
                    case 7:
                        o.setEmailKhachHang(cell.getStringCellValue());
                        i++;
                        break;

                }
            }
            list.add(o);
        }
        return list;
    }

    public static ArrayList<MayTinhChiTiet> readMayTinhChiTiet(File file) throws Exception {
        ArrayList<MayTinhChiTiet> list = new ArrayList<>();
        // Đọc một file XSL.
        FileInputStream inputStream = new FileInputStream(file);
        String type = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        Iterator<Row> rowIterator = null;
        if (type.equals("xls")) {
            // Đối tượng workbook cho file XSL.
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        } else if (type.equals("xlsx")) {
            // Đối tượng workbook cho file XLSX.
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        }
        rowIterator.next();// tránh dòng đầu - tên của các cột
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // Lấy Iterator cho tất cả các cell của dòng hiện tại.
            Iterator<Cell> cellIterator = row.cellIterator();
            int i = 0;
            MayTinhChiTiet o = new MayTinhChiTiet();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (i) {
                    case 0:
                        o.setMaMayTinhChiTiet((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 1:
                        o.setMaMayTinh((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 2:
                        o.setMoTa(cell.getStringCellValue());
                        i++;
                        break;
                    case 3:
                        o.setGiaNhap((double) cell.getNumericCellValue());
                        i++;
                        break;
                    case 4:
                        o.setGiaBan((double) cell.getNumericCellValue());
                        i++;
                        break;
                    case 5:
                        o.setCauHinh(cell.getStringCellValue());
                        i++;
                        break;
                    case 6:
                        o.setMauSac(cell.getStringCellValue());
                        i++;
                        break;
                    case 7:
                        o.setSoLuongTonKho((int) cell.getNumericCellValue());
                        i++;
                        break;

                }
            }
            list.add(o);
        }
        return list;
    }

}
