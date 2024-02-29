package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringManipulatorKiranTest {

    private StringManipulatorKiran stringManipulator;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // Initialize resources shared among all test methods
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        // Clean up resources shared among all test methods
    }

    @Before
    public void setUp() throws Exception {
        // Set up resources before each test method
        stringManipulator = new StringManipulatorKiran();
    }

    @After
    public void tearDown() throws Exception {
        // Clean up resources after each test method
        stringManipulator = null;
    }

    @Test
    public void testReverse() {
        String input = "hello";
        String expectedOutput = "olleh";
        String actualOutput = stringManipulator.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCapitalize() {
        String input = "hello";
        String expectedOutput = "HELLO";
        String actualOutput = stringManipulator.capitalize(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
