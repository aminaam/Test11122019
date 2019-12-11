import java.util.Scanner;

public class DevetiZadatak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = input.next();
		input.close();
		int i = 0;
		int j = 1;
		char slovo = '0';

		while (i < s.length() && j < s.length()) {
			slovo = s.charAt(i);
			char narednoSlovo = s.charAt(j);

			if (slovo != narednoSlovo) {
				j++;
			} else {
				i++;
			}
		}
		System.out.println(slovo);

	}

}
