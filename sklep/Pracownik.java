package sklep;

import java.time.LocalDate;

public abstract class Pracownik extends Osoba {

	private double stazPracy;
	private static double premia = 200;
	private LocalDate dataZatrudnienia, dataZwolnienia;
	private String nazwaStazu;
	private int lataDoswiadczenia;

	public Pracownik(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, String nazwaStazu) {
		super(imie, nazwisko, adres, telefon, emial);
		this.stazPracy = stazPracy;
		this.dataZatrudnienia = dataZatrudnienia;
		this.dataZwolnienia = dataZwolnienia;
		this.setNazwaStazu(nazwaStazu);
	}

	public Pracownik(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, String nazwaStazu) {
		super(imie, nazwisko, adres, telefon, emial);
		this.stazPracy = stazPracy;
		this.dataZatrudnienia = dataZatrudnienia;
		this.setNazwaStazu(nazwaStazu);
	}

	public Pracownik(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, int lataDoswiadczenia) {
		super(imie, nazwisko, adres, telefon, emial);
		this.stazPracy = stazPracy;
		this.dataZatrudnienia = dataZatrudnienia;
		this.dataZwolnienia = dataZwolnienia;
		this.setLataDoswiadczenia(lataDoswiadczenia);

	}

	public Pracownik(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, int lataDoswiadczenia) {
		super(imie, nazwisko, adres, telefon, emial);
		this.stazPracy = stazPracy;
		this.dataZatrudnienia = dataZatrudnienia;
		this.setLataDoswiadczenia(lataDoswiadczenia);
	}

	public double getStazPracy() {
		return stazPracy;
	}

	public void setStazPracy(double stazPracy) {
		this.stazPracy = stazPracy;
	}

	public static double getPremia() {
		return premia;
	}

	public static void setPremia(double premia) {
		Pracownik.premia = premia;
	}

	public LocalDate getDataZatrudnienia() {
		return dataZatrudnienia;
	}

	public void setDataZatrudnienia(LocalDate dataZatrudnienia) {
		this.dataZatrudnienia = dataZatrudnienia;
	}

	public LocalDate getDataZwolnienia() {
		return dataZwolnienia;
	}

	public void setDataZwolnienia(LocalDate dataZwolnienia) {
		this.dataZwolnienia = dataZwolnienia;
	}

	public abstract double wyliczPensje();

	public int getLataDoswiadczenia() {
		return lataDoswiadczenia;
	}

	public void setLataDoswiadczenia(int lataDoswiadczenia) {
		this.lataDoswiadczenia = lataDoswiadczenia;
	}

	public String getNazwaStazu() {
		return nazwaStazu;
	}

	public void setNazwaStazu(String nazwaStazu) {
		this.nazwaStazu = nazwaStazu;
	}

}
