package com.kodilla.calculator.controller;

import com.kodilla.calculator.domain.CalculationDataDto;
import com.kodilla.calculator.event.CalculationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;
    private static final String ADD = "Add";
    private static final String SUB = "Substraction";
    private static final String MULTIPLE = "Multiple";
    private static final String DIVISION = "Division";

    @PostMapping("/add")
    public Double add(@RequestBody CalculationDataDto calculationDataDto) {
        publisher.publishEvent(new CalculationEvent(this, calculationDataDto.getFirstNumber(), calculationDataDto.getSecondNumber(), ADD));
        return calculationDataDto.getFirstNumber() + calculationDataDto.getSecondNumber();
    }

    @PostMapping("/substraction")
    public Double sub(@RequestBody CalculationDataDto calculationDataDto) {
        publisher.publishEvent(new CalculationEvent(this, calculationDataDto.getFirstNumber(), calculationDataDto.getSecondNumber(), SUB));
        return calculationDataDto.getFirstNumber() - calculationDataDto.getSecondNumber();
    }

    @PostMapping("/multiple")
    public Double multiple(@RequestBody CalculationDataDto calculationDataDto) {
        publisher.publishEvent(new CalculationEvent(this, calculationDataDto.getFirstNumber(), calculationDataDto.getSecondNumber(), MULTIPLE));
        return calculationDataDto.getFirstNumber() * calculationDataDto.getSecondNumber();
    }

    @PostMapping("/division")
    public Double division(@RequestBody CalculationDataDto calculationDataDto) {
        publisher.publishEvent(new CalculationEvent(this, calculationDataDto.getFirstNumber(), calculationDataDto.getSecondNumber(), DIVISION));
        return calculationDataDto.getFirstNumber() / calculationDataDto.getSecondNumber();
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
