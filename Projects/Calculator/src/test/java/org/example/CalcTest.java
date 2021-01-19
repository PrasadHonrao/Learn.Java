package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc calc;

    @BeforeAll
    static void initAll() {
        System.out.println("before all");
    }

    @BeforeEach
    void setUp() {
        calc = new Calc();
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("teardown");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("after all");
    }


    @Test
    void add() {
        int result = calc.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    void subtract() {
        int result = calc.subtract(10, 20);
        assertEquals(-10, result);
    }

    @Test
    void multiply() {
        int result = calc.multiply(10, 20);
        assertEquals(200, result);
    }

    @Test
    void divide() {
        int result = calc.divide(20, 10);
        assertEquals(2, result);
    }

    @Test
    void divideByZeroShouldThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () ->
            calc.divide(20, 0)
        );
    }

    @Test
    void mod() {
        int result = calc.mod(20, 3);
        assertEquals(2, result);
    }
}