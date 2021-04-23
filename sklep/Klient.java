package sklep;


import java.util.ArrayList;
import java.util.List;

public class Klient extends Osoba {
	private double znizka;
	List<Klient> ekstensja = new ArrayList<>();

	private List<Zamowienie> zamowienia = new ArrayList<>();
	// private List<KlientZamowienie> klientZamowienie = new ArrayList<>();

	public Klient(String imie, String nazwisko, String adres, String telefon, String emial, double znizka) {
		super(imie, nazwisko, adres, telefon, emial);
		this.znizka = znizka;
	}

	public Klient(String imie, String nazwisko, String adres, String telefon, double znizka) {
		super(imie, nazwisko, adres, telefon);
		this.znizka = znizka;

	}

	public Klient(String imie, String nazwisko, String adres, String telefon, String emial) {
		super(imie, nazwisko, adres, telefon, emial);
	}

	public Klient(String imie, String nazwisko, String adres, String telefon) {
		super(imie, nazwisko, adres, telefon);
	}

	public double ileWydal() {

		double suma = 0;
		for (Zamowienie kz : zamowienia) {
			suma += kz.kosztZbiorczy();
		}
		return suma;

	}

	public static Klient najdrozszyKlient(List<Klient> klienci) {
		Klient max = klienci.get(0);
		if (klienci == null || klienci.isEmpty()) {
			throw new IllegalArgumentException("nie ma klientow");
		}
		for (Klient k : klienci) {
			if (k.ileWydal() > (max.ileWydal())) {
				k = max;
			}

		}
		return max;
	}

	public double getZnizka() {
		return znizka;
	}

	public void setZnizka(double znizka) {
		this.znizka = znizka;
	}

//	public List<KlientZamowienie> getKlientZamowienie() {
//		return klientZamowienie;
//	}
//
//	public void dodajKlientZamowienie(KlientZamowienie klient) {
//		klientZamowienie.add(klient);
//	}

	@Override
	public String toString() {
		return getImie() + " " + getNazwisko();
	}

	public List<Zamowienie> getZamowienia() {
		return zamowienia;
	}

	public void setZamowienia(List<Zamowienie> zamowienia) {
		this.zamowienia = zamowienia;
	}

}
