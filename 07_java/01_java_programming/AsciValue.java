import java.util.Scanner;

public class AsciValue {

    public static final int TOTAL_INPUTS = 4;

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter the digits:");
            int[] inputs = new int[TOTAL_INPUTS];

            for (int i=0;i<TOTAL_INPUTS;i++){
                inputs[i] = in.nextInt();
            }

            for (int i=0;i<TOTAL_INPUTS;i++){
                System.out.println(convertAsciiValue(inputs[i]));
            }
        }
    }

    public static String convertAsciiValue(int ascii){
        return String.format("%d-%c", ascii, (char)(ascii));
    }
}
