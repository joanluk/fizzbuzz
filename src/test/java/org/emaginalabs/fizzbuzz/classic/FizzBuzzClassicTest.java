package org.emaginalabs.fizzbuzz.classic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzClassicTest {

    @Test
    public void when_found_three_return_fizz() {
        assertEquals("Fizz", FizzBuzzClassic.validateFizzBuzz(3));
    }

    @Test
    public void when_found_five_return_buzz() {
        assertEquals("Buzz", FizzBuzzClassic.validateFizzBuzz(5));
    }

    @Test
    public void when_found_fifteen_return_fizzbuzz() {
        assertEquals("FizzBuzz", FizzBuzzClassic.validateFizzBuzz(15));
    }

    @Test
    public void when_found_no_fizz_and_buzz_return_number() {
        assertEquals("4", FizzBuzzClassic.validateFizzBuzz(4));
    }

}