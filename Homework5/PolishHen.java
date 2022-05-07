package com.company.denis.Homework5;

public class PolishHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 51;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.POLISH+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
