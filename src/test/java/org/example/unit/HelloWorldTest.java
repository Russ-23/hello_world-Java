package org.example.unit;

import org.example.HelloWorld;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The HelloWorldTest class is responsible for testing the HelloWorld class.
 */
public class HelloWorldTest {

    /**
     * Tests the functionality of the HelloWorld class by capturing and verifying the printed output.
     */
    @Test
    public void testHelloWorld() {
        // Create a ByteArrayOutputStream to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Invoke the main method of HelloWorld
        HelloWorld.main(new String[]{});

        // Get the captured output
        String printedOutput = outputStream.toString().trim();

        // Verify that the printed output matches the expected "Hello, World!" message
        assertEquals("Hello, World!", printedOutput);
    }
}
