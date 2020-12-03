package net.codejava.orderfoodspring.Danhgia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhgiaRepository extends JpaRepository<Danhgia, Integer> {

    @Query(value = "select * from danhgia where id = ?1 and mamon = ?2 order by ngaytao DESC  ", nativeQuery = true)
    List<Danhgia> lists(int id, int mamon);
}
