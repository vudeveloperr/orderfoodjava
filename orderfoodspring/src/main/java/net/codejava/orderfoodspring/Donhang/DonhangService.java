package net.codejava.orderfoodspring.Donhang;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonhangService {
    
    @Autowired
    private DonhangRepository repo;

    public List<Donhang> listAll(){
        return repo.findAll();
    }

    public void save(Donhang food){
        repo.save(food);
    }

    public Donhang get(Integer id){
        return repo.findById(id).get();
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }

    public boolean exists(Integer id){
        return repo.existsById(id);
    }
}
