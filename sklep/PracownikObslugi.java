package sklep;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PracownikObslugi extends Pracownik {

	private String zakresOdpowiedzialno�ci;
	private List<Zamowienie> zamowienia = new ArrayList<>();

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, String nazwaStazu, String zakresOdpowiedzialno�ci) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, dataZwolnienia, nazwaStazu);
		this.zakresOdpowiedzialno�ci = zakresOdpowiedzialno�ci;
	}

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, String nazwaStazu, String zakresOdpowiedzialno�ci) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, nazwaStazu);
		this.zakresOdpowiedzialno�ci = zakresOdpowiedzialno�ci;
	}

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, int lataDoswiadczenia,
			String zakresOdpowiedzialno�ci) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, dataZwolnienia, lataDoswiadczenia);
		this.zakresOdpowiedzialno�ci = zakresOdpowiedzialno�ci;
	}

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, int lataDoswiadczenia, String zakresOdpowiedzialno�ci) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, lataDoswiadczenia);
		this.zakresOdpowiedzialno�ci = zakresOdpowiedzialno�ci;
	}

	public String getZakresOdpowiedzialno�ci() {
		return zakresOdpowiedzialno�ci;
	}

	public void setZakresOdpowiedzialno�ci(String zakresOdpowiedzialno�ci) {
		this.zakresOdpowiedzialno�ci = zakresOdpowiedzialno�ci;
	}

	public List<Zamowienie> getZamowienia() {
		return zamowienia;
	}

	public void setZamowienia(List<Zamowienie> zamowienia) {
		this.zamowienia = zamowienia;
	}

	public void dodajZamowienie(Zamowienie zamowienie) {
		if (zamowienie.getPracownikObslugi() != null) {
			throw new IllegalArgumentException("Nie mo�na dodac");
		}
		zamowienia.add(zamowienie);
		zamowienie.setPracownikObslugi(this);
	}

	@Override
	public double wyliczPensje() {
		// TODO Auto-generated method stub
		return getStazPracy() * 1000;
	}

}
