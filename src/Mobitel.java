import java.util.ArrayList;

public class Mobitel {

	public String proizvodjac;
	public String model;
	public String brzinaProcesora;
	public int brojJezgriProcesora;
	public int kolicinaRamMemorije;
	public int kolicinaMemorija;
	public int brojMegapikselaKamere;
	public ArrayList<String> nizInstaliranihAplikacija;

	public Mobitel() {

	}

	public Mobitel(String proizvodjac, String model, String brzinaProcesora, int brojJezgriProcesora,
			int kolicinaRamMemorije, int kolicinaMemorija, int brojMegapikselaKamere, String aplikacija) {

		this.proizvodjac = proizvodjac;
		this.model = model;
		this.brzinaProcesora = brzinaProcesora;
		this.brojJezgriProcesora = brojJezgriProcesora;
		this.brojMegapikselaKamere = brojMegapikselaKamere;
		this.kolicinaMemorija = kolicinaMemorija;
		this.kolicinaRamMemorije = kolicinaRamMemorije;
		nizInstaliranihAplikacija.add(aplikacija);
	}

	public void ispisiSpecifikaciju() {
		System.out.println("Proizvodjac je: " + proizvodjac);
		System.out.println("Model je: " + model);
		System.out.println("Brzina procesora je: " + brzinaProcesora);
		System.out.println("Broj jezgri procesora je: " + brojJezgriProcesora);
		System.out.println("Kolicina ram memorije: " + kolicinaRamMemorije);
		System.out.println("Kolicina memorije je: " + kolicinaMemorija);
		System.out.println("BrojMegapikselaKamere " + brojMegapikselaKamere);
		System.out.println("Niz instaliranih aplikacija: " + nizInstaliranihAplikacija);
	}

	public void instalirajAplikaciju(String ime) {
		nizInstaliranihAplikacija.add(ime);
	}

	public void izbrisiAplikaciju(String ime) {
		nizInstaliranihAplikacija.remove(ime);
	}

	public void ispisiInstaliraneAplikacije() {
		for (int i = 0; i < nizInstaliranihAplikacija.size(); i++) {
			System.out.println(nizInstaliranihAplikacija.get(i));
		}
	}

	public void ubaciSDKarticu(int memorija) {
		this.kolicinaMemorija += memorija;
	}

}
