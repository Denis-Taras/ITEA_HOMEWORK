package com.company.denis.Homework6;

import javax.swing.*;

public class Converter {
    public static void main(String[] args) {
        char convertTo = JOptionPane.showInputDialog("Введите букву 'C' для Цельсия, букву 'F' для Фаренгейта или букву 'K' для Кельвина").charAt(0);

        int temperature = Integer.parseInt(JOptionPane.showInputDialog("Введите значение"));

        BaseConverter t = new BaseConverter();
        JOptionPane.showMessageDialog(null, t.convertTemp(temperature, convertTo));
    }
}