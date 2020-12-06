package net.codejava.orderfoodspring.Request;

import java.math.BigInteger;

public interface DonhangReq {
    Integer getMadon();
    Integer getMamon();
    Integer getMakhach();
    BigInteger getThoigiannhan();
    BigInteger getThoigiandat();
    Integer getSoLuong();
    String getTenmon();
    Float getGia();
    String getAnh();
}
