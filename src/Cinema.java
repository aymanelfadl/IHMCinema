import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Cinema implements IUserCinema ,IAdminCinema {

	private ArrayList<Salle> cinemaSalle = new ArrayList();
	private ArrayList<Film> cinemaFilms = new ArrayList();
	private ArrayList<Seance> cinemaSeance = new ArrayList();
	
	
	
	public ArrayList<Salle> getCinemaSalle() {
		return cinemaSalle;
	}
	public void setCinemaSalle(ArrayList<Salle> cinemaSalle) {
		this.cinemaSalle = cinemaSalle;
	}
	public ArrayList<Film> getCinemaFilms() {
		return cinemaFilms;
	}
	public void setCinemaFilms(ArrayList<Film> cinemaFilms) {
		this.cinemaFilms = cinemaFilms;
	}
	public ArrayList<Seance> getCinemaSeance() {
		return cinemaSeance;
	}
	public void setCinemaSeance(ArrayList<Seance> cinemaSeance) {
		this.cinemaSeance = cinemaSeance;
	}
	
	
	@Override
	public Film consulterFiml(String titreFilm) {
		for(Film f : cinemaFilms) {
			if(f.getTitreFilm().equals(titreFilm)) {
				return f;
			}
		}
		return null;
	}
	@Override
	public Salle consulterSalle(int idSalle) {
		for(Salle s : cinemaSalle) {
			if(s.getIdSalle() == idSalle) {
				return s;
			}
		}
		return null;
	}
	@Override
	public List<Film> consulterSeance() {
		return cinemaFilms;
	}
	@Override
	public void achterPlace(Film film) throws PlaceIndiponipleException {
	    for (Seance seance : cinemaSeance) {
	        Film seanceFilm = seance.getFilm();
	        if (seanceFilm != null && seanceFilm.equals(film)) {
	            if (seance.getSalle().getNbrPlaces() < seance.getNbrPlacesV()) {
	                seance.sellPlaces(1);
	            }
	        }
	    }
	}

	@Override
	public void ajouterFilm(Film f) {
		this.cinemaFilms.add(f);
		
	}
	@Override
	public void ajouterSeance(Seance S) {
		this.cinemaSeance.add(S);
	}
	public void ajouterSalle(Salle s) {
		this.cinemaSalle.add(s);
	}
	@Override
	public void chargerFimls() {
	    try {
	        File f = new File("C:\\Users\\amine\\eclipse-workspace\\Cinema\\Cenima.txt");
	        FileReader fr = new FileReader(f);
	        BufferedReader rb = new BufferedReader(fr);
	        String l;
	        while ((l = rb.readLine()) != null) {
	            String[] film = l.split(";");
	            if (film.length >= 2) {
	                cinemaFilms.add(new Film(film[0], film[1]));
	            } else {
	                System.out.println("Invalid data format at line: " + l);
	            }

	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void SerialiserLesDonnees() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
	    StringBuilder result = new StringBuilder("Cinema Details:\n");
	    
	    result.append("Salle List:\n");
	    for (Salle salle : cinemaSalle) {
	        result.append(salle.toString()).append("\n");
	    }
	    
	    result.append("Film List:\n");
	    for (Film film : cinemaFilms) {
	        result.append(film.toString()).append("\n");
	    }
	    
	    result.append("Seance List:\n");
	    for (Seance seance : cinemaSeance) {
	        result.append(seance.toString()).append("\n");
	    }

	    return result.toString();
	}

	
}
