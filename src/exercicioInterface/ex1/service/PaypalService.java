package exercicioInterface.ex1.service;

public class PaypalService implements OnlinePaymentsService{


    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * ( 0.01 * months);
    }
}
