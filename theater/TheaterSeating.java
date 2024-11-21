package theater;

import theater.seating.*;

public class TheaterSeating {
    private final Seat[][] seats;
    private int giftsTotal;
    private final int amountOfGifts;

    public TheaterSeating(int row, int col) {
        if (row < 0 || col < 0) throw new IllegalArgumentException();
        seats = new Seat[row][col];
        for(int i = 0; i < row; i++) for(int j = 0; j < col; j++) initSeating(i, j);
        amountOfGifts = giftsTotal;
    }

    private void initSeating(int i, int j) {
        seats[i][j] = new Seat(String.format("%s:%s", i, j), false, setType(i, j));
        if(i + j % 2 != 0) giftsTotal++;
    }

    private SeatType setType(int i, int j) {
        if(seats[i].length % 2 != 0
                && j == seats[i].length / 2) return SeatType.MT;
        else if (i == 0
                || j == 0
                || i == seats.length-1
                || j == seats[i].length-1) return SeatType.OT;
        else return SeatType.IT;
    }

    public Seat[][] getSeats() {
        return seats;
    }

    public Seat bookSeat() {
        for (Seat[] seat : seats)
            for (Seat value : seat)
                if (!value.getIsOccupied()) return value;
        return null;
    }

    public Seat bookSeat(int row, int col) {
        if (seats[row][col].getIsOccupied()) throw new IllegalArgumentException();
        else return seats[row][col];
    }

    public Seat bookTailoredEmptySeat(SeatType type) {
        for (Seat[] seat : seats)
            for (Seat value : seat)
                if (!value.getIsOccupied() && type.equals(value.getSeatType())) return value;
        return null;
    }

    public int totalTakenGifts() {
        for (Seat[] seat : seats)
            for (Seat value : seat)
                if (value.getHasGift() && value.getIsOccupied()) decreaseGifts();
        return giftsTotal;
    }

    public void decreaseGifts() {
        giftsTotal--;
    }

    public int getAmountOfGifts() {
        return amountOfGifts;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}