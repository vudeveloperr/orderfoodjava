package net.codejava.orderfoodspring.Donhang;

import javax.persistence.*;

@Entity
public class Donhang {
    private Integer madon;
    private Integer makhach;
    private String tenkhach;
    private String sdt;
    private String diachi;
    private float tongtien;
    private String tranthai;

    public Donhang(Integer madon, Integer makhach, String tenkhach, String sdt, String diachi, float tongtien,
            String tranthai) {
        this.madon = madon;
        this.makhach = makhach;
        this.tenkhach = tenkhach;
        this.sdt = sdt;
        this.diachi = diachi;
        this.tongtien = tongtien;
        this.tranthai = tranthai;
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

    public String getTranthai() {
        return tranthai;
    }

    public void setTranthai(String tranthai) {
        this.tranthai = tranthai;
    }
}
