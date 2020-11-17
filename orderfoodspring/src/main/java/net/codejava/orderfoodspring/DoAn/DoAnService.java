package net.codejava.orderfoodspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
public class DoAnService {
    
    @Autowired
    private DoAnRepository repo;

    public DoAn listAll(){
        //return repo.findAll();
        return new DoAn(1, 1, "com rang", new Float("10"), "null", new Float("10"), "day la mon com rang", "xuat", 1); 
    }

    public void save(DoAn food){
        repo.save(food);
    }

    public DoAn get(Integer id){
        return repo.findById(id).get();
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }
}
