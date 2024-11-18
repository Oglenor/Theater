package Theater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class TheaterSeating {
    private final int N;
    private final int M;
    private int amountOfGifts;
    private int takenGifts;
    private ArrayList<Seat> seats;
    private Map<String, Predicate<Integer>> P;

    public TheaterSeating(int n, int m) { N = n; M = m; init(); }

    public int getAmountOfGifts() { return amountOfGifts; }

    public int totalTakenGifts() {return takenGifts; }

    public void decreaseGifts() { takenGifts--; }

    private void init() {
        this.P = new HashMap<>(); seats = new ArrayList<>(); int tmp = 0;
        P.put("isOdd",  (M) -> M % 2 != 0);
        P.put("isMid",  (m) -> m == M / 2);
        P.put("isOutR", (n) -> n == 0 || n == N-1);
        P.put("isOutC", (m) -> m == 0 || m == M-1);

        for(int i = 0; i < N; i++)
            for(int j = 0; j < M; j++) {
                seats.add(new Seat(i + 1, j + 1, setType(i, j)));
                if(P.get("isOdd").test(i+1 + j+1)) tmp++;
            }
        amountOfGifts = tmp;
        takenGifts = amountOfGifts;
    }

    private SeatType setType(int i, int j) {
        if(P.get("isOdd").test(M) && P.get("isMid").test(j)) return SeatType.MT;
        else if(P.get("isOutR").test(i) || P.get("isOutC").test(j)) return SeatType.OT;
        else return SeatType.IT;
    }

    private int idx(int i, int j) { return (i * N) + j; }

    public void print() {
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) System.out.print(seats.get(idx(i, j)).getType() + "; ");
            System.out.println("\n");
        }
    }
}