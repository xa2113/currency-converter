package com.eileen.currencyconverter.controllers;

import com.eileen.currencyconverter.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {

    @Autowired
    CurrencyService currencyService;

    @GetMapping("/currencies")
    public String getCurrencies() {
        return currencyService.getCurrencyString();
    }
}
