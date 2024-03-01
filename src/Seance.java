
public class Seance {

	private Film film;
	private String date;
	private int nbrPlacesV;
	private Salle salle;
	
	public Seance (Film f , String d , int nbrV,Salle s) {
		this.film = f; 
		this.date = d;
		this.salle = s;
		this.nbrPlacesV = nbrV;
	}
	
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNbrPlacesV() {
		return nbrPlacesV;
	}
	public void setNbrPlacesV(int nbrPlacesV) {
		this.nbrPlacesV = nbrPlacesV;
	}
	
	public void sellPlaces(int nbrPlaces) {
		this.nbrPlacesV += nbrPlaces;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	@Override
	public String toString() {
		return "Seance [film=" + film + ", date=" + date + ", nbrPlacesV=" + nbrPlacesV + ", salle=" + salle + "]";
	}
	
}
