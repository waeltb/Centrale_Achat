package com.pi.Centrale_Achat.controller;
import com.pi.Centrale_Achat.entities.Bill;
import com.pi.Centrale_Achat.serviceImpl.BillServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bill")
@RequiredArgsConstructor
public class ControllerBill {
    private final BillServiceImpl billService;
    @GetMapping("/get/{id}")
    public float calculeFAct(@PathVariable("id") int id){
        return billService.calculeFacture(id);
    }

    @GetMapping("/get-top-facture")
    public Bill gett(){
        return billService.topFacture();
    }

    @PostMapping("/add/{id}")
    public Bill add(@RequestBody Bill b , @PathVariable("id")int id){
        return billService.addFacture(b, id);

    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")int id){
        billService.delete(id);
    }

    @GetMapping("/get-all")
    public List<Bill> getAll(){
        return billService.getAll();
    }



}
