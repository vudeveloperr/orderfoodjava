package net.codejava.orderfoodspring.Doan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.orderfoodspring.Exception.CustomException;

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
        boolean check = service.exists(id);
        if (check){
            Doan food = service.get(id);
            return new ResponseEntity<Doan>(food, HttpStatus.OK);
        }else{
            throw new DoanException("food not found!!!");
        }
    }

    @ExceptionHandler(DoanException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Food not found")
    public void handlerNilException(DoanException e){
        System.out.println(e.getMessage());  
    }

    @PutMapping("/foods/{id}")
    public ResponseEntity<?> update(@RequestBody Doan food, @PathVariable Integer id) {
        boolean check = service.exists(id);
        if (check){
            service.save(food);
            return new ResponseEntity<Doan>(food, HttpStatus.OK);
        }else{
            DoanException ex = new DoanException("food not found(1)!");
            return CustomException.handleFoodNotFoundException(ex);
        }    
    }

    @DeleteMapping("/foods/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
