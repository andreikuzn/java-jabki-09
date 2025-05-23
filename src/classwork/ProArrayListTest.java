package classwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProArrayListTest {
    private ProArrayList list;

    @BeforeEach
    void setUp() {
        list = new ProArrayList();
    }

    @Test
    void sizeTest() {
        assertEquals(0, list.size());
        list.add("one");
        list.add("two");
        assertEquals(2, list.size());
    }

    @Test
    void addByIndexTest() {
        list.add("a");
        list.add("b");
        list.add("c");

        list.add(1, "X");
        assertEquals(4, list.size());
        assertEquals("a", list.get(0));
        assertEquals("X", list.get(1));
        assertEquals("b", list.get(2));
        assertEquals("c", list.get(3));
    }

    @Test
    void getTest() {
        list.add("first");
        list.add("second");
        assertEquals("first", list.get(0));
        assertEquals("second", list.get(1));
    }

    @Test
    void addByIndexOutOfBoundsTest() {
        list.add("a");
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, "fail"));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(2, "fail"));
    }

    @Test
    void getOutOfBoundsTest() {
        list.add("one");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }
}
