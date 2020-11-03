package me.toam.patterns.strategy.transports;

/**
 * @author: Binh Nguyen
 * <p>
 * Nov 03, 2020
 */

public class Context {

    public Strategy execute(Condition condition) {
        if (condition.budget > 10) {
            return new StrategyC();
        }
        if (condition.budget < 5) {
            return new StrategyA();
        }
        else return new StrategyB();
    }
}
