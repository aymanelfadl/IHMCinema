/*Consulter un film sachant son titre.
– Consulter une salle sachant son numéro
– Consulter les films des séances programmées.
– Acheter une place pour un film donné. Si la place n’est pas disponible, une exception de type
PlaceIndiponipleException est générée. 
*/

import java.util.List;

public interface IUserCinema {
	
	public Film consulterFiml(String titreFilm);
	public Salle consulterSalle(int idSalle);
	public List<Film> consulterSeance();
	public void achterPlace(Film film) throws PlaceIndiponipleException ;
	
}
