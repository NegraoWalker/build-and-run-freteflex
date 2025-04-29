package com.walker.build_and_run_freteflex.service;

import com.walker.build_and_run_freteflex.domain.ExpressShippingCalculator;
import com.walker.build_and_run_freteflex.domain.StandardShippingCalculator;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private final StandardShippingCalculator standardShippingCalculator;
    private final ExpressShippingCalculator expressShippingCalculator;

    public ShippingService(StandardShippingCalculator standardShippingCalculator, ExpressShippingCalculator expressShippingCalculator) {
        this.standardShippingCalculator = standardShippingCalculator;
        this.expressShippingCalculator = expressShippingCalculator;
    }

    public Double calculate(String shippingType, Double distance, Double weight) {
        if (shippingType.equalsIgnoreCase("standard")) {
            return standardShippingCalculator.calculator(distance,weight);
        } else if (shippingType.equalsIgnoreCase("express")) {
            return expressShippingCalculator.calculator(distance, weight);
        }
        return null;
    }
}
