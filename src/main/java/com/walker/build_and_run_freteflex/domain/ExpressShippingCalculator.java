package com.walker.build_and_run_freteflex.domain;

public class ExpressShippingCalculator implements ShippingCalculator{
    @Override
    public Double calculator(Double distance, Double weight) {
        return weight * 1.5 + distance * 0.75;
    }
}
