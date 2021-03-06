package org.emaginalabs.fizzbuzz.classic;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * The FizzBuzz is an ancient word game. It is started to teach the children about division.
 * Now in many coding tests, it is a very popular challenge to solve the FizzBuzz problem.
 * In this problem, you have to print numbers from 0 to a certain range. But the problem is that
 * you must have to print “Fizz” instead of the numbers which are divisible by 3 and “Buzz” instead
 * of the numbers which are divisible by 5. But if a number is found to be divisible by both 3 and 5
 * then you must have to print “FizzBuzz” instead of the number.
 *
 * @see <a href="http://codingdojo.org/kata/FizzBuzz/>codingdojo.org/kata/FizzBuzz/</a>
 *
 * @author jose 
 */
@Slf4j
public class FizzBuzzClassic  {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    protected static String validateFizzBuzz(Integer i) {

        StringBuilder output = new StringBuilder();
        if (i % 3 == 0) output.append(FIZZ);
        if (i % 5 == 0) output.append(BUZZ);

        return output.toString().isEmpty() ? i.toString() : output.toString();
    }
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            log.info(validateFizzBuzz(i));
        }
    }
}
