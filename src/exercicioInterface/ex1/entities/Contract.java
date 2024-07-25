package exercicioInterface.ex1.entities;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Installment> installment = new ArrayList<>();


    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Installment> getInstallment() {
        return installment;
    }

}
