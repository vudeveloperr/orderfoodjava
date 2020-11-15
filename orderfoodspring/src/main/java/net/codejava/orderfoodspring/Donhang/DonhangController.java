package net.codejava.orderfoodspring.Donhang;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonhangController {
    
    @Autowired
    private DonhangService service;

    @PostMapping("/orders")
    public void add(@RequestBody Donhang donhang) {
        service.save(donhang);
    }

    @GetMapping("/orders")
    public List<Donhang> list(){
        return service.listAll();
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<Donhang> get(@PathVariable Integer id){
        try {
            Donhang donhang = service.get(id);
            return new ResponseEntity<Donhang>(donhang, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            //TODO: handle exception
            return new ResponseEntity<Donhang>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/orders/{id}")
    public ResponseEntity<?> update(@RequestBody Donhang donhang, @PathVariable Integer id) {
        try {
            Donhang existDonhang = service.get(id);
            service.save(donhang);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }

    @DeleteMapping("/orders/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
