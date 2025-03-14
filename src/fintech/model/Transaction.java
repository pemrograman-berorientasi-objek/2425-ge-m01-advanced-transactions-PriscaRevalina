package fintech.model;

/**
 * @author 12S23025-Alif Aflah Suedi
 * @author 12S23039-Prisca R. Manurung
 */


 /**
  * Represents a financial transaction.
  * Each transaction has a unique ID, account name, amount, posted date, and an optional note.
  * The ID is generated sequentially.
  * The amount can be positive (increase) or negative (decrease).
  */
 public class Transaction {
     private static int idCounter = 0;
     private final int id;
     private final String accountName;
     private final double amount;
     private final String postedAt;
     private final String note;
 
     /**
      * Constructs a new Transaction.
      *
      * @param accountName the name of the account associated with the transaction
      * @param amount the amount of the transaction
      * @param postedAt the date and time when the transaction was posted
      * @param note an optional note for the transaction
      */
     public Transaction(String accountName, double amount, String postedAt, String note) {
         this.id = ++idCounter;
         this.accountName = accountName;
         this.amount = amount;
         this.postedAt = postedAt;
         this.note = note;
     }
 
     /**
      * Returns the unique ID of the transaction.
      *
      * @return the ID of the transaction
      */
     public int getId() {
         return id;
     }
 
     /**
      * Returns the name of the account associated with the transaction.
      *
      * @return the account name
      */
     public String getAccountName() {
         return accountName;
     }
 
     /**
      * Returns the amount of the transaction.
      *
      * @return the amount of the transaction
      */
     public double getAmount() {
         return amount;
     }
 
     /**
      * Returns the date and time when the transaction was posted.
      *
      * @return the posted date and time
      */
     public String getPostedAt() {
         return postedAt;
     }
 
     /**
      * Returns the note for the transaction.
      *
      * @return the note
      */
     public String getNote() {
         return note;
     }
 
     /**
      * Returns a string representation of the transaction.
      *
      * @return a string representation of the transaction
      */
     @Override
     public String toString() {
         return id + "|" + accountName + "|" + amount + "|" + postedAt + "|" + note;
     }
 }