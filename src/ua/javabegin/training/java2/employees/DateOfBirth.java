package ua.javabegin.training.java2.employees;

import java.util.Calendar;

public class DateOfBirth {
    public int year, month, day;
    Calendar cal = Calendar.getInstance();

    public void dateOfBirth(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.cal.set(year, month, day);
    }
}
