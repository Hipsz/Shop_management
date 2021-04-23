package sklep;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Naprawa {

	private LocalDate dataNaprawy;
	private ProduktFizyczny produktFizyczny;

	private List<CzescZamienna> czesci = new ArrayList<>();
	private List<NaprawaSerwisant> naprawaSerwisant = new ArrayList<>();
	

	public Naprawa(LocalDate dataNaprawy) {
		super();
		this.dataNaprawy = dataNaprawy;
	
	}
	

	public LocalDate getDataNaprawy() {
		return dataNaprawy;
	}

	public void setDataNaprawy(LocalDate dataNaprawy) {
		this.dataNaprawy = dataNaprawy;
	}

	public List<CzescZamienna> getCzesc() {
		return czesci;
	}

	public void setCzesc(List<CzescZamienna> czesc) {
		this.czesci = czesc;
	}
	public void dodajCzesc(CzescZamienna czesc) {
		czesci.add(czesc);
	}
	
	public ProduktFizyczny getProduktFizyczny() {
		return produktFizyczny;
	}


	public void setProduktFizyczny(ProduktFizyczny produktFizyczny) {
		this.produktFizyczny = produktFizyczny;
	}


	public List<CzescZamienna> getCzesci() {
		return czesci;
	}


	public void setCzesci(List<CzescZamienna> czesc) {
		this.czesci = czesci;
	}
	public void dodajNaprawaSerwisant (NaprawaSerwisant ns) {
		naprawaSerwisant.add(ns);
	}
	public void dodajCzesci(CzescZamienna czesc) {
		if(czesc.getNaprawa() != null) {
			throw new IllegalArgumentException("Nie mozna dodac");
		}
		czesci.add(czesc);
		czesc.setNaprawa(this);
	}


	public double obliczKoszt() {
		double suma = 0;
		for(CzescZamienna czesc : czesci) {
			suma+=czesc.getCena();
		}
		return suma * 1.15;
	}

	
}
