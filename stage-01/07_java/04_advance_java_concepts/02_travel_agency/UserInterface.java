import java.util.Scanner;

public class UserInterface {

  public static void main(String args[]) {
    double commissionAmount = 0.0;

    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Enter the no of passengers");
      int noOfPassengers = Integer.parseInt(in.nextLine());

      Ticket[] tickets = new Ticket[noOfPassengers];

      for (int i = 0; i < noOfPassengers; i++) {
        System.out.println(String.format("Details of Passenger %d:", i + 1));

        System.out.println("Enter the pnr no:");
        long pnrNo = Long.parseLong(in.nextLine());

        System.out.println("Enter passenger name:");
        String passengerName = in.nextLine();

        System.out.println("Enter seat no:");
        int seatNo = Integer.parseInt(in.nextLine());

        System.out.println("Enter class type:");
        String classType = in.nextLine();

        System.out.println("Enter ticket fare:");
        double ticketFare = Double.parseDouble(in.nextLine());

        Ticket ticket = new Ticket(pnrNo, passengerName, seatNo, classType, ticketFare);
        tickets[i] = ticket;

        CommissionInfo commissionInfo = generateCommissionObtained();

        commissionAmount += commissionInfo.calculateCommissionAmount(ticket);
      }

      System.out.println("Commission Obtained");
      System.out.printf("Commission obtained per each person: Rs.%.2f", commissionAmount);
    }
  }

  public static CommissionInfo generateCommissionObtained() {
    return ticketObj -> {
      String classType = ticketObj.getClassType();

      if (classType.equalsIgnoreCase("1A") || classType.equalsIgnoreCase("2A")
          || classType.equalsIgnoreCase("3A")) {
        return 100.0;
      }

      return 60.0;
    };
  }

}