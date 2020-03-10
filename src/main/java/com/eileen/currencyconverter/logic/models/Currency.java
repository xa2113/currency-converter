package com.eileen.currencyconverter.logic.models;

public class Currency {

    private String name;
    private double valueInUSD;

    public Currency(){
    }

    public Currency(String name, double valueInUSD){
        this.name = name;
        this.valueInUSD = valueInUSD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValueInUSD() {
        return valueInUSD;
    }

    public void setValueInUSD(double valueInUSD) {
        this.valueInUSD = valueInUSD;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", valueInUSD=" + valueInUSD +
                '}';
    }
}
