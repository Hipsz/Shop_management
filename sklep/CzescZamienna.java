package sklep;

public class CzescZamienna {

	private String nazwa, producent;
	private int cena;
	private Naprawa naprawa;

	public CzescZamienna(String nazwa, String producent, int cena, Naprawa naprawa) {
		super();
		this.nazwa = nazwa;
		this.producent = producent;
		this.cena = cena;

	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public Naprawa getNaprawa() {
		return naprawa;
	}

	public void setNaprawa(Naprawa naprawa) {
		this.naprawa = naprawa;
	}
	

}
