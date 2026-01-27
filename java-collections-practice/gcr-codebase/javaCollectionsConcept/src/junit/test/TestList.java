package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.BasicJunitTesting.listmanager.ListManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Array;
import java.util.*;

class TestList {
		
	ListManager manager;
    List<Integer> list;

    @BeforeEach
    void setup() {
        manager = new ListManager();
        list = new ArrayList<>();
    }
    @Test
    void testAddElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertEquals(2, manager.getSize(list));
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        manager.removeElement(list, 10);

        assertEquals(1, manager.getSize(list));
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        assertEquals(0, manager.getSize(list));

        manager.addElement(list, 5);
        manager.addElement(list, 15);

        assertEquals(2, manager.getSize(list));
    }

}
