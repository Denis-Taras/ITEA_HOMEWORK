package com.company.denis.Homework4;


public class Main {
    public static void main(String[] args) {
        StudentGroups gr = new StudentGroups();
        gr.addStudents("Николай", "Зырянов", 10.0);
        gr.addStudents("Володя", "Трубадур", 9.6);
        gr.addStudents("Василий", "Перекотиполе", 9.8);
        gr.addStudents("Марк", "Кутавский", 9.7);
        gr.addStudents("Жорик", "Вартанов", 9.9);
        gr.addStudents("Ирина", "Крывозубова", 9.1);
        gr.addStudents("Екатерина", "Давалова", 9.4);
        gr.addStudents("Руслан", "Борщина", 9.3);
        gr.addStudents("Вадим", "Чертов", 9.2);
        gr.addStudents("Олег", "Русавый", 9.5);
        gr.removeStudents(5);
        gr.findSecondName("Чертов");

        System.out.println(gr);
    }
}