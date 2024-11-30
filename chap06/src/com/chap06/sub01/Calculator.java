package com.chap06.sub01;
import java.util.*;
import java.math.BigDecimal;

public class Calculator {
    public double sum(List<BigDecimal> nums){
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal number : nums) {
            sum = sum.add(number);
        }
        return sum.doubleValue();
    }
}
