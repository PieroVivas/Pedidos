package com.example.pedidos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ImplementTest {


    @Mock
    private Implement implement;

    private Response response = new Response("Orden guardada");

    private Request request = new Request("1","009","Mouse","3");


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        response = new Response("Orden guardada");

    }

    @Test
    void orders() {

        when(implement.Orders(request)).thenReturn(response);


        assertNotNull(implement.Orders(request));


    }
}