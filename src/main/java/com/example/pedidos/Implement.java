package com.example.pedidos;
import org.springframework.stereotype.Service;

@Service
public class Implement implements PedidosService{


    Response response;
    @Override
    public Response Orders(Request request) {


        return new Response("Orden guardada");
    }

}
