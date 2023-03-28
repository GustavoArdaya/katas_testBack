package com.example.Katas.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class FizzBuzzTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void executeReturnsFizzIfNumIsDivisibleBy3() {
        //Given
        var fizzBuzz = new FizzBuzz();
        //var fizzBuzz2 = new FizzBuzz();
        //When
        var sut = fizzBuzz.fizzBuzzFunction(3);
        //Then
        assertEquals("Fizz", sut);

    }

    @Test
    void executeReturnsBuzzIfNumIsDivisibleBy5() {
        //Given
        var fizzBuzz = new FizzBuzz();

        //When
        var sut = fizzBuzz.fizzBuzzFunction(5);
        //Then
        assertEquals("Buzz", sut);

    }

    @Test
    void executeReturnsFizzBuzzIfNumIsDivisibleBy3and5() {
        //Given
        var fizzBuzz = new FizzBuzz();

        //When
        var sut = fizzBuzz.fizzBuzzFunction(15);
        //Then
        assertEquals("FizzBuzz", sut);

    }

    @Test
    void executeReturnsSameNumberWhenNotDivisibleBy3or5() {
        //Given
        var fizzBuzz = new FizzBuzz();

        //When
        var sut = fizzBuzz.fizzBuzzFunction(14);
        //Then
        assertEquals("14", sut);

    }
}
