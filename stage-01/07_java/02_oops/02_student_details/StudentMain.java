import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter Student's Id:");
            int studentId = in.nextInt();

            in.nextLine();

            System.out.println("Enter Student's Name:");
            String studentName = in.nextLine();

            System.out.println("Enter Student's address:");
            String studentAddress = in.nextLine();

            String choice;

            while(true){
                System.out.println("Whether the student is from NIT(Yes/No):");
                choice = in.nextLine();

                if (choice.equalsIgnoreCase("yes")) {
                    Student student = new Student(studentId, studentName, studentAddress);
                    System.out.println(student);
                    break;
                }

                if (choice.equalsIgnoreCase("no")) {
                    System.out.println("Enter the college name:");
                    String collegeName = in.nextLine();

                    Student student = new Student(studentId, studentName, collegeName, studentAddress);
                    System.out.println(student);
                    break;
                }

                System.out.println("Wrong Input");
            }
        }
    }
}

