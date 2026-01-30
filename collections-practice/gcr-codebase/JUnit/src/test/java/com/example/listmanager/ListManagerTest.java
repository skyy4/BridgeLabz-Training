package com.example.listmanager;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListManagerTest {

    ListManager m = new ListManager();

    @Test
    void testAdd() {
        List<Integer> l = new ArrayList<>();
        m.addElement(l, 10);
        assertEquals(1, l.size());
    }

    @Test
    void testRemove() {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        m.removeElement(l, 10);
        assertEquals(0, l.size());
    }

    @Test
    void testSize() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        assertEquals(2, m.getSize(l));
    }
}
