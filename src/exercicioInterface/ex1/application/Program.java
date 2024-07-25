package exercicioInterface.ex1.application;

import exercicioInterface.ex1.entities.Contract;
import exercicioInterface.ex1.entities.Installment;
import exercicioInterface.ex1.service.ContractService;
import exercicioInterface.ex1.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        Integer installments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, installments);

        System.out.println("Parcelas: ");

        for(Installment installment : obj.getInstallment()){
            System.out.println(installment);
        }

        sc.close();
    }
}
