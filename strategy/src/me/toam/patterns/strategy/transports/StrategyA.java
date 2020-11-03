package me.toam.patterns.strategy.transports;

/**
 * @author: Binh Nguyen
 * <p>
 * Nov 03, 2020
 */

public class StrategyA implements Strategy {

    @Override
    public String getTransport() {
        return "BIKE";
    }
}
