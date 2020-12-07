package net.codejava.orderfoodspring.Datdoan;

import javax.persistence.Entity;

@Entity
public class Datdoan {
    private Integer madon;
    private Integer mamon;
    private Integer soluong;
    private Long thanhtien;

    public Datdoan() {
    }

    public Datdoan(Integer madon, Integer mamon, Integer soluong, Long thanhtien) {
        this.madon = madon;
        this.mamon = mamon;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
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

    public Integer getSoluong() {
        return this.soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Long getThanhtien() {
        return this.thanhtien;
    }

    public void setThanhtien(Long thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    public String toString() {
        return "{" +
            " madon='" + getMadon() + "'" +
            ", mamon='" + getMamon() + "'" +
            ", soluong='" + getSoluong() + "'" +
            ", thanhtien='" + getThanhtien() + "'" +
            "}";
    }
}
