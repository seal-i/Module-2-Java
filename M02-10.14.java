/**
 * MyDate.java
 * Chapter 10 - Exercise 10.14 from Liang's Introduction to Java Programming
 *
 * This class represents a custom date with functionality to create a date
 * from the current system time, elapsed milliseconds, or specific values.
 * It also provides basic accessors and a method to reset the date.
 */

import java.util.GregorianCalendar;
import java.util.Calendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // No-arg constructor that creates a MyDate object for the current date
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor that accepts elapsed time in milliseconds since Jan 1, 1970
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Sets the date based on elapsed milliseconds since Jan 1, 1970
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}
