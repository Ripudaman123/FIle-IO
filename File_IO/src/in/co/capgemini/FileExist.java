package in.co.capgemini;

import java.io.File;
import java.util.Scanner;

public class FileExist {

	public static void main(String[] args) {

		System.out.println("Enter the path");
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();

		File file = new File(path);

		if (file.exists()) {
			System.out.println("Exists");
		}

		else {
			System.out.println("Not Found");
		}

	}

}
