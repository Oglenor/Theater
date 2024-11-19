package theater.person;

import theater.TheaterSeating;
import theater.seating.Seat;

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

    }

    public void bookSpecificSeat(TheaterSeating seating, int n, int m) {

    }

    public void bookTailoredSeat(TheaterSeating seating) {

    }

    public boolean takeGift() {
        return true;
    }
}
