package progstudo.bankexample02.application;

import progstudo.bankexample02.model.entities.Account;
import progstudo.bankexample02.model.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, withdrawLimit);

            account.deposit(balance);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));


        }
        catch (DomainException e){
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}
