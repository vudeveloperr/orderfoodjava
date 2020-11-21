package net.codejava.orderfoodspring.Khachhang;

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
public class KhachhangController {
    @Autowired
    private KhachhangService service;

    @PostMapping("/users")
    public void add(@RequestBody Khachhang user) {
        service.save(user);
    }

    @GetMapping("/users")
    public List<Khachhang> list(){
        return service.listAll();
    }

    @GetMapping("/users/{makhach}")
    public ResponseEntity<Khachhang> get(@PathVariable Integer makhach){
        try {
            Khachhang kh = service.get(makhach);
            return new ResponseEntity<Khachhang>(kh, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            //TODO: handle exception
            return new ResponseEntity<Khachhang>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/users/{makhach}")
    public ResponseEntity<?> update(@RequestBody Khachhang kh, @PathVariable Integer makhach) {
        try {
            Khachhang existKh = service.get(makhach);
            service.save(kh);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }

    @DeleteMapping("/users/{makhach}")
    public void delete(@PathVariable Integer makhach) {
        service.delete(makhach);
    }
}
