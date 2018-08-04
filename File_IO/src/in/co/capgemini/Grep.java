package in.co.capgemini;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Grep {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter the path");
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();

		File file = new File(path);
		FileReader read = new FileReader(file);

		LineNumberReader line = new LineNumberReader(read);
		int count = 0, flag = 0;
		String lnr;
		System.out.println("Enter the String");
		String search = scanner.nextLine();

		// C:\\Users\\rituteja\\Desktop\\Ripudaman Singh\\File1.txt

		if (file.exists()) {
			while ((lnr = line.readLine()) != null) {
				
				count++;
				String[] word = lnr.split(" ");
				
				for (int i = 0; i < word.length; i++) {
					if (search.equals(word[i])) {
						System.out.println("Found in line: " + count);
						flag = 1;
					}
				}
			}
			if (flag == 0) {
				System.out.println("Word Not found");
			}

		} else {
			System.out.println("File Not Found");
		}

	}

}
