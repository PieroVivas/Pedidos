package com.example.pedidos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class ControllerPedidos {


    @Autowired
    Implement implement;

    @PostMapping("/orders")
    public Response response(@RequestBody Request request){
        return ResponseEntity.ok(implement.Orders(request)).getBody();
    }

    @GetMapping("/orders/{id}")
    public Request producto(@PathVariable String id){
        Request ordenes = new Request(id,"001","Laptop","4");

        return ordenes;

    }

}
