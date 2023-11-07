public abstract class Event {
    protected String place;
    protected String date;
    protected String startHour;
    protected int numberOFTickets;
    protected double priceOFTickets;

    public Event(String place, String date, String startHour, int numberOFTickets, double priceOFTickets) {
        this.place = place;
        this.date = date;
        this.startHour = startHour;
        this.numberOFTickets = numberOFTickets;
        this.priceOFTickets = priceOFTickets;
    }
    abstract boolean sellTicket(int numberOFTickets) throws NoMoreTicketException;

}
