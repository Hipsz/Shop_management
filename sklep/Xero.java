package sklep;

import java.util.ArrayList;
import java.util.List;

public class Xero extends ProduktFizyczny {

	private int liczbaKartek;
	private List <String> funkcja = new ArrayList<>();
	public Xero(String nazwa, double cena, String wymiary, String producent, int liczbaKartek, List<String> funkcja) {
		super(nazwa, cena, wymiary, producent);
		this.liczbaKartek = liczbaKartek;
		this.funkcja = funkcja;
	}
	public int getLiczbaKlatek() {
		return liczbaKartek;
	}
	public void setLiczbaKlatek(int liczbaKlatek) {
		this.liczbaKartek = liczbaKlatek;
	}
	public List<String> getFunkcja() {
		return funkcja;
	}
	public void setFunkcja(List<String> funkcja) {
		this.funkcja = funkcja;
	}
	
}
