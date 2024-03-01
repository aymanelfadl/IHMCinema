import java.util.*;

public class Test {

    public static void main(String[] args) {
        try {
            Cinema cinema = new Cinema();
            Film film = new Film("ayman", "elfadl");
            cinema.ajouterSalle(new SalleNormal(1, "SN1", 1, 60));
            cinema.ajouterSalle(new SalleVip(2, "SV1", 2, 120));
            cinema.ajouterFilm(film);

            Seance seance = new Seance(film, "01/10/2024", 0, new SalleNormal(1, "SN1", 1, 60));
            seance.setFilm(cinema.consulterFiml("ayman"));
            seance.setSalle(cinema.consulterSalle(2));

            cinema.ajouterSeance(seance);

            cinema.chargerFimls();

            System.out.println("Cinema details before selling places:\n" + cinema.toString());

            Seance selectedSeance = cinema.getCinemaSeance().get(0);
            System.out.println("\nSelling 5 places for the seance...");
            selectedSeance.sellPlaces(5);

            System.out.println("\nCinema details after selling places:\n" + cinema.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
