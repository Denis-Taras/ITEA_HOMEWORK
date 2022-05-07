package com.company.denis.Homework5;

public class UkraineHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 97;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}