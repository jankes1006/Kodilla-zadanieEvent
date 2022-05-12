package com.kodilla.calculator.domain;


public class CalculationDataDto {
    private Double firstNumber;
    private Double secondNumber;

    public CalculationDataDto() {
    }

    public Double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
