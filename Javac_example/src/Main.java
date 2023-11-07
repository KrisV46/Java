public class Main {
    public static void main(String[] args) {
        Concert concert = new Concert("Venue A", "2023-11-10", "18:00", 100, 50.0, "Artist X");
        VolleyBallMatch volleyBallMatch = new VolleyBallMatch("Stadium B", "2023-12-05", "15:00", 200, 25.0, "Team1", "Team2");

        try {
            System.out.println("Selling Concert Tickets...");
            concert.sellTicket(3);
            concert.sellTicket(2);

            System.out.println("\nSelling Volleyball Match Tickets...");
            volleyBallMatch.sellTicket(5);

            System.out.println("\nTrying to Sell More Tickets than Available...");
            concert.sellTicket(150);
        } catch (NoMoreTicketException e) {
            System.out.println(e.getMessage());
        }
    }
}
