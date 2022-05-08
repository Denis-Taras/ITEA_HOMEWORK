package com.company.homework15.demo.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Traider extends BaseModel{
    public static final int METHOD_FIRST = 1; //алгоритм 1
    public static final int METHOD_SECOND = 2; //алгоритм 2
    public static final int METHOD_THIRD = 3; //алгоритм 3

    private String name; //наименование
    private int freqTick; //частота совершения сделок. Задана периодом, в тиках
    private BigDecimal cash; //сумма денег, кроме акций
    private int traidingMethod; //используемый трейдером алгоритм / число константа
    private int changeProbability; //вероятность выполнения операции, в %
    private String about; //доп инфо

    public Traider() {
    }

    public Traider(long id, String name, int freqTick, BigDecimal cash, int traidingMethod, int changeProbability, String about) {
        super(id);
        this.name = name;
        this.freqTick = freqTick;
        this.cash = cash;
        this.traidingMethod = traidingMethod;
        this.changeProbability = changeProbability;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFreqTick() {
        return freqTick;
    }

    public void setFreqTick(int freqTick) {
        this.freqTick = freqTick;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public int getTraidingMethod() {
        return traidingMethod;
    }

    public void setTraidingMethod(int traidingMethod) {
        this.traidingMethod = traidingMethod;
    }

    public int getChangeProbability() {
        return changeProbability;
    }

    public void setChangeProbability(int changeProbability) {
        this.changeProbability = changeProbability;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Traider traider = (Traider) o;
        return freqTick == traider.freqTick && traidingMethod == traider.traidingMethod && changeProbability == traider.changeProbability && Objects.equals(name, traider.name) && Objects.equals(cash, traider.cash) && Objects.equals(about, traider.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, freqTick, cash, traidingMethod, changeProbability, about);
    }
}
