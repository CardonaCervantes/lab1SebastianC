package com.example.lab1SebastianC;

import org.junit.jupiter.api.*;

@DisplayName("Validator Tests")
public class ValidatorTests {

    @BeforeAll
    static void beforeAllTests() { System.out.println("Running entire test class CalculatorTest ...");}

    @BeforeEach
    void beforeEachTest() {System.out.println("Running an individual test method");}

    @Test
    @DisplayName("Check if phone number contains non digits")
    void checkPhoneNumberContainsNonDigits() {
        String a = "0151680A";
        boolean containsNonDigits = Validator.isPhoneNumberValid(a);
        Assertions.assertFalse(containsNonDigits);
    }

    @Test
    @DisplayName("Check if phone number is correct")
    void checkPhoneNumberIsCorrect() {
        String a = "012345";
        boolean isCorrect = Validator.isPhoneNumberValid(a);
        Assertions.assertTrue(isCorrect);
    }

    @Test
    @DisplayName("Check if phone number starts with Zero")
    void checkPhoneNumberStartsWithZero() {
        String a = "1234567";

        boolean startsWithZero = Validator.isPhoneNumberValid(a);
        Assertions.assertFalse(startsWithZero);
    }

    @Test
    @DisplayName("Test if a substring is empty")
    void testEmptyString() {
        String a = "@email.se";
        boolean emptyString = Validator.isEmailValid(a);
        Assertions.assertFalse(emptyString);
    }

    @Test
    @DisplayName("Test if a dot is allowed in the name")
    void testDotInName() {
        String a = "namn.efternamn@email.se";
        boolean isDotInName = Validator.isEmailValid(a);
        Assertions.assertTrue(isDotInName);
    }

    @Test
    @DisplayName("Test if method throws an error if @ is not present")
    void testNoAtSign() {
        String a = "namn.efternamn.email.com";
        boolean noAtSign = Validator.isEmailValid(a);
        Assertions.assertFalse(noAtSign);
    }

    @AfterEach
    void afterEachTest() {System.out.println("An individual test method has been completed");}

    @AfterAll
    static void afterAllTests() {System.out.println("The entire test class has been completed");}
}
