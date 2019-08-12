package statystyki;

public class koszykarz {

	String imie;
	String nazwisko;
	String PPG;
	double ppg;
	String RPG;
	double rpg;
	String APG;
	double apg;
	String Wiek;
	int wiek;

	public koszykarz(String imie, String nazwisko, String PPG, double ppg, String RPG, double rpg, String APG, double apg, String Wiek, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.PPG = PPG;
		this.ppg = ppg;
		this.RPG = RPG;
		this.rpg = rpg;
		this.APG = APG;
		this.apg = apg;
		this.Wiek = Wiek;
		this.wiek = wiek;
	}

	public String pokazDaneKoszykarza() {
		return imie + " " + nazwisko + " " + PPG + " " + ppg + " " + RPG + " " + rpg + " " + APG + " " + apg + " " + Wiek + " " + wiek;
	}

}
