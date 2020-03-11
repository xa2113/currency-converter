package com.eileen.currencyconverter.logic.services;

import com.eileen.currencyconverter.logic.models.CurrencyDTO;
import com.eileen.currencyconverter.logic.responsitories.CurrencyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    private CurrencyRepository currencyRepository;

    public List<CurrencyDTO> getCurrencyString() {

        return currencyRepository.findAll();
    }
}
