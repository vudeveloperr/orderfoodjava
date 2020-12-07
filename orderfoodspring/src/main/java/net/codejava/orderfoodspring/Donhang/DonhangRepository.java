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
    "from datdoan "+
    "inner join donhang on donhang.madon = datdoan.madon " +
    "inner join doan on doan.mamon = datdoan.mamon " +
    "inner join trangthaidonhang on trangthaidonhang.madon = donhang.madon " +
    "where trangthaidonhang.matrangthai = 8 "+
    "order by donhang.thoigiandat DESC", nativeQuery = true)
    List<DonhangRes> lists();
    
}