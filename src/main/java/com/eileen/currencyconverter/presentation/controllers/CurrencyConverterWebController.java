package com.eileen.currencyconverter.presentation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrencyConverterWebController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
