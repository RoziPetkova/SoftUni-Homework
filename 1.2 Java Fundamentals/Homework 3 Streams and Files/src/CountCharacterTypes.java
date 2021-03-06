import java.io.*;
import java.util.regex.*;
public class CountCharacterTypes {
	public static void main(String[] args) {
		//List text = new List();
		//String text = input.nextLine();
		Pattern vowelsRegex = Pattern.compile("[aeiou]");
		Pattern consonantsRegex = Pattern.compile("[^aeiou\\s.,?!]");
		Pattern punctuationRegex = Pattern.compile("[,.!?]");
		int vowelsCount = 0;
		int consonantsCount = 0;
		int punctuationCount = 0;
		//Matcher matcher = wordRegex.matcher(text);
//		while (matcher.find()) {
//			System.out.print(matcher.group() + " ");
//		}
		try(
				  BufferedReader fileReader = new BufferedReader(
				    new FileReader("words.txt"));
				) {
				  while (true) {
				    String line = fileReader.readLine();
				    if (line == null) break;

					Matcher vowelsMatcher = vowelsRegex.matcher(line);
					Matcher consonantsMatcher = consonantsRegex.matcher(line);
					Matcher punctuationMatcher = punctuationRegex.matcher(line);
					while (vowelsMatcher.find()) {
						vowelsCount++;
					}
					while (consonantsMatcher.find()) {
						consonantsCount++;
					}
					while (punctuationMatcher.find()) {
						punctuationCount++;
					}
					
				  }
				} catch (IOException ioex) {
				  System.err.println("Cannot read the file ");
				}
		try(PrintWriter print = new PrintWriter("countChars.txt");)
	    {
				print.write("Vowels: " + vowelsCount + "\n");
				print.write("Consonants: " + consonantsCount + "\n");
				print.write("Punctuation: " + punctuationCount + "\n");
			
	    }
	    catch (IOException ioex) {
			  System.err.println("Error ");
			}
		System.exit(0);
	}
}