public class VolleyBallMatch extends Event{
    protected String firstTeam, secondTeam;

    public VolleyBallMatch(String place, String date, String startHour, int numberOFTickets, double priceOFTickets, String firstTeam, String secondTeam) {
        super(place, date, startHour, numberOFTickets, priceOFTickets);
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }
    @Override
    public boolean sellTicket(int num) throws NoMoreTicketException {
        if (num > this.numberOFTickets || this.numberOFTickets == 0) {
            throw new NoMoreTicketException(this.firstTeam + " - " + this.secondTeam);
        } else {
            this.numberOFTickets = this.numberOFTickets - num;
            return true;
        }
    }

    }
