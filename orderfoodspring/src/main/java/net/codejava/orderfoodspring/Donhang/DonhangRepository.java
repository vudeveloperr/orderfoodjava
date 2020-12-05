package net.codejava.orderfoodspring.Donhang;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.codejava.orderfoodspring.Response.DonhangRes;

@Repository
public interface DonhangRepository extends JpaRepository<Donhang, Integer> {

    @Query(value = "select donhang.madon ,donhang.makhach, "+
    "donhang.thoigiandat,donhang.thoigiannhan, "+
    "datdoan.soluong, doan.tenmon,doan.gia,doan.anh "+
    "from donhang,datdoan,doan, trangthaidonhang, trangthai "+
    "where doan.mamon = datdoan.mamon "+
    "and donhang.madon = datdoan.madon "+
    "and trangthaidonhang.madon = donhang.madon "+
    "and trangthai.matrangthai = trangthaidonhang.matrangthai "+
    "and trangthai.tentrangthai = N'Chưa giao hàng' "+
    "order by donhang.thoigiandat DESC;", nativeQuery = true)
    List<DonhangRes> lists();
    
}
