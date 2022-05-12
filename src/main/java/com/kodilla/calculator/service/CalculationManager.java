package com.kodilla.calculator.service;

import com.kodilla.calculator.event.CalculationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class CalculationManager implements ApplicationListener<CalculationEvent> {

    private final Logger logger = LoggerFactory.getLogger(CalculationManager.class);

    @Override
    public void onApplicationEvent(CalculationEvent event) {
        logger.info("Operation of name {}. First argument: {} and second argument: {}",
                event.getNameOfOperation(), event.getFirstNumber(), event.getSecondNumber());
    }

}
