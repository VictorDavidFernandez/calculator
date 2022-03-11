package com.victor.calculator.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Operation {
    private int operand1;
    private int operand2;
    private String symbol;
}
