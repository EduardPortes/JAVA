package progstudo.ztestes.entities;

public class ImportedProducts extends Product{

    private Double customsFee;

    public ImportedProducts(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return  price + customsFee;
    }

    @Override
    public String priceTag(){
        return name
                + " $ "
                + String.format("%.2f", totalPrice())
                + String.format(" (Customs fee: $ %.2f)", customsFee);
    }

}
