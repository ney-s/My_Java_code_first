package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result, "2 + 3 应该等于 5");
    }
}