package sklep;

import java.time.LocalDate;

public class KlientZamowienie {
	private Klient klient;
	private Zamowienie zamowienie;
	private LocalDate data;

	public KlientZamowienie(Klient klient, Zamowienie zamowienie, LocalDate data) {
		super();
		this.klient = klient;
		//klient.dodajKlientZamowienie(this);
		// informacja zwrotna infromujesz klient ze mam przypsiany obiekt klient - zamowienie
		this.zamowienie = zamowienie;
		//zamowienie.dodajKlientZamowienie(this);
		this.data = data;
		
	}

	public Klient getKlient() {
		return klient;
	}

	public void setKlient(Klient klient) {
		this.klient = klient;
	}

	public Zamowienie getZamowienie() {
		return zamowienie;
	}

	public void setZamowienie(Zamowienie zamowienie) {
		this.zamowienie = zamowienie;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}
