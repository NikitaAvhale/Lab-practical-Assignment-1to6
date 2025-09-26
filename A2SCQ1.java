package Assingnment2;


interface CreditCardInterface {
 void useCard();
 void payCredit();
 void increaseLimit();
 void viewCreditAmount();
}


class SilverCardCustomer implements CreditCardInterface {
 String name;
 long cardnumber;
 double creditAmount;
 double creditLimit;

 SilverCardCustomer(String name, long cardnumber) {
     this.name = name;
     this.cardnumber = cardnumber;
     this.creditLimit = 1000;
     this.creditAmount = 0;
 }

 @Override
 public void useCard() {
     if (creditAmount < creditLimit) {
         System.out.println("Transaction successful for SilverCardCustomer.");
         creditAmount += 500; 
         if (creditAmount > creditLimit) {
             System.out.println("Credit limit exceeded for SilverCardCustomer.");
         }
     } else {
         System.out.println("Credit limit reached. Cannot use card for SilverCardCustomer.");
     }
 }

 @Override
 public void payCredit() {
     creditAmount -= 500; 
     if (creditAmount < 0) creditAmount = 0;
     System.out.println("Payment successful for SilverCardCustomer.");
 }

 @Override
 public void increaseLimit() {
     creditLimit += 500;
     System.out.println("Credit limit increased for SilverCardCustomer.");
 }

 @Override
 public void viewCreditAmount() {
     System.out.println("Credit Amount for SilverCardCustomer: " + creditAmount);
 }
}


class GoldCardCustomer extends SilverCardCustomer {
 GoldCardCustomer(String name, long cardnumber) {
     super(name, cardnumber);
     creditLimit = 50000;
 }

 @Override
 public void increaseLimit() {
     if (creditLimit < 5000 * 3) {
         creditLimit += 5000; 
         System.out.println("Credit limit increased for GoldCardCustomer.");
     } else {
         System.out.println("Cannot increase limit more than 3 times for GoldCardCustomer.");
     }
 }
}

public class A2SCQ1 {
 public static void main(String[] args) {
     SilverCardCustomer silverCustomer = new SilverCardCustomer("John", 1234567890123456L);
     silverCustomer.viewCreditAmount();
     silverCustomer.useCard();
     silverCustomer.viewCreditAmount();

     System.out.println();

     GoldCardCustomer goldCustomer = new GoldCardCustomer("Doe", 9876543210987654L);
     goldCustomer.viewCreditAmount();
     goldCustomer.useCard();
     goldCustomer.increaseLimit();
     goldCustomer.viewCreditAmount();
 }
}