/*
Ajouter un nouveau film
– Ajouter une novelle salle
– Ajouter une nouvelle séance.
– Consulter le chiffre d’affaire (Total des prix des places vendues de toutes les séances)
– Consulter le taux de remplissage pour un film donné
– Charger les films à partir d’un fichier texte.
– Sérialiser les données du cinéma.
*/

import java.util.ArrayList;

public interface IAdminCinema {
	
	public void ajouterFilm(Film f);
	public void ajouterSeance(Seance S);
	public void chargerFimls();
	public void SerialiserLesDonnees();
}
