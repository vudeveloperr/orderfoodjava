package net.codejava.orderfoodspring.Khachhang;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachhangService {
    
    @Autowired
    private KhachhangRepository repo;

    public List<Khachhang> listAll(){
        return repo.findAll();
    }

    public void save(Khachhang food){
        repo.save(food);
    }

    public Khachhang get(Integer id){
        return repo.findById(id).get();
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }
}
