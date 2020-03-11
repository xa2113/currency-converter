package com.eileen.currencyconverter.logic.responsitories;

import com.eileen.currencyconverter.logic.models.CurrencyDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("currencyRepository")
public interface CurrencyRepository extends CrudRepository<CurrencyDTO, String> {

    @Override
    List<CurrencyDTO> findAll();

}
