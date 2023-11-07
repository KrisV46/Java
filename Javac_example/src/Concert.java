public class Concert extends Event{
    protected String starName;

    public Concert(String place, String date, String startHour, int numberOFTickets, double priceOFTickets, String starName) {
        super(place, date, startHour, numberOFTickets, priceOFTickets);
        this.starName = starName;
    }
    public boolean sellTicket(int num) throws NoMoreTicketException {
        if (num > this.numberOFTickets || this.numberOFTickets == 0) {
            throw new NoMoreTicketException(this.starName + "'s concert.");
        } else {
            this.numberOFTickets = this.numberOFTickets - num;
            System.out.println(num + " tickets saled!");
            System.out.println("All free tickets are: " + this.numberOFTickets);
            return true;
        }
    }
}
