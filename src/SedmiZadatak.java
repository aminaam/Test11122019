import java.util.Scanner;

public class SedmiZadatak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu:");
		String s = input.nextLine();
		input.close();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				if (i % 2 != 0 || i == 0) {
					System.out.print(Character.toUpperCase(ch));
				} else {
					System.out.print(ch);
				}
			} else {
				System.out.print(" ");
			}
		}

	}

}
