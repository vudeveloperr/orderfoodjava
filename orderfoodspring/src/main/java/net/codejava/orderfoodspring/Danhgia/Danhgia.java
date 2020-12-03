package net.codejava.orderfoodspring.Danhgia;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Danhgia {
    private int index;
    private int id;
    private int mamon;
    private String noidung;
    private Date ngaytao;

    public Danhgia(int index, int id, int mamon, String noidung, Date ngaytao) {
        this.index = index;
        this.id = id;
        this.mamon = mamon;
        this.noidung = noidung;
        this.ngaytao = ngaytao;
    }

    public Danhgia(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMamon() {
        return mamon;
    }

    public void setMamon(int mamon) {
        this.mamon = mamon;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }
}
