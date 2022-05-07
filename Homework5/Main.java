package com.company.denis.Homework5;

public class Main
{
    public static void main(String[] args)
    {
        Hen hen = HenFactory.getHen(Country.MOLDOVAN);
        hen.getCountOfEggsPerMonth();

        System.out.println(hen.getCountOfEggsPerMonth());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.BELARUSIAN)) { hen = new BelarusianHen();}
            if (country.equals(Country.MOLDOVAN)) {hen =new MoldovanHen();}
            if (country.equals(Country.POLISH)) {hen = new PolishHen();}
            if (country.equals(Country.UKRAINE)) {hen = new UkraineHen();}
            return hen;

        }
    }
}
