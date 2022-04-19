import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountDetails {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        try {
            AccountDetails accountDetails = new AccountDetails();

            Account account = accountDetails.getAccountDetails();
            account.withdraw(accountDetails.getWithdrawAmount());
        } catch (IOException ignored) {
        }

    }

    public Account getAccountDetails() throws IOException {
        System.out.println("Enter account id:");
        int accountId = Integer.parseInt(br.readLine());

        System.out.println("Enter account type:");
        String accountType = br.readLine();

        while (true) {
            System.out.println("Enter balance:");
            int balance = Integer.parseInt(br.readLine());

            if (balance <= 0) {
                System.out.println("Balance should be positive");
                continue;
            }

            Account account = new Account();
            account.setAccountId(accountId);
            account.setAccountType(accountType);
            account.setBalance(balance);

            return account;
        }
    }

    public int getWithdrawAmount() throws IOException {
        while (true){
            System.out.println("Enter amount to be withdrawn:");
            int amount = Integer.parseInt(br.readLine());

            if (amount <= 0 ){
                System.out.println("Amount should be positive");
                continue;
            }

            return amount;
        }

    }
}
