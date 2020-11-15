package net.codejava.orderfoodspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    
    @Autowired
    private FoodRepository repo;

    public List<Food> listAll(){
        return repo.findAll();
    }

    public void save(Food food){
        repo.save(food);
    }

    public Food get(Integer id){
        return repo.findById(id).get();
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }
}
