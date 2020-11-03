package me.toam.patterns.strategy.transports;

/**
 * @author: Binh Nguyen
 * <p>
 * Nov 03, 2020
 */

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy( new StrategyA());
        System.out.println(context.execute());

        context.setStrategy( new StrategyB());
        System.out.println(context.execute());

        context.setStrategy( new StrategyC());
        System.out.println(context.execute());
    }
}
