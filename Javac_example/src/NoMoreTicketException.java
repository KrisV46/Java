public class NoMoreTicketException extends Exception{
    private String nameOfEvent;

    public NoMoreTicketException(String nameOfEvent) {
        //super();
        this.nameOfEvent = nameOfEvent;
    }

    public String getMessage() {
        return "There is no more tickets for: " + nameOfEvent;
    }
}
