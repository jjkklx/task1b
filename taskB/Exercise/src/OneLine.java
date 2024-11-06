import java.util.Scanner;

public class OneLine {
	public static void main (String[] args) {
		String separator = args[0];
		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		String line3 = scanner.nextLine();
		line1 = line1.toLowerCase();
		line2 = line2.toLowerCase();
		line3 = line3.toLowerCase();
		System.out.println(line1 + separator + line2 + separator + line3);
		scanner.close();
	}
}