package JavaStreams;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StudentDataStream {
	public static void main(String[] args) throws IOException{
		
		String filename = "student.dat";
		try(DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream(filename))){
			
			int rollNo = 111;
			String name ="Nageshwar";
			double cgpa = 7.5;
			
			dos.writeInt(rollNo);
			dos.writeUTF(name);
			dos.writeDouble(cgpa);
			
			System.out.println("Student data writtent sucessfully");
		}
		try(DataInputStream dis 
				= new DataInputStream(new FileInputStream(filename))){
			int rollNo = dis.readInt();
			String name = dis.readUTF();
			double cgpa = dis.readDouble();
			
			System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll No : " + rollNo);
            System.out.println("Name    : " + name);
            System.out.println("GPA     : " + cgpa);
			
		}
	}
}
