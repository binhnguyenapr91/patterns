package me.toam.patterns.factorymethod.banks;

/**
 * @author: Binh Nguyen
 * <p>
 * Nov 02, 2020
 */

public class App {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBank());
    }
}
