package net.codejava.orderfoodspring.Doan;

import java.util.List;
import java.util.NoSuchElementException;

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
public class DoanController {
    @Autowired
    private DoanService service;

    @PostMapping("/foods")
    public void add(@RequestBody Doan food) {
        service.save(food);
    }

    @GetMapping("/foods")
    public List<Doan> list(){
        return service.listAll();
    }

    @GetMapping("/foods/{id}")
    public ResponseEntity<Doan> get(@PathVariable Integer id){
        try {
            Doan food = service.get(id);
            return new ResponseEntity<Doan>(food, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            //TODO: handle exception
            return new ResponseEntity<Doan>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/foods/{id}")
    public ResponseEntity<?> update(@RequestBody Doan food, @PathVariable Integer id) {
        try {
            Doan existFood = service.get(id);
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
