package me.toam.patterns.strategy.transports;

/**
 * @author: Binh Nguyen
 * <p>
 * Nov 03, 2020
 */

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy1 = context.execute(new Condition(3));
        System.out.println(strategy1.getTransport());

        Strategy strategy2 = context.execute(new Condition(7));
        System.out.println(strategy2.getTransport());

        Strategy strategy3 = context.execute(new Condition(11));
        System.out.println(strategy3.getTransport());
    }
}
