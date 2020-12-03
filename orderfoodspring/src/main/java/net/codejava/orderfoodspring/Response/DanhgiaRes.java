package net.codejava.orderfoodspring.Response;

public class DanhgiaRes {
    private int id;
    private int mamon;
    private String noidung;

    public DanhgiaRes(){}

    public DanhgiaRes(int id, int mamon, String noidung) {
        this.id = id;
        this.mamon = mamon;
        this.noidung = noidung;
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
}
