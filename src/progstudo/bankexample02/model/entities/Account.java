package progstudo.bankexample02.model.entities;

import progstudo. bankexample02.model.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance = 0.0;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if(amount > withdrawLimit){
            throw new DomainException("The withdraw can't be complete, The amount exceeds withdraw limit");
        }
        if (amount > balance ){
            throw new DomainException("The withdraw can't be complete, Not enough balance");
        }
        else{
            balance -= amount;
        }
    }




}
