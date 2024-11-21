package theater.seating;

public class Seat {
    private final String id;
    private boolean isOccupied;
    private boolean hasGift;
    private final SeatType seatType;

    public Seat(String id, boolean booked, SeatType type) {
        this.id = id;
        this.isOccupied = booked;
        this.seatType = type;
    }

//<editor-fold desc="Getters && Setters">

    public String getId() {
        return id;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public boolean getHasGift() {
        return hasGift;
    }

    public void setHasGift(boolean hasGift) {
        this.hasGift = hasGift;
    }

//</editor-fold>
}