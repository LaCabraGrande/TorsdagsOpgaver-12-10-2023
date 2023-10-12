package Task2;

public class FindFemFejl {

    public static void main(String[] args) {
        Cinema biogrande = new Cinema(20, 10);

        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 5));

        // Print hele salen pænt
        System.out.println(biogrande);

        // Reserver det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows()-1; // trækker en fra da Array starter på index 0
        int numberOfSeats = biogrande.getSeats()-1; // trækker en fra da Array starter på index 0
        System.out.println("Række 19, sæde 9 er bestilt: " + biogrande.reserve(numberOfRows, numberOfSeats));

        // Afbestil reservation på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 5));
    }
}