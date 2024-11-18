package theater.seating;

import java.util.Map;
import java.util.function.Predicate;

public class TheaterSeating {
    private Seat[][] seats;
    private int giftsTotal;

    public Seat[][] getSeats() {
        return seats;
    }

    public TheaterSeating(int N, int M) {
        this.seats = new Seat[N][M];
    }

    private void initSeating(int N, int M) {

    }

    public Seat bookSeat() {
        return new Seat("00", true , SeatType.OT);
    }

    public Seat bookSeat(int row, int col) {
        return new Seat("00", true , SeatType.OT);
    }


    public Seat bookTailoredEmptySeat(SeatType type, boolean flag) {
        return new Seat("00", true , SeatType.OT);
    }

    public int totalTakenGifts() {
        return 0;
    }

    public void decreaseGifts() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}