package banditi;

public class Pomeranje extends Akcija {
	private Smer smer;
	public Pomeranje(Kompozicija komp,Smer s) {
		super(komp);
		smer=s;
	}

	@Override
	public void izvrsi(Bandit b) {
		try {
			Vagon v=komp.dohvatiVagon(b);
			Vagon s=komp.dohvatiSusedniVagon(v, smer);
			v.ukloniBandita(b);
			s.dodajBandita(b);
		} catch (GNepostojeciVagon e) {
			
		}

	}

	@Override
	public String toString() {
		return "Pomeranje: "+ smer;
	}

}
