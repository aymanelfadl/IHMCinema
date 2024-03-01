import java.util.*;

public abstract class Salle  {

	private int idSalle;
	private String nomSalle;
	private int nbrPlaces;
	
	public Salle(int id, String nom, int nbrPlaces) {
		this.idSalle = id ;
		this.nomSalle = nom ;
		this.nbrPlaces = nbrPlaces  ;
		
	}
	
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public String getNomSalle() {
		return nomSalle;
	}
	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}
	public int getNbrPlaces() {
		return nbrPlaces;
	}
	public void setNbrPlaces(int nbrPlaces) {
		this.nbrPlaces = nbrPlaces;
	}
	
}
