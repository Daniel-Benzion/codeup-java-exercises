import java.util.Scanner;

public class Bob {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Say something to Bob, ask a question, or say \"goodbye\" to end the conversation:\n");

		while (true) {
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("goodbye")) {
				System.out.println("Goodbye!");
				break;
			}else if (input.endsWith("?")) {
				System.out.println("Sure.");
			} else if (input.endsWith("!")) {
				System.out.println("Whoa, chill out!");
			} else if (input.isEmpty()) {
				System.out.println("Fine. Be that way!");
			} else {
				System.out.println("Whatever.");
			}
		}


	}
}
