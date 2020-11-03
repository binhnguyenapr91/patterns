package me.toam.patterns.factorymethod.banks;

/**
 * @author: Binh Nguyen
 * <p>
 * Nov 02, 2020
 */

public class BankFactory {
    public static final Bank getBank(BankType type) {
       switch (type) {
           case TECHCOMBANK:
               return new Techcombank();
           case VIETCOMBANK:
               return new Vietcombank();
           default:
               throw new IllegalArgumentException("Not supported bank type");
       }
    }
}
