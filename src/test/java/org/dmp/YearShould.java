package org.dmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearShould {

    @Test
    void be_a_leap_year_if_is_divisible_by_4() {
        assertTrue(isLeapYear(1996));
    }

    @Test
    void not_be_a_leap_year_if_is_not_divisible_by_4() {
        assertFalse(isLeapYear(1997));
    }

    @Test
    void be_a_leap_year_if_is_divisible_by_400() {
        assertTrue(isLeapYear(1600));
    }

    @Test
    void not_be_a_leap_year_if_is_divisible_by_100_but_not_by_400() {
        assertFalse(isLeapYear(1800));
    }

    private static boolean isLeapYear(int year) {
        return new Year(year).isLeapYear();
    }
}