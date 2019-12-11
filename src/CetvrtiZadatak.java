import java.util.Scanner;
public class CetvrtiZadatak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite recenicu: ");
		String s = input.nextLine();
		boolean razmak = true;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLetter(ch)) {
				razmak = false;
			}
			if(razmak) {
				System.out.println(i-1);
			}
		}

	}

}
