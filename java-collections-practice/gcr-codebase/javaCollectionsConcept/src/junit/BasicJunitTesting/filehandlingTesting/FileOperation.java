package junit.BasicJunitTesting.filehandlingTesting;

import java.io.*;

public class FileOperation {
    public String writeToFile(String filename, String content) throws IOException {
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(content);
            return "Written successfully";
        }
    }

    public String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (FileReader fr = new FileReader(filename)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }
        }
        return content.toString();
    }
}