import java.util.Scanner;

public class OsmiZadatak {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		int n = input.nextInt();
		System.out.print("Hailstone sekvenca za broj " + n + " je: ");
		while (n > 0) {
			if (n == 1) {
				System.out.print(n);
				break;
			} else if (n % 2 == 0) {
				System.out.print(n + " ");
				n = n / 2;
			} else {
				System.out.print(n + " ");
				n = (3 * n) + 1;
			}
		}

		input.close();
	}

}
