package com.company.denis.Homework5;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 25;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUSIAN+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
