package sklep;

import java.io.Serializable;

public abstract class Osoba extends Ekstensja implements Serializable{

	private String imie, nazwisko, adres, telefon, emial;

	public Osoba(String imie, String nazwisko, String adres, String telefon, String emial) {

		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.telefon = telefon;
		this.emial = emial;
	}

	public Osoba(String imie, String nazwisko, String adres, String telefon) {

		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.telefon = telefon;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	@Override
	public String toString() {
		return "imie=" + imie + ", nazwisko=" + nazwisko;
	}
	

}
