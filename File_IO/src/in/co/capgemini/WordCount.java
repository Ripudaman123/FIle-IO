package in.co.capgemini;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the path");
        Scanner scanner=new Scanner(System.in);
     	String path=scanner.nextLine();
      
		File file=new File(path);
		FileReader read=new FileReader(file);
		LineNumberReader line = new LineNumberReader(read);
        int count=0;
        String lnr;
        //C:\\Users\\rituteja\\Desktop\\Ripudaman Singh\\File1.txt
        
		if(file.exists())
		{
			while ((lnr=line.readLine() )!= null) {
				String []word=lnr.split(" ");
				count+=word.length;		
			}
									
			System.out.println(count);
		
		}
		else
		{
			System.out.println("Not Found");
		}

	

	}

}
