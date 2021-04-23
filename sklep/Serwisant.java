package sklep;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Serwisant extends Pracownik {
	private int lataDoswiadczenia;
	
	
	private List<NaprawaSerwisant> naprawaSerwisant = new ArrayList<>();

	public Serwisant(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, String nazwaStazu, int lataDoswiadczenia) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, dataZwolnienia, nazwaStazu);
		this.lataDoswiadczenia = lataDoswiadczenia;
	}

	public Serwisant(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, String nazwaStazu, int lataDoswiadczenia) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, nazwaStazu);
		this.lataDoswiadczenia = lataDoswiadczenia;
	}

	public Serwisant(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, int lataDoswiadczenia, int lataDoswiadczenia2) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, dataZwolnienia, lataDoswiadczenia);
		lataDoswiadczenia = lataDoswiadczenia2;
	}

	public Serwisant(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, int lataDoswiadczenia, int lataDoswiadczenia2) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, lataDoswiadczenia);
		lataDoswiadczenia = lataDoswiadczenia2;
	}

	public int getLataDoswiadczenia() {
		return lataDoswiadczenia;
	}

	public void setLataDoswiadczenia(int lataDoswiadczenia) {
		this.lataDoswiadczenia = lataDoswiadczenia;
	}
	


	@Override
	public double wyliczPensje() {
		// TODO Auto-generated method stub
		return getStazPracy() * 800;
	}
	public void dodajNaprawaSerwisant (NaprawaSerwisant ns) {
		naprawaSerwisant.add(ns);
	}

}
