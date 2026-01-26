package JavaStreams;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {
	public static void main(String[] args) {
		
		try {
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);
			
			Thread writer = new Thread(()->{
					try {
						String message = "Hello from Writer thread!";
						pos.write(message.getBytes());
						pos.close();
					}catch(IOException e) {
						System.out.println("Writer Error: "+e.getMessage());
					}
			});
			
			Thread reader = new Thread(()->{
				try {
					int data;
					while((data=pis.read())!=-1) {
						System.out.println((char) data);
					}
					pis.close();
				}catch(IOException e) {
					System.out.println("Reader Error: "+ e.getMessage());
				}
				
			});
			reader.start();
			writer.start();
		}catch(IOException e) {
			System.out.println("Stream connection error: "+e.getMessage());
		}
	}
}
