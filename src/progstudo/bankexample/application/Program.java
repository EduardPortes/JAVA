package progstudo.bankexample.application;

import progstudo.bankexample.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int codeAccount = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);

        double balance;
        if (response != 'y') {
            balance = 0;
        } else {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
        }

        Account acc = new Account(codeAccount, holder, balance);

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
