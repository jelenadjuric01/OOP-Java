package banditi;

import java.util.LinkedList;

public class Kompozicija {
	private LinkedList<Vagon> vagoni;
	public Kompozicija() {
		vagoni=new LinkedList<Vagon>();
	}
	public void dodajVagon(Vagon v) {
		vagoni.addLast(v);
	}
	public Vagon dohvatiVagon(Bandit b) throws GNepostojeciVagon {
		for(Vagon v:vagoni) {
			if(v.sadrziBandita(b)) {
				return v;
			}
		}
		throw new GNepostojeciVagon();
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for( int i=0;i<vagoni.size();i++) {
			sb.append(vagoni.get(i));
			if(i!=vagoni.size()-1) {
				sb.append('_');
			}
		}
		return sb.toString();
	}
	public Vagon dohvatiSusedniVagon(Vagon v,Smer s) throws GNepostojeciVagon {
		Vagon v1=null;
	
		try {
		if(s.compareTo(Smer.ISPRED)!=0) {
			v1=vagoni.get(vagoni.indexOf(v)+1);
			if(v1==null) throw new GNepostojeciVagon();
			else return v1;
			
			
		}
		else {
			v1=vagoni.get(vagoni.indexOf(v)-1);
			if(v1==null) throw new GNepostojeciVagon();
			else return v1;
		}
		}
		catch(IndexOutOfBoundsException i){
			throw new GNepostojeciVagon();
		}
	}
	public static void main(String[] args) {
		Vagon v=new Vagon();
		Bandit b=new Bandit(Bandit.Tim.A);
		Bandit b2=new Bandit(Bandit.Tim.B);
		v.dodajBandita(b);
		Kompozicija k=new Kompozicija();
		k.dodajVagon(v);
		k.dodajVagon(new Vagon());
		try {
			Vagon v1=k.dohvatiVagon(b2);
		} catch (GNepostojeciVagon e) {
			System.out.println("Nema");
		}
	}
}
