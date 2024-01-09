package banditi;

public abstract class Akcija {
	protected Kompozicija komp;
	
	public Akcija(Kompozicija komp) {
		this.komp = komp;
	}

	public abstract void izvrsi(Bandit b);
}
