package com.conculator.service.impl;

import com.conculator.service.ICalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateService implements ICalculateService {
    @Override
    public String calculate(double number1, double number2, String operator) {

        String result = "";
        switch (operator) {
            case "addition":
                result = "" + (number1 + number2);
                break;
            case "subtraction":
                result = String.valueOf(number1 - number2);
                break;
            case "multiplication":
                result = String.valueOf(number1 * number2);
                break;
            case "division":
                if (number2 == 0) {
                    result = "can't division for 0";
                } else {
                    result = "" + number1 / number2;
                }
        }
        return result;
    }
}
