package progstudo.ztestes.application;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Instant d01 = Instant.now();

        LocalDateTime d02 = LocalDateTime.ofInstant(d01, ZoneId.of("America/Sao_Paulo"));


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime pastWeekLocalDate = d02.minusDays(7);
        LocalDateTime nextWeekLocalDate = d02.plusDays(7);

        System.out.println("pastWeekLocalDate = " + fmt1.format(pastWeekLocalDate));
        System.out.println("nextWeekLocalDate = " + fmt1.format(nextWeekLocalDate));




        sc.close();
    }
}
