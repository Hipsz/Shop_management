package sklep;

public class Drukarka extends ProduktFizyczny {

	private Typ typ;
	private String model, typSkanera;

	public Drukarka(String nazwa, double cena, String wymiary, String producent, Typ typ, String model,
			String typSkanera) {
		super(nazwa, cena, wymiary, producent);
		this.typ = typ;
		this.model = model;
		this.typSkanera = typSkanera;
	}

	public Drukarka(String nazwa, double cena, String wymiary, String producent, Typ typ, String model) {
		super(nazwa, cena, wymiary, producent);
		this.typ = typ;
		this.model = model;

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
