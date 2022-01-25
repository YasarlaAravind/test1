package program.java.filehandling;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(System.in);

		FileOutputStream fout = new FileOutputStream("F://day2.txt",true);

		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);

		System.out.println("Enter the text( Put @ at the end.)");
		char ch;

		while((ch=(char) dis.read())!='@') {
			bout.write(ch);
		}

		bout.close();

	}

}
