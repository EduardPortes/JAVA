package progstudo.ztestes.entities;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduts extends Product{

    private LocalDate manufactureDate;

    public UsedProduts(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() throws ParseException {
        return name
                + " (used)"
                + " $ "
                + String.format("%.2f", price)
                + String.format(" (Manufacture date: %s)", manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}
