import java.util.Scanner;
public class PetiZadatak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String rijec = "kraj";
		String s;
		String recenica = "";
		do {
			System.out.print("Unesite rijec: ");
			s = input.next();
			recenica += s;
		} while(!s.equals(rijec));
		
		for(int i=0; i<recenica.length(); i++) {
			char ch = recenica.charAt(i);
			System.out.print(ch);
			
		}

		input.close();
	}

}
