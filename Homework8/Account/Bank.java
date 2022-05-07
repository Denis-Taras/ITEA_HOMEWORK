package com.company.denis.Homework8.Account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Bank {


    public static void main(String[] args) {

        Account account = new Account();

        try{
            account.newTransaction(Account.typeTransaction.RECEIPT, 2000);
        } catch (UnsupportedOperationException |
                IllegalArgumentException |
                LowBalanceException e){
            e.printStackTrace();
        }

        try{
            account.newTransaction(Account.typeTransaction.PAYMENT, -100);
        } catch (UnsupportedOperationException |
                IllegalArgumentException |
                LowBalanceException e){
            e.printStackTrace();
        }

        try{
            account.newTransaction(Account.typeTransaction.WITHDRAWAL, 1500);
        } catch (UnsupportedOperationException |
                IllegalArgumentException |
                LowBalanceException e){
            e.printStackTrace();
        }

        try{
            account.newTransaction(Account.typeTransaction.WITHDRAWAL, 1500);
        } catch (UnsupportedOperationException |
                IllegalArgumentException |
                LowBalanceException e){
            e.printStackTrace();
        }

        System.out.println(account.print());

    }

}


class Account {

    enum typeTransaction {
        WITHDRAWAL, PAYMENT, RECEIPT
    }

    private int accountBalance = 0;
    private int nextId = 0;

    private List<Transaction> history = new ArrayList<>();

    abstract class Transaction {
        int id = 0;
        int amount = 0;
        int balance = 0;
        Date date;
        typeTransaction type;

        public Transaction() {
            this.id = nextId++;
            this.date = new Date();
        }

        @Override
        public String toString() {
            String string;
            string =  '\n' + "Transaction ID: "  + this.id + '\n';
            string += "Type: " + this.type + '\n';
            string += "Date: " + this.date + '\n';
            string += "Amount: " + this.amount + '\n';
            string += "Balance after operation: " + this.balance + '\n';
            return string;
        }

    }

    class Withdrawal extends Transaction {

        public Withdrawal(int amount) {
            this.balance = accountBalance;
            this.balance -= amount;
            this.amount = amount;
            this.type = typeTransaction.WITHDRAWAL;
        }
    }

    class Payment extends Transaction {

        public Payment(int amount) {
            this.balance = accountBalance;
            this.balance -= amount;
            this.amount = amount;
            this.type = typeTransaction.PAYMENT;
        }
    }

    class Receipt extends Transaction {

        public Receipt(int amount) {
            this.balance = accountBalance;
            this.balance += amount;
            this.amount = amount;
            this.type = typeTransaction.RECEIPT;
        }
    }


    public void newTransaction(typeTransaction type, int amount)
            throws UnsupportedOperationException,
            IllegalArgumentException,
            LowBalanceException {

        validation(type, amount);

        Transaction newTransaction;

        switch (type) {
            case WITHDRAWAL:
                newTransaction = new Withdrawal(amount);
                break;

            case PAYMENT:
                newTransaction = new Payment(amount);
                break;

            case RECEIPT:
                newTransaction = new Receipt(amount);
                break;

            default:
                throw new UnsupportedOperationException("Not supported");

        }

        history.add(newTransaction);

        setAccountBalance(newTransaction.balance);
    }



    public int getAccountBalance() {
        return accountBalance;
    }

    public String print() {
        String string = "";

        for( Transaction t : history)
        {
            string += t.toString();
        }


        return string;
    }

    private void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    private void validation (typeTransaction type, int amount)
            throws IllegalArgumentException,
            LowBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Negativ value of amount");
        }

        switch (type) {
            case WITHDRAWAL:
            case PAYMENT:
                if (getAccountBalance() < amount) {
                    throw new LowBalanceException("Low Balance");
                }
                break;

            case RECEIPT:
                break;

            default:
                break;
        }
    }

}


class LowBalanceException extends Exception {
    LowBalanceException(String s){
        super(s);
    }
}
