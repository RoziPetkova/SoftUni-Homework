import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class SumLines {
	public static void main(String[] args) {
		try(
				  BufferedReader fileReader = new BufferedReader(
				    new FileReader("text.txt"));
				) {
				  while (true) {
				    String line = fileReader.readLine();
				    if (line == null) break;
				    int sum = 0;
				    for (int i = 0; i < line.length(); i++) {
						sum+= line.charAt(i);
					}
				    System.out.println(sum);
				  }
				} catch (IOException ioex) {
				  System.err.println("Cannot read the file ");
				}

	}
}
