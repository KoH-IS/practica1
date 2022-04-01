package com.practica01.practica01;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class Bienvenida {
    @GetMapping("/")
    public String inicio(){

        return  "index";
    }
}
