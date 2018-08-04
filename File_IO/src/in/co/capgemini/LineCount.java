package in.co.capgemini;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class LineCount {

	public static void main(String args[]) throws IOException {
		
		System.out.println("Enter the path");
		
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();
		int count = 0;
		File file = new File(path);
		FileReader read = new FileReader(file);
		LineNumberReader line = new LineNumberReader(read);

		if (file.exists()) {
			while (line.readLine() != null) {
				count++;
			}
			System.out.println(count);
		}

		else {
			System.out.println("Not Found");
		}
	}
}
