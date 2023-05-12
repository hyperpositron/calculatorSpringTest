package pro.sky.calculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.services.CalculatorService;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = service.add(a, b);
        return a + "+" + b + "=" + result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = service.minus(a, b);
        return a + "-" + b + "=" + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = service.multiply(a, b);
        return a + "*" + b + "=" + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = service.divide(a, b);
        return a + "/" + b + "=" + result;
    }


}
