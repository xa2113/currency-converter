package com.eileen.currencyconverter.logic.models;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Map;

@RedisHash("CurrencyDTO")
public class CurrencyDTO implements Serializable {

    private String id;
    private String base;
    private String date;
    private Map<String, Double> rates;

    public CurrencyDTO(){
    }

    public CurrencyDTO(String id, String base, String date, Map<String, Double> rates) {
        this.id = id;
        this.base = base;
        this.date = date;
        this.rates = rates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "CurrencyDTO{" +
                "base='" + base + '\'' +
                ", date='" + date + '\'' +
                ", rates=" + rates +
                '}';
    }
}
