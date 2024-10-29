package com.example.pedidos;

import lombok.*;

@Getter
@Setter
@Builder
public class Request {


    private String id;
    private String costumerId;
    private String product;
    private String quantity;

}
