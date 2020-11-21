package net.codejava.orderfoodspring.Doan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doan{
    private Integer mamon;
	private String tenmon;
	private Float gia;
    private String anh;
	private String mota;
	private String dvt;
    private Integer maloai;

    public Doan() {
    }

    public Doan(Integer mamon, String tenmon, Float gia, String anh, String mota, String dvt, Integer maloai) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.gia = gia;
        this.anh = anh;
        this.mota = mota;
        this.dvt = dvt;
        this.maloai = maloai;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getMamon() {
        return this.mamon;
    }

    public void setMamon(Integer mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return this.tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public Float getGia() {
        return this.gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public String getAnh() {
        return this.anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getDvt() {
        return this.dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public Integer getMaloai() {
        return this.maloai;
    }

    public void setMaloai(Integer maloai) {
        this.maloai = maloai;
    }
	
}

