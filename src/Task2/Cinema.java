package Task2;

public class Cinema {
    String[][] seats;

    // R�kke 0, s�de 0 er altid reserveret til direkt�ren og skal derfor have v�rdien X
    // S�der, der ikke er reserveret, har v�rdien "O"
    public Cinema(int rows, int seats) {

        this.seats = new String[rows][seats];
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        System.out.println(seats[row][seat]);
        System.out.println(seats[19][9]);
        if (seats[row][seat] == null) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("x")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = null;
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
