package sklep;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {

	private String dodatkoweInformacje;
	private double naklad;
	private Status status = Status.PRZYJETE;
	private List<Produkt> produkty = new ArrayList<>();
	private PracownikObslugi pracownikObslugi;
	//private List <KlientZamowienie> klientZamowienie = new ArrayList<>();
	private Klient klient;

	public Zamowienie(String dodatkoweInformacje, double naklad, Status status) {

		this.dodatkoweInformacje = dodatkoweInformacje;
		this.naklad = naklad;
		this.status = status;
	}
	public double kosztZbiorczy() {
		double suma = 0;
		for (Produkt p : produkty) {
			suma += p.getCena();
		}
		return suma;
	}

	public String getDodatkoweInformacje() {
		return dodatkoweInformacje;
	}

	public void setDodatkoweInformacje(String dodatkoweInformacje) {
		this.dodatkoweInformacje = dodatkoweInformacje;
	}

	public double getNaklad() {
		return naklad;
	}

	public void setNaklad(double naklad) {
		this.naklad = naklad;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Produkt> getProdukty() {
		return produkty;
	}

	public void setProdukty(List<Produkt> produkty) {
		this.produkty = produkty;
	}

	public PracownikObslugi getPracownikObslugi() {
		return pracownikObslugi;
	}

	public void setPracownikObslugi(PracownikObslugi pracownikObslugi) {
		this.pracownikObslugi = pracownikObslugi;
	}

	public void dodajWydruk(UslugaWydruku wydruk) {
		produkty.add(wydruk);
	}

	public void dodajProdukt(Produkt produkt) {
		if(produkt.getZamowienie() != null) {
			throw new IllegalArgumentException("Zamowienie ma juz ten produkt");
		}
		
		produkty.add(produkt);
		produkt.setZamowienie(this);
		
	}
//	public void dodajKlientZamowienie(KlientZamowienie klient) {
//		klientZamowienie.add(klient);
//	}
//
//	public List<KlientZamowienie> getKleintZamowienie() {
//		return klientZamowienie;
//	}
//
//	public void setKleintZamowienie(List<KlientZamowienie> klientZamowienie) {
//		this.klientZamowienie = klientZamowienie;
//	}
	

	

	public Klient getKlient() {
		return klient;
	}

	public void setKlient(Klient klient) {
		this.klient = klient;
	}

}
