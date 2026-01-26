package JavaStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyOneToAnother {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("file.txt");
			FileOutputStream fos = new FileOutputStream("output.txt");
			
			int byteData;
			while((byteData = fis.read())!=-1) {
				fos.write(byteData);
			}
			System.out.println("File copied sucessfully!");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
