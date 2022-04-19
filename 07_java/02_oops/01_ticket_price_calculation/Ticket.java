public class Ticket {
  public static int getAvailableTickets() {
    return availableTickets;
  }

  public static void setAvailableTickets(int availableTickets) {
    if (availableTickets > 0)
      Ticket.availableTickets = availableTickets;
  }

  private static int availableTickets;
  private int ticketid;
  private int price;

  public int getTicketid() {
    return ticketid;
  }

  public void setTicketid(int ticketid) {
    this.ticketid = ticketid;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int calculateTicketCost(int noOfTickets) {
    if (Ticket.availableTickets - noOfTickets >= 0) {
      Ticket.availableTickets -= noOfTickets;

      return noOfTickets * price;
    }

    return -1;
  }
}