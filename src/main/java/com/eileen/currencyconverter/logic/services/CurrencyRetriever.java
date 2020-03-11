package com.eileen.currencyconverter.logic.services;

import com.eileen.currencyconverter.logic.api.HttpConnection;
import com.eileen.currencyconverter.logic.models.Currency;
import com.eileen.currencyconverter.logic.models.CurrencyDTO;
import com.eileen.currencyconverter.logic.responsitories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CurrencyRetriever {

    @Autowired
    private CurrencyRepository currencyRepository;

    public void saveCurrencyDTO(Object object) throws Exception {

        HttpConnection httpConnection = new HttpConnection();

        CurrencyDTO currencyDTO = httpConnection.sendGet();

        currencyDTO.getRates().forEach((key, value) ->{
            Currency currency = new Currency(key, value);
            this.currencyRepository.save(currency);
        });

    }


}
