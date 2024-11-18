package theater.seating;

public class Seat {
    private int n;
    private int m;
    private final String id;
    private boolean isOccupied;
    private boolean hasGift;
    private final SeatType seatType;

    public Seat(String id, boolean booked, SeatType type) {
        this.id = id;
        this.isOccupied = booked;
        this.seatType = type;
    }



    public String getId() {
        return id;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public boolean getHasGift() {
        return hasGift;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setIsOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public void setHasGift(boolean hasGift) {
        this.hasGift = hasGift;
    }

}