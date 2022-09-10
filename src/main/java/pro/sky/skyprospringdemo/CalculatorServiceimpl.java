package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;
import pro.sky.CalculatorService;

@Service
public class CalculatorServiceimpl implements CalculatorService {
    @Override
    public int add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiple(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public int divide(Integer a, Integer b) {
        return a / b;
    }
}
