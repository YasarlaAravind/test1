package program.java.filehandling;
import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("F://ExclipseFile.txt");

			if (file.createNewFile()) {
				System.out.println("New File is created...");
			}
			else {
				if (file.exists()) {
					System.out.println("File already exists");
					System.out.println("File path :" + file.getAbsolutePath());
					System.out.println("File name :" + file.getName());
					System.out.println("File Class :" + file.getClass());
					System.out.println("File Parent :" + file.getParent());
					System.out.println("File Space :" + file.getUsableSpace());
					System.out.println("File Length :" + file.length());
					System.out.println("File list :" + file.list());
				}
				else {
					System.out.println("File doesn't exists");
				}

				// ----------------Deletion of file

				boolean b = file.delete();
				if (b == true)
					System.out.println("File deleted successfully");
				else
					System.out.println("File NOT deleted successfully");
				}
			}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
