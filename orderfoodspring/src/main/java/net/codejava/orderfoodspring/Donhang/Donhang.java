package net.codejava.orderfoodspring.Donhang;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
public class Donhang {
    private Integer madon;
    private Integer makhach;
    private String tenkhach;
    private String sdt;
    private String diachi;
    private float tongtien;
    private String ghichu;
    private String diachinhan;
    private BigInteger thoigiannhan;
    private BigInteger thoigiandat;

    public Donhang(){}

    public Donhang(Integer madon, Integer makhach, String tenkhach, String sdt, String diachi, float tongtien,
            String ghichu, String diachinhan, BigInteger thoigiannhan, BigInteger thoigiandat) {
        this.madon = madon;
        this.makhach = makhach;
        this.tenkhach = tenkhach;
        this.sdt = sdt;
        this.diachi = diachi;
        this.tongtien = tongtien;
        this.ghichu = ghichu;
        this.diachinhan = diachinhan;
        this.thoigiannhan = thoigiannhan;
        this.thoigiandat = thoigiandat;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getMadon() {
        return madon;
    }

    public void setMadon(Integer madon) {
        this.madon = madon;
    }

    public Integer getMakhach() {
        return makhach;
    }

    public void setMakhach(Integer makhach) {
        this.makhach = makhach;
    }

    public String getTenkhach() {
        return tenkhach;
    }

    public void setTenkhach(String tenkhach) {
        this.tenkhach = tenkhach;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getDiachinhan() {
        return diachinhan;
    }

    public void setDiachinhan(String diachinhan) {
        this.diachinhan = diachinhan;
    }

    public BigInteger getThoigiannhan() {
        return thoigiannhan;
    }

    public void setThoigiannhan(BigInteger thoigiannhan) {
        this.thoigiannhan = thoigiannhan;
    }

    public BigInteger getThoigiandat() {
        return thoigiandat;
    }

    public void setThoigiandat(BigInteger thoigiandat) {
        this.thoigiandat = thoigiandat;
    }
}
