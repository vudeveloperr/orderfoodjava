package net.codejava.orderfoodspring.Request;

import java.math.BigInteger;

public class DonhangReq {
    private Integer madon;
    private Integer mamon;
    private Integer userid;
    private String tenmon;
	private Float gia;
    private String anh;
	private String mota;
	private String dvt;
    private Integer maloai;
    private String trangthai;
    private Integer soluong;
    private BigInteger thoigiandat;
    private BigInteger thoigiannhan;
    private String diachi;
    private String sdt;
    private String tenkhach;
    private Integer matrangthai;
    private String noidung;

    public DonhangReq() {
    }

    public DonhangReq(Integer madon, Integer mamon, Integer userid, String tenmon, Float gia, String anh, String mota, String dvt, Integer maloai, String trangthai, Integer soluong, BigInteger thoigiandat, BigInteger thoigiannhan, String diachi, String sdt, String tenkhach, Integer matrangthai, String noidung) {
        this.madon = madon;
        this.mamon = mamon;
        this.userid = userid;
        this.tenmon = tenmon;
        this.gia = gia;
        this.anh = anh;
        this.mota = mota;
        this.dvt = dvt;
        this.maloai = maloai;
        this.trangthai = trangthai;
        this.soluong = soluong;
        this.thoigiandat = thoigiandat;
        this.thoigiannhan = thoigiannhan;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tenkhach = tenkhach;
        this.matrangthai = matrangthai;
        this.noidung = noidung;
    }

    public Integer getMadon() {
        return this.madon;
    }

    public void setMadon(Integer madon) {
        this.madon = madon;
    }

    public Integer getMamon() {
        return this.mamon;
    }

    public void setMamon(Integer mamon) {
        this.mamon = mamon;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getTrangthai() {
        return this.trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public Integer getSoluong() {
        return this.soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public BigInteger getThoigiandat() {
        return this.thoigiandat;
    }

    public void setThoigiandat(BigInteger thoigiandat) {
        this.thoigiandat = thoigiandat;
    }

    public BigInteger getThoigiannhan() {
        return this.thoigiannhan;
    }

    public void setThoigiannhan(BigInteger thoigiannhan) {
        this.thoigiannhan = thoigiannhan;
    }

    public String getDiachi() {
        return this.diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenkhach() {
        return this.tenkhach;
    }

    public void setTenkhach(String tenkhach) {
        this.tenkhach = tenkhach;
    }

    public Integer getMatrangthai() {
        return this.matrangthai;
    }

    public void setMatrangthai(Integer matrangthai) {
        this.matrangthai = matrangthai;
    }

    public String getNoidung() {
        return this.noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
    
}
