package com.example.lab1SebastianC;

import org.junit.jupiter.api.*;

@DisplayName("Calculator Tests")
public class CalculatorTests {

    Calculator calculator = new Calculator();

    @BeforeAll
    static void beforeAllTests() { System.out.println("Running entire test class CalculatorTest ...");}

    @BeforeEach
    void beforeEachTest() {System.out.println("Running an individual test method");}

    //Test 1
    @Test
    @DisplayName("Adding two odd numbers should return even sum")
    void addingTwoOddNumbersShouldReturnEvenSum() {
        int a = 3;
        int b = 3;
        int result = calculator.add(a, b);
        result = result % 2;
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, result);
    }

    //Test 2
    @Test
    @DisplayName("Subtraction of two negative numbers where a > b should return positive difference")
    void subtractionOfTwoNegativeNumbersAgreaterThanBShouldReturnPositiveDifference() {
        int a = -5;
        int b = -8;
        int result = calculator.subtract(a, b);
        boolean isPositive = result > 0;
        Assertions.assertTrue(isPositive);
    }

    //Test 3
    @Test
    @DisplayName("Multiplying two negative numbers should return a positive product")
    void multiplyinTwoNegativeNumbersShouldReturnPositiveProduct() {
        int a = -8;
        int b = -3;
        int result = calculator.multiply(a, b);
        boolean isPositive = result > 0;
        Assertions.assertTrue(isPositive);
    }

    //Test 4
    @Test
    @DisplayName("Division of positive numbers should not return zero")
    void divisionOfPositiveNumbersShouldNotReturnZero() {
        int a = 5;
        int b = 3;
        double result = calculator.divide(a, b);
        double expectedResult = 0;
        Assertions.assertNotEquals(expectedResult, result);
    }

    //Test 5
    @Test
    @DisplayName("Square root of a positive integer should return the correct value")
    void squareRootOfPositiveIntegerShouldReturnCorrectValue() {
        int a = 9;
        double result = calculator.squareRootOf(a);
        double expectedResult = 3;
        Assertions.assertEquals(expectedResult, result);
    }

    //Test 6
    @Test
    @DisplayName("Square root of a negative integer should return imaginary number")
    void squareRootOfNegativeIntegerShouldReturnImaginayNumber() {
        int a = -9;
        boolean result = Double.isNaN(calculator.squareRootOf(a));
        Assertions.assertTrue(result);
    }

    //Test 7
    @Test
    @DisplayName("Test expected result of the square root of 2")
    void testExpectedSquareRootOfTwo() {
        int a = 2;
        double result = calculator.squareRootOf(a);
        double expectedResult = 1.4142135623730951;
        Assertions.assertEquals(result, expectedResult);
    }

    //Test 8
    @Test
    @DisplayName("Area of a circle should not be less than given radius")
    void areaOfCircleShouldNotBeLessThanGivenRadius() {
        int a = 5;
        double result = calculator.getArea(a);
        boolean areaLessThanRadius = result < a;
        Assertions.assertFalse(areaLessThanRadius);
    }

    //Test 9
    @Test
    @DisplayName("Circumference of a circle with positive integer radius should not be less than zero")
    void circumferenceOfCircleWithPositiveIntegerRadiusShouldNotBeLessThanZero() {
        int a = 5;
        double result = calculator.getCircumference(a);
        boolean circumferenceLessThanZero = result < 0;
        Assertions.assertFalse(circumferenceLessThanZero);
    }

    @AfterEach
    void afterEachTest() {System.out.println("An individual test method has been completed");}

    @AfterAll
    static void afterAllTests() {System.out.println("The entire test class has been completed");}
}
