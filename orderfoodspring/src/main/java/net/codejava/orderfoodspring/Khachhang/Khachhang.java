package net.codejava.orderfoodspring.Khachhang;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Khachhang{
    private Integer makhach;
    private String tenkhach;
    private String matkhau;
    private String email;
    private String gioitinh;
    private String sdt;
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    private Date ngaytao;

    public Khachhang(Integer makhach, String tenkhach, String matkhau, String email, String gioitinh, String sdt,
            Date ngaytao) {
        this.makhach = makhach;
        this.tenkhach = tenkhach;
        this.matkhau = matkhau;
        this.email = email;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.ngaytao = ngaytao;
    }

    public Khachhang(){
        
    }
}