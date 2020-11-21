package net.codejava.orderfoodspring.Loaidoan;

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
public class LoaidoanController {

    @Autowired
    private LoaidoanService service;

    @PostMapping("/types")
    public void add(@RequestBody Loaidoan loaidoan){
        service.save(loaidoan);
    }

    @GetMapping("/types")
    public List<Loaidoan> list(){
        return service.listAll();  
    }

    @GetMapping("/types/{maloai}")
    public ResponseEntity<Loaidoan> get(@PathVariable Integer maloai) {
        try {
            Loaidoan lda = service.get(maloai);
            return new ResponseEntity<Loaidoan>(lda, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            //TODO: handle exception
            return new ResponseEntity<Loaidoan>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/types/{maloai}")
    public ResponseEntity<?> update(@RequestBody Loaidoan lda, @PathVariable Integer maloai) {
        try {
            Loaidoan existLda = service.get(maloai);
            service.save(lda);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }

    @DeleteMapping("/types/{maloai}")
    public void delete(@PathVariable Integer maloai) {
        service.delete(maloai);
    }
}
