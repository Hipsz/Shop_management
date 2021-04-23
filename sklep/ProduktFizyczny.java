package sklep;

import java.util.ArrayList;
import java.util.List;

public abstract class ProduktFizyczny extends Produkt {

	private int numerSeryjny;
	public static int generator = 1;
	private String wymiary, producent;
	private List <Naprawa> naprawy = new ArrayList<>();

	public ProduktFizyczny(String nazwa, double cena, String wymiary, String producent) {
		super(nazwa, cena);
		setNumerSeryjny(generator);
		generator++;
		this.wymiary = wymiary;
		this.producent = producent;
	}

	public int getNumerSeryjny() {
		return numerSeryjny;
	}

	public void setNumerSeryjny(int numerSeryjny) {
		this.numerSeryjny = numerSeryjny;
	}

	public static int getGenerator() {
		return generator;
	}

	public static void setGenerator(int generator) {
		ProduktFizyczny.generator = generator;
	}

	public String getWymiary() {
		return wymiary;
	}

	public void setWymiary(String wymiary) {
		this.wymiary = wymiary;
	}

	public String getProducent() {
		return producent;
	}
	

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public List<Naprawa> getNaprawy() {
		return naprawy;
	}

	public void setNaprawy(List<Naprawa> naprawy) {
		this.naprawy = naprawy;
	}
	public void dodajNaprawe (Naprawa naprawa) {
		if(naprawa.getProduktFizyczny() != null) {
			throw new IllegalArgumentException("naprawa jest ju¿ przypisana do produktu");
		}
		
		naprawy.add(naprawa);
		naprawa.setProduktFizyczny(this);
	}
	

}
