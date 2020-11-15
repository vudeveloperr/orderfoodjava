package net.codejava.orderfoodspring;

import java.util.List;
import java.util.NoSuchElementException;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @Autowired
    private FoodService service;

    @PostMapping("/foods")
    public void add(@RequestBody Food food) {
        service.save(food);
    }

    @GetMapping("/foods")
    public List<Food> list(){
        return service.listAll();
    }

    @GetMapping("/foods/{id}")
    public ResponseEntity<Food> get(@PathVariable Integer id){
        try {
            Food food = service.get(id);
            return new ResponseEntity<Food>(food, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            //TODO: handle exception
            return new ResponseEntity<Food>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/foods/{id}")
    public ResponseEntity<?> update(@RequestBody Food food, @PathVariable Integer id) {
        try {
            Food existFood = service.get(id);
            service.save(food);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }

    @DeleteMapping("/foods/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
