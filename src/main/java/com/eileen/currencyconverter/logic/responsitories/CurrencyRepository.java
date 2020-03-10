package com.eileen.currencyconverter.logic.responsitories;

import com.eileen.currencyconverter.logic.models.CurrentCurrency;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("currencyRepository")
public interface CurrencyRepository extends CrudRepository<CurrentCurrency, String> {

    @Override
    List<CurrentCurrency> findAll();

}
