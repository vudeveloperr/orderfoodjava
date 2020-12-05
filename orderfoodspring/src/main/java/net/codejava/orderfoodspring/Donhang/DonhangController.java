package net.codejava.orderfoodspring.Donhang;

import java.util.List;
import java.util.NoSuchElementException;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import javassist.NotFoundException;

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
    public ResponseEntity<?> get(@PathVariable Integer id){
        boolean check = service.exists(id);
        if (check){
            Donhang or = service.get(id);
            return new ResponseEntity<Donhang>(or, HttpStatus.OK);
        }else{
            return null;
        }
    }

    @PutMapping("/orders/{id}")
    public ResponseEntity<?> update(@RequestBody Donhang donhang, @PathVariable Integer id) {
        boolean check = service.exists(id);
        if (check){
            service.save(donhang);
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }  
    }
}
