package com.rivera.propertymanagement.controller;

import com.rivera.propertymanagement.model.CalculatorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Omar.Rivera on 14/3/23.
 *
 * @author Omar.Rivera
 */
@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @GetMapping("/add")
    Double add(@RequestParam("a") Double a, @RequestParam("b") Double b){
        return a + b;
    }

    @GetMapping("/sub/{a}/{b}")
    Double substract(@PathVariable("a") Double a, @PathVariable("b") Double b){
        return a - b;
    }

    @PostMapping("/mul")
    ResponseEntity<Double> multiply(@RequestBody CalculatorDto calculatorDto){
        Double result =  calculatorDto.a() * calculatorDto.b() * calculatorDto.c();
        ResponseEntity<Double> responseEntity = new ResponseEntity<>(result, HttpStatus.CREATED);
        return responseEntity;
    }
}
