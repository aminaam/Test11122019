
public class MobitelTest {

	public static void main(String[] args) {
		
		Mobitel mobitel = new Mobitel("Samsung", "s", "3", 4, 8, 64, 12, "viber");
		mobitel.ispisiSpecifikaciju();
		mobitel.instalirajAplikaciju("lego");
		mobitel.izbrisiAplikaciju("viber");
		mobitel.ispisiInstaliraneAplikacije();
		mobitel.ubaciSDKarticu(20);

	}

}
