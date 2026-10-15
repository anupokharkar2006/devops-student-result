package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void passingMarks() {
        assertEquals("PASS", App.getResult(75));
    }

    @Test
    void failingMarks() {
        assertEquals("FAIL", App.getResult(25));
    }

    @Test
    void invalidMarks() {
        assertEquals("Invalid marks", App.getResult(110));
    }
}
