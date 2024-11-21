package theater.person;

import theater.TheaterSeating;
import theater.seating.Seat;
import theater.seating.SeatType;

public class Spectator {
    private final String name;
    private Seat seat;

    public Spectator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Seat getSeat() {
        return seat;
    }

    public void bookAnySeat(TheaterSeating seating) {
        seat = seating.bookSeat();
    }

    public void bookSpecificSeat(TheaterSeating seating, int n, int m) {
        seat = seating.bookSeat(n, m);
    }

    public void bookTailoredSeat(TheaterSeating seating) {
        if(name.length() % 2 == 0) seat = seating.bookTailoredEmptySeat(SeatType.IT);
        else if (name.length() < 3) seat = seating.bookTailoredEmptySeat(SeatType.OT);
        else seat = seating.bookTailoredEmptySeat(SeatType.MT);
    }

    public boolean takeGift() {
        return seat.getHasGift();
    }
}
