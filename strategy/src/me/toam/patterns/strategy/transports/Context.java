package me.toam.patterns.strategy.transports;

/**
 * @author: Binh Nguyen
 * <p>
 * Nov 03, 2020
 */

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public String execute() {
        return strategy.getTransport();
    }
}
