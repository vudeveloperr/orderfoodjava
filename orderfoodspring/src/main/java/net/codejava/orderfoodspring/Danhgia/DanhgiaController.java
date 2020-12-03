package net.codejava.orderfoodspring.Danhgia;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.orderfoodspring.Response.DanhgiaRes;

@RestController
public class DanhgiaController {
    @Autowired
    private DanhgiaService service;

    @PostMapping("/comments")
    public void add(@RequestBody DanhgiaRes res) {
        Danhgia danhgia = new Danhgia();
        danhgia.setId(res.getId());
        danhgia.setMamon(res.getMamon());
        danhgia.setNoidung(res.getNoidung());
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis); 
        danhgia.setNgaytao(date);
        service.save(danhgia);
    }

    @GetMapping("/comments")
    public List<Danhgia> lists(@RequestParam(required = true) Integer id ,@RequestParam(required = true) Integer mamon){
        return service.getall(id, mamon);
    }

}
