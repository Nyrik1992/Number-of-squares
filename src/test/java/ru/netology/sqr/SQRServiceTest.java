package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
public void shouldSqrtCeilWithoutCeiling () {
        SQRService service = new SQRService();
        int number = 200;
        int number2 = 300;
        int expected = 3;


        int actual = service.sqrtCeil(number, number2);
        assertEquals(expected, actual);

        System.out.println("Количество целых чисел входящих в диапозон  равен " + actual);

    }

    @Test
    public void shouldSqrtCeilWithoutNumbersThemselves () {
        SQRService service = new SQRService();
        int number = 10;
        int number2 = 99;
        int expected = 0;


        int actual = service.sqrtCeil(number, number2);
        assertEquals(expected, actual);

        System.out.println("Количество целых чисел входящих в диапозон  равен " + actual);
    }
    @Test

    public void shouldSqrtRangeFromZero () {
        SQRService service = new SQRService();
        int number = 0;
        int number2 = 1000;
        int expected = 22;


        int actual = service.sqrtCeil(number, number2);
        assertEquals(expected, actual);

        System.out.println("Количество целых чисел входящих в диапозон  равен " + actual);

    }
    @Test
    public void shouldSqrtNegativeRange () {
        SQRService service = new SQRService();
        int number = -100;
        int number2 = -200;
        int expected = 0;


        int actual = service.sqrtCeil(number, number2);
        assertEquals(expected, actual);

        System.out.println("Количество целых чисел входящих в диапозон  равен " + actual);

    }

    }

