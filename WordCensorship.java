import java.util.Scanner;

public class WordCensorship {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);		
		String adjective;
		boolean isInvalidWord;
		
		do {
			System.out.println("Enter an adjective which describes the great Richard:");
			adjective = scanner.nextLine();
			String adjectiveLowerCase = adjective.toLowerCase();
			isInvalidWord = (adjectiveLowerCase.contains("lame") ||
					 adjectiveLowerCase.contains("not funny"));
			if(isInvalidWord) {
				System.out.printf("This word is not allowed. Try again. %n %n");
			}											 		
		} while (isInvalidWord);
		
		System.out.printf("Richard is %s!", adjective);
	}
}
