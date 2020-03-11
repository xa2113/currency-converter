package com.eileen.currencyconverter.logic.api;

import com.eileen.currencyconverter.logic.models.CurrencyDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class ObjectSerializer {

    private static ObjectMapper objectMapper;

    @Autowired
    public ObjectSerializer(ObjectMapper objectMapper) {
        ObjectSerializer.objectMapper = objectMapper;
    }

    public static CurrencyDTO getObject(Object obj) {
        String jsonObj = "";
        CurrencyDTO currencyDTO = null;
        try {
            jsonObj = objectMapper.writeValueAsString(obj);
            currencyDTO = objectMapper.readValue(jsonObj, CurrencyDTO.class);
            System.out.println(jsonObj);
        } catch (JsonProcessingException jpe) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currencyDTO;
    }
}


