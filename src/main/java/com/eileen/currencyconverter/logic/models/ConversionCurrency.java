package com.eileen.currencyconverter.logic.models;

public class ConversionCurrency {

    private String ConvertToCurrency;
    private String ConvertFromCurrency;
    private double value;

    public ConversionCurrency(){
    }

    public ConversionCurrency(String convertToCurrency, String convertFromCurrency, double value) {
        ConvertToCurrency = convertToCurrency;
        ConvertFromCurrency = convertFromCurrency;
        this.value = value;
    }

    public String getConvertToCurrency() {
        return ConvertToCurrency;
    }

    public void setConvertToCurrency(String convertToCurrency) {
        ConvertToCurrency = convertToCurrency;
    }

    public String getConvertFromCurrency() {
        return ConvertFromCurrency;
    }

    public void setConvertFromCurrency(String convertFromCurrency) {
        ConvertFromCurrency = convertFromCurrency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConversionCurrency{" +
                "ConvertToCurrency='" + ConvertToCurrency + '\'' +
                ", ConvertFromCurrency='" + ConvertFromCurrency + '\'' +
                ", value=" + value +
                '}';
    }
}
