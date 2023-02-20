/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    
    public HoaDon(){
        
    }

    public int maHD;
    public String giamGia ;
    public String VAT;
    public String getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(String giamGia) {
		this.giamGia = giamGia;
	}

	public String getVAT() {
		return VAT;
	}

	public void setVAT(String vAT) {
		VAT = vAT;
	}

	public int maNhanVien;
    public Date ngayXuatHoaDon;
    public float tongTien;

    public HoaDon(int maHD, String giamGia, int maNhanVien, Date ngayXuatHoaDon, float tongTien,String VAT) {
        this.maHD = maHD;
        this.giamGia=giamGia;
        this.maNhanVien = maNhanVien;
        this.ngayXuatHoaDon = ngayXuatHoaDon;
        this.tongTien = tongTien;
        this.VAT=VAT;
    }

    public int getMaHD() {
        return maHD;
    }

   

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public Date getNgayXuatHoaDon() {
        return ngayXuatHoaDon;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

   

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setNgayXuatHoaDon(Date ngayXuatHoaDon) {
        this.ngayXuatHoaDon = ngayXuatHoaDon;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    
}
