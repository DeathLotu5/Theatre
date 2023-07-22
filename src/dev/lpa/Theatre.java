package dev.lpa;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Theatre {

    class Seat implements Comparable<Seat> {
        private String seatNum;
        private boolean reserved;

        public Seat(char rowChar, int seatNo) {
            this.seatNum = "%c%03d".formatted(rowChar, seatNo).toUpperCase();
        }

        @Override
        public String toString() {
            return seatNum;
        }

        @Override
        public int compareTo(Seat o) {
            return seatNum.compareTo(o.seatNum);
        }
    }

    private String theatreName;
    private int seatPerRow;
    private NavigableSet<Seat> seats;

    public Theatre(String theatreName, int row, int totalSeats) {
        this.theatreName = theatreName;
        this.seatPerRow = totalSeats / row;
        seats = new TreeSet<>();
        for (int i = 0; i< totalSeats; i++) {

        }
    }

}
