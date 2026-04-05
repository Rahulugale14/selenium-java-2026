package day12Encapsulation;

public class AccountMain {

    public static void main (String args[]) {

        Account acc = new Account();

        acc.setAccountNumber(101010);
        acc.setAccountName("Rahul Ramrao Ugale");
        acc.setAmount(10500.575);

        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getAccountName());
        System.out.println(acc.getAmount());
    }


}
