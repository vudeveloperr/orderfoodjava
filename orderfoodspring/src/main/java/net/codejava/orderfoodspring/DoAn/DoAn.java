package net.codejava.orderfoodspring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DoAn{
    private Integer mamon;
    private Integer macuahang;
	private String tenmon;
	private Float gia;
    private String anh;
    private Float giakhuyenmai;
	private String mota;
	private String dvt;
    private Integer maloai;

    public DoAn() {
    }

    public DoAn(Integer mamon, Integer macuahang, String tenmon, Float gia, String anh, Float giakhuyenmai, String mota, String dvt, Integer maloai) {
        this.mamon = mamon;
        this.macuahang = macuahang;
        this.tenmon = tenmon;
        this.gia = gia;
        this.anh = anh;
        this.giakhuyenmai = giakhuyenmai;
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

    public Integer getMacuahang() {
        return this.macuahang;
    }

    public void setMacuahang(Integer macuahang) {
        this.macuahang = macuahang;
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

    public Float getGiakhuyenmai() {
        return this.giakhuyenmai;
    }

    public void setGiakhuyenmai(Float giakhuyenmai) {
        this.giakhuyenmai = giakhuyenmai;
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

