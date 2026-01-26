package JavaStreams.ByteArrayInputStream;

import java.io.ByteArrayInputStream;
import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageToByteArray {
	public static void main(String[] args) {
		File originalImage = new File("src/JavaStreams/ByteArrayInputStream/test.jpg");
		File copiedImage = new File("src/JavaStreams/ByteArrayInputStream/output.jpg");
		
		try {
			byte[] imageBytes;
			try(FileInputStream fis = new FileInputStream(originalImage);
					ByteArrayOutputStream baos = new ByteArrayOutputStream()){
				byte[] buffer = new byte[1024];
				
				int bytesRead;
				
				while((bytesRead =fis.read(buffer))!=-1) {
					baos.write(buffer,0, bytesRead);
				}
				imageBytes = baos.toByteArray();
			}
		try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                FileOutputStream fos = new FileOutputStream(copiedImage)) {

               byte[] buffer = new byte[1024];
               int bytesRead;
               while ((bytesRead = bais.read(buffer)) != -1) {
                   fos.write(buffer, 0, bytesRead);
               }
           }
		byte[] originalBytes = Files.readAllBytes(originalImage.toPath());
        byte[] copiedBytes = Files.readAllBytes(copiedImage.toPath());

        if (Arrays.equals(originalBytes, copiedBytes)) {
            System.out.println("The image files are identical.");
        } else {
            System.out.println("The image files are different.");
        }
		}catch(IOException e) {
			System.out.println("IOException occured: "+e.getMessage());
		}
	}
}
