package net.codejava.orderfoodspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
public class DoAnService {
    
    @Autowired
    private DoAnRepository repo;

    public List<DoAn> listAll(){
        return repo.findAll();
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
