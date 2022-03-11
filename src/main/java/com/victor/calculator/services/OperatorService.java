package com.victor.calculator.services;

import com.victor.calculator.models.Operation;
import org.springframework.stereotype.Service;

@Service
public class OperatorService {
    public int Calculate(Operation operation){
        int operand1 = operation.getOperand1();
        int operand2 = operation.getOperand2();
        int result = 0;
        switch (operation.getSymbol()){
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
        }
        return result;
    }
}
