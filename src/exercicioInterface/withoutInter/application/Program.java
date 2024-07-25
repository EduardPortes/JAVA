package exercicioInterface.withoutInter.application;

import exercicioInterface.withoutInter.entities.CarRental;
import exercicioInterface.withoutInter.entities.model.Vehicle;
import exercicioInterface.withoutInter.entities.services.BrazilTaxService;
import exercicioInterface.withoutInter.entities.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car Model: ");
        String carmodel = sc.nextLine();

        System.out.print("Pickup (dd/MM/yyyy hh:mm)");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Return (dd/MM/yyyy hh:mm)");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carmodel));

        System.out.print("Enter a price per hour: ");
        double pricePerHour =  sc.nextDouble();

        System.out.print("Enter a price per day: ");
        double pricePerDay =  sc.nextDouble();
        sc.nextLine();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("Invoice: ");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " +  cr.getInvoice().getTax());
        System.out.println("Total Payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));



        sc.close();
    }
}
