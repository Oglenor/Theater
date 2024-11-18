package Theater;

public class Seat {
    private final int n;
    private final int m;
    private boolean booked;
    private SeatType type;

    public Seat(int n, int m, SeatType type) {
        this.n = n;
        this.m = m;
        this.type = type;
        this.booked = false;
    }

    public int getN() {
        return this.n;
    }

    public int getM() {
        return this.m;
    }

    public boolean isBooked() {
        return booked;
    }

    public SeatType getType() {
        return type;
    }
}