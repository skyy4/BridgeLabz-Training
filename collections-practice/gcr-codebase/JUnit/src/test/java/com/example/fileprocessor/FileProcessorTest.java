package com.example.fileprocessor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

public class FileProcessorTest {

    @Test
    void testReadWrite() throws Exception {
        FileProcessor f = new FileProcessor();
        f.writeToFile("test.txt", "JUnit");
        assertEquals("JUnit", f.readFromFile("test.txt"));
    }

    @Test
    void testFileNotFound() {
        FileProcessor f = new FileProcessor();
        assertThrows(IOException.class, () -> f.readFromFile("none.txt"));
    }
}
