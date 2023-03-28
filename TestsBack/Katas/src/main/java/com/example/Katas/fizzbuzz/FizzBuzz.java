package com.example.Katas.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzzFunction(Integer number) {
        if (number%15 == 0) return "FizzBuzz";
        else if (number%5 == 0) return "Buzz";
        else if (number%3 == 0) return "Fizz";
        else return number.toString();
    }
}
