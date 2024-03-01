import java.util.*;

public class SalleVip extends Salle{
	
	private int placePrix;
	
	public SalleVip (int id, String nom, int nbrPlaces , int p) {
		super(id,nom,nbrPlaces);
		this.placePrix = p ;
	}

	public void setSallePrix(int p) {
		this.placePrix = p;
	}
	
	public int getPlacePrix() {
		return this.placePrix;
	}

	@Override
	public String toString() {
		return "SalleVip [placePrix=" + placePrix + "]";
	}
}
