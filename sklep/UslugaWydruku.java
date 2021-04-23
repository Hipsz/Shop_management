package sklep;

public class UslugaWydruku extends Produkt{

	private Rodzaj rodzaj;
	private double dodatkowaOplata;



	public UslugaWydruku(String nazwa, double cena, Rodzaj rodzaj, double dodatkowaOplata) {
		super(nazwa, cena);
		this.rodzaj = rodzaj;
		this.dodatkowaOplata = dodatkowaOplata;
	}
	

	public UslugaWydruku(String nazwa, double cena, Rodzaj rodzaj) {
		super(nazwa, cena);
		this.rodzaj = rodzaj;
	}


	public Rodzaj getRodzaj() {
		return rodzaj;
	}


	public void setRodzaj(Rodzaj rodzaj) {
		this.rodzaj = rodzaj;
	}


	public double getDodatkowaOplata() {
		return dodatkowaOplata;
	}


	public void setDodatkowaOplata(double dodatkowaOplata) {
		this.dodatkowaOplata = dodatkowaOplata;
	}



	

}
