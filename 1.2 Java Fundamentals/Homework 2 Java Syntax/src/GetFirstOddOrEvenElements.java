import java.util.Objects;
import java.util.Scanner;
public class GetFirstOddOrEvenElements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] text = input.nextLine().split(" ");
		String[] commands = input.nextLine().split(" ");
		
		int[] numbers = new int[text.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(text[i]);
		}
		GetNumbers(numbers, commands[1], commands[2]);
	}
	public static void GetNumbers(int[] numbers, String count, String oddOrEven){
		if (Objects.equals("odd",oddOrEven)) {
			for (int i = 0, totalCount = 0; i < numbers.length; i++) {
				if (numbers[i] % 2 != 0 && totalCount<=Integer.parseInt(count)) {
					System.out.print(numbers[i] + " ");
					totalCount++;
				}
			}
		} 
		if(Objects.equals("even",oddOrEven)) {
			for (int i = 0, totalCount = 0; i < numbers.length; i++) {
				if (numbers[i] % 2 == 0 && totalCount<=Integer.parseInt(count)) {
					System.out.print(numbers[i] + "*");
					totalCount++;
				}
			}
		}
	}
}
