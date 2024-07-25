package exercicioInterface.ex1.service;

import exercicioInterface.ex1.entities.Contract;
import exercicioInterface.ex1.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentsService onlinePaymentsService;

    public ContractService(OnlinePaymentsService onlinePaymentsService) {
        this.onlinePaymentsService = onlinePaymentsService;
    }

    public void processContract(Contract contract, Integer months){

        double basicQuota = contract.getTotalValue() / months;

        for (int i=1; i<=months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentsService.interest(basicQuota, i);
            double fee = onlinePaymentsService.paymentFee(basicQuota + interest);

            double quota = basicQuota + interest + fee;

            contract.getInstallment().add(new Installment(dueDate, quota));

        }

    }
}
