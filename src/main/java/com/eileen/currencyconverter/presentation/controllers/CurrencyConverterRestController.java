package com.eileen.currencyconverter.presentation.controllers;

import com.eileen.currencyconverter.logic.models.ConversionCurrency;
import com.eileen.currencyconverter.logic.models.Currency;
import com.eileen.currencyconverter.logic.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CurrencyConverterRestController {

    @Autowired
    CurrencyService currencyService;

    public CurrencyConverterRestController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @RequestMapping(value="/currency-converter", produces = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity<Double> convertCurrencies(@RequestBody ConversionCurrency conversionCurrency){
        Optional<Double> resultOptional = this.currencyService.convertCurrencies(conversionCurrency);
        if (resultOptional.isPresent()){
            return new ResponseEntity<>(resultOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/currencies", produces = {"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<List<Currency>> getAllCurrencies(){
        return new ResponseEntity<List<Currency>>(this.currencyService.getAllCurrencies(), HttpStatus.OK);
    }

}
