import java.util.Scanner;

public class Authority {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Inmate's name:");
            String inmateName = in.nextLine();

            System.out.println("Inmate's father's name:");
            String inmateFatherName = in.nextLine();


            if(isNotValid(inmateName) || isNotValid(inmateFatherName)){
                System.out.println("Invalid name");
                return;
            }

            String output = inmateName.concat(" ").concat(inmateFatherName);
            System.out.println(output.toUpperCase());
        }
    }

    public static boolean isNotValid(String name) {
        for (int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if (Character.isDigit(ch)) return true;

            if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) return true;
        }
        return false;
    }
}
