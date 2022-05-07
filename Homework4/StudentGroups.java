package com.company.denis.Homework4;

import java.util.Arrays; public class StudentGroups {
    Student[] student = new Student[10];
    private static int count;
    public void addStudents(String name, String secondName, double rate) {
        if (count == student.length - 1) {
            System.out.println("addStudents");
            student[count] = new Student(name, secondName, rate);
            for (int i = 0; i < student.length; i++) {
                System.out.println(i + 1 + ". " + student[i]);             }
            System.out.println();
        }
        else if (count < student.length)
        {             student[count] = new Student(name, secondName, rate);
        }
        else
        {
            System.out.println("В группе может быть только 10 студентов!");
        }         count++;
    }     public void removeStudents(int i) {
        while (true) {
            if (student[count - 1] != null) {
                System.out.println("removeStudents");
                student[i - 1] = student[count - 1];
                for (int l = 0; l < count - 1; l++) {
                    System.out.println(l + 1 + ". " + student[l]);
                }
                count--;
                break;
            }
            else
            {
                count--;
            }
        }
        System.out.println();
    }
    public void findSecondName(String secondNames)
    {
        System.out.println("findSecondName");
        for (Student value : student) {
            if (value.secondName.equalsIgnoreCase(secondNames))
            {
                System.out.println(value);
                System.out.println();
            }
        }
    }
    @Override
    public String toString() {
        String[] str = new String[10];
        for (int i = 0; i < student.length; i++) {
            str[i] = student[i].toString();
        }
        Arrays.sort(str);
        return "Список по алфавиту :" + "\n" + Arrays.toString(str).replaceAll("\\[|]|,\\s", "").
                replaceAll(";","\n");
    }
}