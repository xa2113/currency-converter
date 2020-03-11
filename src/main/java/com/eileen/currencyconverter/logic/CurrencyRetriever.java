package com.eileen.currencyconverter.logic;

import com.eileen.currencyconverter.logic.api.HttpConnection;
import com.eileen.currencyconverter.logic.models.CurrencyDTO;
import com.eileen.currencyconverter.logic.responsitories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CurrencyRetriever {

    @Autowired
    private CurrencyRepository currencyRepository;

    public void getCurrencyDTO(Object object) throws Exception {

        HttpConnection httpConnection = new HttpConnection();

        CurrencyDTO currencyDTO = httpConnection.sendGet();

        currencyRepository.save(currencyDTO);

    }

}
