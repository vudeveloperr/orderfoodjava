package net.codejava.orderfoodspring;

import java.util.List;
import java.util.NoSuchElementException;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoAnController {
    @Autowired
    private DoAnService service;

    @PostMapping(value = "/foods", produces = MediaType.APPLICATION_XML_VALUE)
    public DoAn add(@RequestBody DoAn food) {
        return food;
    }

    @GetMapping("/foods")
    public DoAn list(){
        return new DoAn(1, 1, "com rang", new Float("10"), "null", new Float("10"), "day la mon com rang", "xuat", 1);
    }

    @GetMapping("/foods/{id}")
    public ResponseEntity<DoAn> get(@PathVariable Integer id){
        try {
            DoAn food = service.get(id);
            return new ResponseEntity<DoAn>(food, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            //TODO: handle exception
            return new ResponseEntity<DoAn>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/foods/{id}")
    public ResponseEntity<?> update(@RequestBody DoAn food, @PathVariable Integer id) {
        try {
            DoAn existFood = service.get(id);
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
