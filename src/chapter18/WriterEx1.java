package chapter18;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		Writer fw = new FileWriter("output.txt");
		
		fw.write('한');
		fw.write('a');
		fw.write(97);
		fw.write(new char[] {'한', '글', '\n', 'a', 'b', 'c'});
		fw.write("한글abcde");
		
		fw.close();
	}
}



