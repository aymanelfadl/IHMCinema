import java.util.*;

public class SalleNormal extends Salle{
	private int placePrix;
	
	public SalleNormal (int id, String nom, int nbrPlaces , int p) {
		super(id,nom,nbrPlaces);
		this.placePrix = p ;
	}

	public int getPlacePrix() {
		return placePrix;
	}

	public void setPlacePrix(int placePrix) {
		this.placePrix = placePrix;
	}

	@Override
	public String toString() {
		return "SalleNormal [placePrix=" + placePrix + "]";
	}
	
}
