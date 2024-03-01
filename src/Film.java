import java.util.*;

public class Film {

	private String titreFilm;
	private String realisateurFilm;
	
	public Film (String titre, String realisateur) {
		this.realisateurFilm = realisateur;
		this.titreFilm = titre;
	}
	
	public String getTitreFilm() {
		return titreFilm;
	}
	public void setTitreFilm(String titreFilm) {
		this.titreFilm = titreFilm;
	}
	public String getRealisateurFilm() {
		return realisateurFilm;
	}
	public void setRealisateurFilm(String realisateurFilm) {
		this.realisateurFilm = realisateurFilm;
	}
	 public String toString() {
	        return "Film [titreFilm=" + titreFilm + ", realisateur=" + realisateurFilm + "]";
	    }
}
