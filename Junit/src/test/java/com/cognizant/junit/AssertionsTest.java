package com.cognizant.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // Assert Equals
        assertEquals(10, 5 + 5);

        // Assert True
        assertTrue(20 > 10);

        // Assert False
        assertFalse(5 > 10);

        // Assert Null
        String name = null;
        assertNull(name);

        // Assert Not Null
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }
}