package com.kodilla.calculator.event;

import org.springframework.context.ApplicationEvent;

public class CalculationEvent extends ApplicationEvent {
    private Double firstNumber;
    private Double secondNumber;
    private String nameOfOperation;

    public CalculationEvent(Object source, Double firstNumber, Double secondNumber, String nameOfOperation) {
        super(source);
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.nameOfOperation = nameOfOperation;
    }

    public Double getFirstNumber() {
        return firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public String getNameOfOperation() {
        return nameOfOperation;
    }
}
