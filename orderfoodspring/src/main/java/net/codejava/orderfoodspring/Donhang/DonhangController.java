package net.codejava.orderfoodspring.Donhang;

import java.util.List;
import java.util.NoSuchElementException;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.orderfoodspring.Datdoan.Datdoan;
// import net.codejava.orderfoodspring.Doan.Doan;
import net.codejava.orderfoodspring.Request.DonhangReq;
import net.codejava.orderfoodspring.Response.DonhangRes;
// import net.codejava.orderfoodspring.Trangthaidonhang.Trangthaidonhang;

// import javassist.NotFoundException;

@RestController
public class DonhangController {
    
    @Autowired
    private DonhangService service;

    @PostMapping("/orders")
    public void add(@RequestBody DonhangReq res) {
        // Trangthaidonhang trangthaidonhang = new Trangthaidonhang();
        Donhang donhang = new Donhang();
        Datdoan datdoan = new Datdoan();
        // Doan doan = new Doan();
        // trangthaidonhang.setMatrangthai(res.getMatrangthai());
        donhang.setMadon(res.getMadon());
        datdoan.setMamon(res.getMamon());
        donhang.setMakhach(res.getUserid());
        // doan.setTenmon(res.getTenmon());
        // doan.setGia(res.getGia());
        // doan.setAnh(res.getAnh());
        // doan.setMota(res.getMota());
        // doan.setDvt(res.getDvt());
        // doan.setMaloai(res.getMaloai());
        // doan.setTrangthai(res.getTrangthai());
        donhang.setThoigiandat(res.getThoigiandat());
        donhang.setThoigiannhan(res.getThoigiannhan());
        donhang.setDiachi(res.getDiachi());
        donhang.setSdt(res.getSdt());
        donhang.setTenkhach(res.getTenkhach());
        // trangthaidonhang.setMatrangthai(res.getMatrangthai());
        // trangthaidonhang.setNoidung(res.getNoidung());
        // service.savedonhang();
    }

    @GetMapping("/orders")
    @PreAuthorize("hasRole('USER')")
    public List<DonhangRes> lists(){
        return service.getall();
    }

    // @GetMapping("/orders/{id}")
    // public ResponseEntity<?> get(@PathVariable Integer id){
    //     boolean check = service.exists(id);
    //     if (check){
    //         Donhang or = service.get(id);
    //         return new ResponseEntity<Donhang>(or, HttpStatus.OK);
    //     }else{
    //         return null;
    //     }
    // }

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
