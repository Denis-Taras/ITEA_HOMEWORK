package com.company.denis.Homework9;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay() {
        if (this == SATURDAY || this == SUNDAY) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isWeekend() {
        if (this == SATURDAY || this == SUNDAY) {
            return true;
        } else {
            return false;
        }
    }

    public static class Weekday2 {
            public static void main(String[] args) {
                for (Weekday day: values()) {
                    System.out.println(weekdayOrDayOff(day));
                }
            }

            public static String weekdayOrDayOff (Weekday day) {
                if (day.isWeekDay()) {
                    return day + " is a weekday";
                } else {
                    return day + " is a weekend";
                }
            }
        }
}