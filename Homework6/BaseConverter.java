package com.company.denis.Homework6;

public class BaseConverter {
    double temperature;

    public String convertTemp(double temperature, char convertTo){
        if (convertTo == 'C' || convertTo == 't') {
            this.temperature = (temperature-32/1.8);
            return String.valueOf(this.temperature)+" по Фаренгейту";
        } else if(convertTo == 'C' || convertTo == 'c'){
            this.temperature = (temperature*5/9);
            return String.valueOf(this.temperature)+" по Цельсию";
        } else if(convertTo == 'k' || convertTo == 'k'){
            this.temperature = (temperature+273.15);
            return String.valueOf(this.temperature)+" по Кельвину";
        } else return "Неверно";

    }
}