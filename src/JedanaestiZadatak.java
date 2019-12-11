import java.util.Scanner;

public class JedanaestiZadatak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String s = input.next();
		System.out.print("Unesite karakter: ");
		char ch = input.next().trim().charAt(0);
		input.close();

		for (int i = s.length() - 1; i >= 0; i--) {
			if (ch == s.charAt(i)) {
				System.out.println(i);
				break;
			}
		}

	}

}
