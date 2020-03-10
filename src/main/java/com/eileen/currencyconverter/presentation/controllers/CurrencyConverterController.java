package com.eileen.currencyconverter.presentation.controllers;

import com.eileen.currencyconverter.logic.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {

    @Autowired
    CurrencyService currencyService;

    @GetMapping("/currencies")
    public String getCurrencies() {
        currencyService.getCurrencyString();
        return "index.html";
    }
}
