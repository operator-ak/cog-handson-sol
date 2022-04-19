import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.setPhoneBook(new LinkedList<Contact>());

    String format = "First Name: %s\n" +
        "\nLast Name: %s\n" +
        "\nPhone No.: %d\n" +
        "\nEmail: %s\n";

    String menu = "Menu\n" +
        "\n1.Add Contact\n" +

        "\n2.Display all contacts\n" +

        "\n3.Search contact by phone\n" +

        "\n4.Remove contact\n" +

        "\n5.Exit\n";

    while (true) {
      System.out.println(menu);

      System.out.print("Enter your choice: ");
      int choice = Integer.parseInt(in.nextLine());

      if (choice == 1) {
        System.out.println("\nAdd a Contact:");

        System.out.print("\nEnter the First Name: ");
        String firstName = in.nextLine();

        System.out.print("\nEnter the Last Name: ");
        String lastName = in.nextLine();

        System.out.print("\nEnter the Phone No.: ");
        long phoneNumber = Long.parseLong(in.nextLine());

        System.out.print("\nEnter the Email: ");
        String emailId = in.nextLine();

        Contact contactObj = new Contact(firstName, lastName, phoneNumber, emailId);
        phoneBook.addContact(contactObj);

        continue;
      }

      if (choice == 2) {
        System.out.println("\nThe contacts in the List are:");

        for (Contact contact : phoneBook.viewAllContacts()) {
          System.out.println(String.format(format, contact.getFirstName(), contact.getLastName(),
              contact.getPhoneNumber(), contact.getEmailId()));
        }

        continue;
      }

      if (choice == 3) {
        System.out.print("\nEnter the Phone number to search contact:");
        long phoneNumber = Long.parseLong(in.nextLine());

        Contact contact = phoneBook.viewContactGivenPhone(phoneNumber);

        if (contact == null)
          continue;

        System.out.println("\nThe contact is:");
        System.out.println(String.format(format, contact.getFirstName(), contact.getLastName(),
            contact.getPhoneNumber(), contact.getEmailId()));
        continue;
      }

      if (choice == 4) {
        System.out.print("\nEnter the Phone number to remove :");
        long phoneNumber = Long.parseLong(in.nextLine());

        System.out.print("\nDo you want to remove the contact (Y/N): ");
        String yesOrNo = in.nextLine();

        if (yesOrNo.equalsIgnoreCase("N"))
          continue;

        boolean isRemoved = phoneBook.removeContact(phoneNumber);

        if (isRemoved)
          System.out.println("\nThe contact is successfully deleted.");
      }

      if (choice == 5)
        break;
    }
  }
}