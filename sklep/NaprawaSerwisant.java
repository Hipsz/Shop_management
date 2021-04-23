package sklep;

public class NaprawaSerwisant {
	private Naprawa naprawa;
	private Serwisant serwisant;
	private String notatka;
	public NaprawaSerwisant(Naprawa naprawa, Serwisant serwisant, String notatka) {
		super();
		this.naprawa = naprawa;
		this.serwisant = serwisant;
		this.notatka = notatka;
	}
	public NaprawaSerwisant(Naprawa naprawa, Serwisant serwisant) {
		super();
		this.naprawa = naprawa;
		naprawa.dodajNaprawaSerwisant(this);
		this.serwisant = serwisant;
		serwisant.dodajNaprawaSerwisant(this);
	}
	public Naprawa getNaprawa() {
		return naprawa;
	}
	public void setNaprawa(Naprawa naprawa) {
		this.naprawa = naprawa;
	}
	public Serwisant getSerwisant() {
		return serwisant;
	}
	public void setSerwisant(Serwisant serwisant) {
		this.serwisant = serwisant;
	}
	public String getNotatka() {
		return notatka;
	}
	public void setNotatka(String notatka) {
		this.notatka = notatka;
	}
	
	

}
