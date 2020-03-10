package com.eileen.currencyconverter.logic.responsitories;

import com.eileen.currencyconverter.logic.models.Currency;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("currencyRepository")
public interface CurrencyRepository{

    List<Currency> findAll();
}
