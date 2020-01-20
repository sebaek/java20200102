package chapter18.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/chapter18/exercise/p07/AddLineNumberExample.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int lineNum = 0;
		String line = null;
		
		while ((line = br.readLine()) != null) {
			lineNum++;
			System.out.println(lineNum + ": " + line);
		}
		
		br.close();
		

		
	}
}





