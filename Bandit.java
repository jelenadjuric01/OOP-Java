package banditi;

import java.util.Objects;

public class Bandit {
	private int zlatnici=50;
	public enum Tim{A,B};
	private Tim tim;
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Bandit))
			return false;
		Bandit other = (Bandit) obj;
		return tim == other.tim && zlatnici == other.zlatnici;
	}*/
	public Bandit(Tim t) {
		this.tim = t;
	}
	public int dohvatiBrojZlatnika() {
		return zlatnici;
	}
	public void promeniBrojZlatnika(int zlatnici) {
		this.zlatnici+=zlatnici;
	}
	public Tim dohvatiTim() {
		return tim;
	}
	@Override
	public String toString() {
		return tim.toString()+zlatnici;
	}
	
	
}
