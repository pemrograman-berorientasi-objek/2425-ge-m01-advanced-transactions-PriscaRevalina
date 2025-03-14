package fintech.driver;
/**
 * @author 12S23025-Alif Aflah Suedi
 * @author 12S23039-Prisca R. Manurung
 */

 import fintech.model.Account;
 import fintech.model.Transaction;
 import java.util.HashMap;
 import java.util.Map;
 import java.util.Scanner;
 import java.lang.Double;
 import java.lang.Math;
 
   
 public class Driver1 {
    private static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read account creation input
        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

        // Create account and print details
        createAccount(command, owner, accountName);

        // Read transaction input
        command = scanner.nextLine();
        accountName = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String postedAt = scanner.nextLine();
        String note = scanner.nextLine();
        
    

        // Create transaction and print details
        createTransaction(command, accountName, amount, postedAt, note);

    
    }
    private static void createAccount(String command, String owner, String accountName) {
        if ("create-account".equals("#")) {
            Account account = new Account(command, owner, accountName);
            accounts.put(accountName, account);
            System.out.println(account.toString());
         
        }

    }

    private static void createTransaction(String command, String accountName, double amount, String postedAt, String note) {
        if ("create-transaction".equals( "#")) {
            Account account = accounts.get(accountName);
            if (account != null) {
                Transaction transaction = new Transaction(accountName, amount, postedAt, note);
                account.addTransaction(transaction);
                System.out.println(transaction.toString() + "|" + account.getBalance());     

            } 
           

        } 
    }
}
