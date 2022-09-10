package pro;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CalculatorService;

@RestController
@RequiredArgsConstructor
public class Calculator {
private final CalculatorService calculatorService;


  @GetMapping
    public String WelcomeToTheCalculator() {
        return "<b>Welcome to the calculator!<b>";
    }
    @GetMapping("calculator/add")

    public String add(@RequestParam(name =  "num1", required = false) Integer a,
                   @RequestParam(name = "num2", required = false) Integer b) {
      if (a == null || b == null) return " Не передано одно из полей";
        int add = calculatorService.add(a,b);
        return a + "+" + b + " = " + add;
    }
    @GetMapping("calculator/minus")
    public String minus(@RequestParam(name =  "num1", required = false) Integer a,
                      @RequestParam(name = "num2", required = false) Integer b) {
        if (a == null || b == null) return " Не передано одно из полей";
        int minus = calculatorService.minus(a, b);
        return a + "-" + b + " = " + minus;
    }
    @GetMapping("calculator/multiple")
    public String multiple(@RequestParam(name =  "num1", required = false) Integer a,
                        @RequestParam(name = "num2", required = false) Integer b) {
        if (a == null || b == null) return " Не передано одно из полей";
        int multiple = calculatorService.multiple(a, b);
        return a + "*" + b + " = " + multiple;
    }
    @GetMapping("calculator/divide")
    public String divide(@RequestParam(name =  "num1", required = false) Integer a,
                        @RequestParam(name = "num2", required = false) Integer b) {
        if (a == null || b == null) return " Не передано одно из полей";
        double divide;
        try {
            divide = calculatorService.divide(a, b);
        } catch ( Throwable e) {
            return e.getMessage();
    }
        return a + "/" + b + " = " + divide;
}


    }