package homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static homework.Homework.*;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTest {
    @Test
    void joinListTest() {
        assertEquals("7 1 7 42 10", joinList(asList(7, 1, 7, 42, 10)));
    }

    @Test
    void thirdElementTest() {
        assertEquals(3, thirdElement(asList(1, 2, 3, 4, 5)));
        assertNull(thirdElement(asList(1, 2)));
    }

    @Test
    void removeSecondTest() {
        assertEquals(asList(1, 3, 4), removeSecond(asList(1, 2, 3, 4)));
        assertEquals(List.of(1), removeSecond(List.of(1)));
    }

    @Test
    void sumOfListTest() {
        assertEquals(10, sumOfList(asList(1, 2, 3, 4)));
        assertEquals(0, sumOfList(emptyList()));
    }

    @Test
    void countSevensTest() {
        assertEquals(3, countSevens(asList(7, 1, 7, 42, 7)));
        assertEquals(0, countSevens(asList(1, 2, 3)));
    }

    @Test
    void contains42Test() {
        assertTrue(contains42(asList(1, 42, 2, null)));
        assertFalse(contains42(asList(1, 2, 3)));
        assertFalse(contains42(asList(null, null, null)));
        assertFalse(contains42(emptyList()));

    }

    @Test
    void minAndMaxTest() {
        assertArrayEquals(new int[] {1, 42}, minAndMax(asList(7, 1, 7, 42, 10)));
        assertNull(minAndMax(new ArrayList<>()));
    }

    @Test
    void removeEvenNumbersTest() {
        assertEquals(asList(1, 3, 5), removeEvenNumbers(asList(1, 2, 3, 4, 5, 6)));
    }

    @Test
    void removeEvenNumbersAllOddTest() {
        assertEquals(asList(1, 7, 3, 9, 5, 11), removeEvenNumbers(asList(1, 7, 3, 9, 5, 11)));
    }

    @Test
    void listFromArrayTest() {
        assertEquals(asList(1, 2, 3, 4), listFromArray(new int[] {1, 2, 3, 4}));
    }

    @Test
    void listFromArrayEmptyTest() {
        assertEquals(emptyList(), listFromArray(new int[] {}));
    }

    @Test
    void countGreaterThanNTest() {
        List<Integer> list = asList(1, 5, 10, 15);
        assertEquals(2, countGreaterThanN(list, 7));
        assertEquals(0, countGreaterThanN(list, 15));
    }

    @Test
    void longStringsTest() {
        List<String> list = asList("cat", "apple", "cucumber", "Banana", "Автомобиль", "Арбуз");
        assertEquals(asList("cucumber", "Banana", "Автомобиль"), longStrings(list));
    }

    @Test
    void longStringsEmptyTest() {
        assertEquals(emptyList(), longStrings(asList("cat", "apple", "жук", "бант", "Авто", "Арбуз")));
    }

    @Test
    void reversedListTest() {
        assertEquals(asList(4, 3, 2, 1), reversedList(asList(1, 2, 3, 4)));
        assertEquals(emptyList(), reversedList(emptyList()));
    }

    @Test
    void unionNoDuplicatesTest() {
        List<Integer> l1 = asList(1, 2, 3, 4);
        List<Integer> l2 = asList(3, 4, 5, 6);
        assertEquals(asList(1, 2, 3, 4, 5, 6), unionNoDuplicates(l1, l2));
    }

    @Test
    void sumOfOddNumbersPositiveTest() {
        assertEquals(9, sumOfOddNumbers(asList(1, 2, 3, 4, 5)));
    }

    @Test
    void sumOfOddNumbersNegativeTest() {
        assertEquals(0, sumOfOddNumbers(asList(6, 2, 8, 4, 10)));
    }

    @Test
    void filterByFirstATest() {
        List<String> list = asList("Автобус", "Арбуз", "банан", "cat", "Apple", "Анна");
        assertEquals(asList("Автобус", "Арбуз", "Анна"), filterByFirstA(list));
    }

    @Test
    void filterByFirstAEmptyTest() {
        List<String> list = asList("Бус", "Дыня", "банан", "cat", "Apple", "Жанна");
        assertEquals(emptyList(), filterByFirstA(list));
    }
}
