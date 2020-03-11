package com.eileen.currencyconverter.logic.models;

public class Currency {

    private String name;
    private double valueInEUR;

    public Currency(){
    }

    public Currency(String name, double valueInEUR){
        this.name = name;
        this.valueInEUR = valueInEUR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValueInEUR() {
        return valueInEUR;
    }

    public void setValueInEUR(double valueInEUR) {
        this.valueInEUR = valueInEUR;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", valueInEUR=" + valueInEUR +
                '}';
    }
}
