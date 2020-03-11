package com.eileen.currencyconverter.presentation.controllers;

import com.eileen.currencyconverter.logic.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrencyConverterWebController {

    @Autowired
    CurrencyService currencyService;

    @GetMapping("/")
    public String index(){
        //TODO
        currencyService.getAllCurrencies();
        return "index";
    }
}
