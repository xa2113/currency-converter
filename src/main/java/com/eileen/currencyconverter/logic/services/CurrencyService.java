package com.eileen.currencyconverter.logic.services;

import com.eileen.currencyconverter.logic.models.Currency;
import com.eileen.currencyconverter.logic.responsitories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    private CurrencyRepository currencyRepository;

    public List<Currency> getCurrencyString() {

        return currencyRepository.findAll();
    }
}
