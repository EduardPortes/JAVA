package exercicioInterface.ex1.service;

public interface OnlinePaymentsService {

    Double paymentFee(Double amount);

    Double interest(Double amount, Integer months);
}
