package junit.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;

import junit.BasicJunitTesting.filehandlingTesting.FileOperation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class TestFileHandling {
	
	FileOperation fileOp = new FileOperation();

    @TempDir
    Path tempDir; 
    @Test
    void testWriteAndReadSuccess() throws IOException {
        File tempFile = tempDir.resolve("testfile.txt").toFile();
        String expectedContent = "Hello World";

        fileOp.writeToFile(tempFile.getAbsolutePath(), expectedContent);
        
        assertTrue(tempFile.exists(), "File should exist after writing");

        String actualContent = fileOp.readFromFile(tempFile.getAbsolutePath());
        assertEquals(expectedContent, actualContent, "Content should match");
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        String fakePath = tempDir.resolve("missing.txt").toString();

        assertThrows(IOException.class, () -> {
            fileOp.readFromFile(fakePath);
        }, "Reading a non-existent file should throw IOException");
    }
}
