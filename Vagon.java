package banditi;

import java.util.LinkedList;

public class Vagon {
	private LinkedList<Bandit> banditi;

	public Vagon() {
		banditi = new LinkedList<Bandit>();
	}
	public void dodajBandita(Bandit b) {
		banditi.add(b);
	}
	public int dohvatiBrojBandita(){
		return banditi.size();
		}
	public boolean sadrziBandita(Bandit b) {
		return banditi.contains(b);
	}
	public void ukloniBandita(Bandit b) {
		banditi.remove(b);
	}
	public Bandit dohvatiBandita(int i) {
		return banditi.get(i);
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append('[');
		for( int i=0;i<banditi.size();i++) {
			sb.append(dohvatiBandita(i));
			if(i!=banditi.size()-1) {
				sb.append(',');
			}
		}
		sb.append(']');
		return sb.toString();
	}
}
