package com.company.denis.Homework12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {

    private String name;
    private String group;
    private int course;
    private double avrScore;

    public Student(String name, String group, int course, double avrScore) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.avrScore = avrScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvrScore() {
        return avrScore;
    }

    public void setAvrScore(double avrScore) {
        this.avrScore = avrScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", avrScore=" + avrScore +
                '}';
    }

    private static List<Student> checkStudent(List<Student> students) {
        ArrayList<Student> checkedStudents = new ArrayList<>();
        for (Student student: students) {
            if (student.getAvrScore() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
                checkedStudents.add(student);
            }
        }
        return checkedStudents;
    }

    private static ArrayList<Student> printStudents(List<Student> students, int course) {
        ArrayList<Student> neededStudents = new ArrayList<>();
        for (Student student: students) {
            if (student.getCourse() == course) {
                neededStudents.add(student);
            }
        }
        return neededStudents;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Михаил", "114", 1, 4.3));
        students.add(new Student("Потап", "115", 2, 2.9));
        students.add(new Student("Гаврюша", "114", 2, 2.8));
        students.add(new Student("Васыль", "114", 2, 3.0));
        students.add(new Student("Гурам", "115", 2, 4.7));
        students.add(new Student("Алмаз", "114", 2, 3.5));

        System.out.println("All students: " + students);

        System.out.println("Students after check: " + checkStudent(students));

        System.out.println("Students with course 2: " + printStudents(students, 2));
    }
}