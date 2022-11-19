package org.dmp;

public class Year

{
    private final int year;
    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return isDivisibleBy(4) && !(isDivisibleBy(100) && isNotDivisibleBy(400));
    }

    private boolean isDivisibleBy(int number) {
        return year % number == 0;
    }

    private boolean isNotDivisibleBy(int number) {
        return !(isDivisibleBy(number));
    }
}
