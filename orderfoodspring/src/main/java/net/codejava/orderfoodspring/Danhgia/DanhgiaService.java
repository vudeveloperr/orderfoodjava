package net.codejava.orderfoodspring.Danhgia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.orderfoodspring.Response.DanhgiaRes;

@Service
public class DanhgiaService {
    @Autowired
    private DanhgiaRepository repo;

    public void save(Danhgia danhgia){
        repo.save(danhgia);
    }

    public List<DanhgiaRes> getall(int id, int mamon){
        return repo.lists(id, mamon);
    }
}
