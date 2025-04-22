package com.walker.build_and_run_freteflex.controller;

import com.walker.build_and_run_freteflex.controller.dto.ShippingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ShippingController {

    @GetMapping(value = "/shipping/calculate")
    public ResponseEntity<ShippingResponse> calculate(@RequestParam("type") String shippingType,
                                                      @RequestParam("distance") Double distance,
                                                      @RequestParam("weight") Double weight) {

        //TODO - CHAMAR SERVICE QUE IMPLEMENTA O CÁLCULO DO FRETE
        return ResponseEntity.ok(new ShippingResponse(0.0));
    }
}
