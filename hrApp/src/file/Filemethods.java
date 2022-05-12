package file;

import java.io.File;
import java.io.FileWriter;

public class Filemethods {
	static File myfile = new File("D:\\temp\\sample.txt");
	static File destFileName = new File("D:\\temp\\Firstfile.txt");
	static File curfile = destFileName;
	public static void appendDataToFile() {
		try {

			FileWriter fw1 = new FileWriter(curfile, true);
			if (fw1 != null) {
				String textToAppend ="happy learning file concept";
				/*System.out.println(" enter text to append:");
				java.util.Scanner sc = new java.util.Scanner(System.in);
				textToAppend = sc.nextLine();
				sc.close();*/
				fw1.write(textToAppend);
				fw1.close();
				System.out.println("Append successfully"); 
			} 
		
		} catch (Exception e) {
			System.out.println("Error in Rename: " + e.getMessage());

		}

	}

}
