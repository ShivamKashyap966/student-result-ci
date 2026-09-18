package com.shivam.studentresult;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentResultTest {

    private final StudentResult studentResult = new StudentResult();

    @Test
    void testCalculateTotal() {
        assertEquals(240, studentResult.calculateTotal(80, 75, 85));
    }

    @Test
    void testCalculateAverage() {
        assertEquals(80.0, studentResult.calculateAverage(80, 75, 85));
    }

    @Test
    void testCalculateGrade() {
        assertEquals("A", studentResult.calculateGrade(80));
    }

    @Test
    void testStudentPasses() {
        assertTrue(studentResult.isPassed(60, 70, 80));
    }

    @Test
    void testStudentFails() {
        assertFalse(studentResult.isPassed(60, 35, 80));
    }
}