package sklep;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PracownikObslugi extends Pracownik {

	private String zakresOdpowiedzialnoœci;
	private List<Zamowienie> zamowienia = new ArrayList<>();

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, String nazwaStazu, String zakresOdpowiedzialnoœci) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, dataZwolnienia, nazwaStazu);
		this.zakresOdpowiedzialnoœci = zakresOdpowiedzialnoœci;
	}

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, String nazwaStazu, String zakresOdpowiedzialnoœci) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, nazwaStazu);
		this.zakresOdpowiedzialnoœci = zakresOdpowiedzialnoœci;
	}

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, int lataDoswiadczenia,
			String zakresOdpowiedzialnoœci) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, dataZwolnienia, lataDoswiadczenia);
		this.zakresOdpowiedzialnoœci = zakresOdpowiedzialnoœci;
	}

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, int lataDoswiadczenia, String zakresOdpowiedzialnoœci) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, lataDoswiadczenia);
		this.zakresOdpowiedzialnoœci = zakresOdpowiedzialnoœci;
	}

	public String getZakresOdpowiedzialnoœci() {
		return zakresOdpowiedzialnoœci;
	}

	public void setZakresOdpowiedzialnoœci(String zakresOdpowiedzialnoœci) {
		this.zakresOdpowiedzialnoœci = zakresOdpowiedzialnoœci;
	}

	public List<Zamowienie> getZamowienia() {
		return zamowienia;
	}

	public void setZamowienia(List<Zamowienie> zamowienia) {
		this.zamowienia = zamowienia;
	}

	public void dodajZamowienie(Zamowienie zamowienie) {
		if (zamowienie.getPracownikObslugi() != null) {
			throw new IllegalArgumentException("Nie mo¿na dodac");
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
