package com.eileen.currencyconverter.logic.services;

import com.eileen.currencyconverter.logic.models.ConversionCurrency;
import com.eileen.currencyconverter.logic.models.Currency;
import com.eileen.currencyconverter.logic.responsitories.CurrencyRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class CurrencyService {

    private CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public List<Currency> getAllCurrencies() {

        List<Currency> currencyList = currencyRepository.findAll();
        currencyList.sort(Comparator.comparing(Currency::getName));
        return currencyList;
    }

    public Optional<Double> convertCurrencies(ConversionCurrency conversionCurrency) {
        Optional<Currency> toOptional = this.currencyRepository.findById(conversionCurrency.getConvertToCurrency().toUpperCase());
        Optional<Currency> fromOptional = this.currencyRepository.findById(conversionCurrency.getConvertFromCurrency().toUpperCase());

        if (toOptional.isPresent() && fromOptional.isPresent()) {

            if (conversionCurrency.getValue() < 0) {
                return Optional.empty();
            }

            Currency to = toOptional.get();
            Currency from = fromOptional.get();
            Double toValue = to.getValueInEUR();
            Double fromValue = from.getValueInEUR();
            Double result = toValue * conversionCurrency.getValue() / fromValue;

            return Optional.of(result);

        }

        return Optional.empty();

    }


}
