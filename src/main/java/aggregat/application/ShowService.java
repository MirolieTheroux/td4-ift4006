package aggregat.application;

import aggregat.domain.Show;
import aggregat.domain.Ticket;

import java.util.List;

public class ShowService {

    private final Show show;

    public ShowService(Show show) {
        this.show = show;
    }

    public boolean sellTickets(int number, String reservationName) {
        return show.sellTickets(number, reservationName);
    }

    public List<String> retrieveTicketsIds(String reservationName) {
        return show.retrieveTicketsIds(reservationName);
    }
}
