package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    void test12() {
        TwoNumbersSum two = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,0));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2));
        Assertions.assertEquals(expected, two.addTwoNumbers(first, second));
    }

    @Test
    void test12_9_plus_3() {
        TwoNumbersSum two = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2));
        Assertions.assertEquals(expected, two.addTwoNumbers(first, second));
    }

    @Test
    void test12_2() {
        TwoNumbersSum two = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1,0));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2));
        Assertions.assertEquals(expected, two.addTwoNumbers(first, second));
    }

    @Test
    void test_2_single_digits_sum_to_doubleDigit() {
        TwoNumbersSum two = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(7));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,6));
        Assertions.assertEquals(expected, two.addTwoNumbers(first, second));
    }

    @Test
    void test_2_doubleDigits_sum_to_tripleDigit() {
        TwoNumbersSum two = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9,1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(7,2));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,6,3));
        Assertions.assertEquals(expected, two.addTwoNumbers(first, second));
    }

    @Test
    void test807() {
        TwoNumbersSum two = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2,4,3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(5,6,4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(8,0,7));
        Assertions.assertEquals(expected, two.addTwoNumbers(first, second));
    }

    @Test
    void test358() {
        TwoNumbersSum two = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2,3,5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3,5,8));
        Assertions.assertEquals(expected, two.addTwoNumbers(first, second));
    }

}
