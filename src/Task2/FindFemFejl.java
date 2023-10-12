package Task2;

public class FindFemFejl {

    public static void main(String[] args) {
        Cinema biogrande = new Cinema(20, 10);

        // Reserver r�kke 1, s�de 5
        System.out.println("R�kke 1, s�de 5 er reserveret: " + biogrande.reserve(1, 5));

        // Print hele salen p�nt
        System.out.println(biogrande);

        // Reserver det sidste s�de i den sidste r�kke
        int numberOfRows = biogrande.getRows()-1; // tr�kker en fra da Array starter p� index 0
        int numberOfSeats = biogrande.getSeats()-1; // tr�kker en fra da Array starter p� index 0
        System.out.println("R�kke 19, s�de 9 er bestilt: " + biogrande.reserve(numberOfRows, numberOfSeats));

        // Afbestil reservation p� r�kke 1, s�de 5
        System.out.println("R�kke 1, s�de 5 er afbestilt: " + biogrande.cancelReservation(1, 5));
    }
}