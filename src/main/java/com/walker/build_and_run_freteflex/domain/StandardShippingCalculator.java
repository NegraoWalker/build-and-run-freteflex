package com.walker.build_and_run_freteflex.domain;

import org.springframework.stereotype.Component;

@Component
public class StandardShippingCalculator implements ShippingCalculator{
    @Override
    public Double calculator(Double distance, Double weight) {
        return weight * 1.0 + distance * 0.5;
    }
}
