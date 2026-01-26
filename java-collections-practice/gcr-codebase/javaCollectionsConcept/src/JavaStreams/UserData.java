package JavaStreams;

import java.io.*;

public class UserData {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter your details (type 'exit' to save):");

        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("UserData.txt")) {

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line);
                fw.write(System.lineSeparator());
            }
        }
        System.out.println("Data saved successfully!");
	}
}
