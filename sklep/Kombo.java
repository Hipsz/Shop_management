package sklep;

import java.util.List;

public class Kombo extends Xero implements IKombo {

	private double waga;

	private Typ typ;
	private String model, typSkanera;
	public Kombo(String nazwa, double cena, String wymiary, String producent, int liczbaKartek, List<String> funkcja,
			double waga, Typ typ, String model, String typSkanera) {
		super(nazwa, cena, wymiary, producent, liczbaKartek, funkcja);
		this.waga = waga;
		this.typ = typ;
		this.model = model;
		this.typSkanera = typSkanera;
	}
	public Kombo(String nazwa, double cena, String wymiary, String producent, int liczbaKartek, List<String> funkcja,
			double waga, Typ typ, String model) {
		super(nazwa, cena, wymiary, producent, liczbaKartek, funkcja);
		this.waga = waga;
		this.typ = typ;
		this.model = model;
		
	}
	public double getWaga() {
		return waga;
	}
	public void setWaga(double waga) {
		this.waga = waga;
	}
	public Typ getTyp() {
		return typ;
	}
	public void setTyp(Typ typ) {
		this.typ = typ;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTypSkanera() {
		return typSkanera;
	}
	public void setTypSkanera(String typSkanera) {
		this.typSkanera = typSkanera;
	}
	

}
