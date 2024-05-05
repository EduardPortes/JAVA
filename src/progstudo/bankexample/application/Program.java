package progstudo.bankexample.application;

import progstudo.bankexample.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int codeAccount = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);
        
        if (response != 'y') {
            acc = new Account(codeAccount, holder);
        } else {
            System.out.print("Enter initial deposit value: ");
             double initialDeposit = sc.nextDouble();
            acc = new Account(codeAccount, holder, initialDeposit);
        }


        System.out.println();
        System.out.println("Account data:");
        System.out.println(acc);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        acc.deposit(sc.nextDouble());

        System.out.println("Updated account data:");
        System.out.println(acc);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        acc.withdraw(sc.nextDouble());

        System.out.println("Updated account data:");
        System.out.println(acc);





    }
}
