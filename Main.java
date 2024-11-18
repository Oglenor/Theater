import Theater.*;

public class Main {
    public static void main(String []args) {
        TheaterSeating ts = new TheaterSeating(7, 7);

        ts.print();
        System.out.println(ts.getAmountOfGifts());
    }
}
