package com.example.lab1_20201638.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class PagPrincipal {

    @RequestMapping(value = "/principal", method = RequestMethod.GET)
    public String paginaPrincipal(){
        return "principal";
    }
}
