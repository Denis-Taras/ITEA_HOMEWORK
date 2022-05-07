package com.company.denis.Homework5;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 32;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVAN+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}