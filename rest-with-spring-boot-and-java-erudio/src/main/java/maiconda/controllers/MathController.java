package maiconda.controllers;

import maiconda.exceptions.UnsupportedMathOperationException;
import maiconda.math.SimpleMath;
import maiconda.models.MathResult;
import maiconda.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/math")
@RestController
public class MathController {

    @RequestMapping("/sum/{a}/{b}")
    public MathResult sum(
            @PathVariable("a") String a,
            @PathVariable("b") String b
    ) {
        Double result = SimpleMath.sum(NumberConverter.stringToDouble(a), NumberConverter.stringToDouble(b));
        return new MathResult(new Date(), result, "Sum");
    }

    @RequestMapping("/multiplication/{a}/{b}")
    public MathResult multiplication(
            @PathVariable("a") String a,
            @PathVariable("b") String b
    ) {
        Double result = SimpleMath.multiplication(NumberConverter.stringToDouble(a), NumberConverter.stringToDouble(b));
        return new MathResult(new Date(), result,"Multiplication");
    }

    @RequestMapping("/subtraction/{a}/{b}")
    public MathResult subtraction (
            @PathVariable("a") String a,
            @PathVariable("b") String b
    ) {
        Double result = SimpleMath.subtraction(NumberConverter.stringToDouble(a), NumberConverter.stringToDouble(b));
    return new MathResult(new Date(), result, "Subtraction");
    }

    @RequestMapping("/division/{a}/{b}")
    public MathResult division (
            @PathVariable("a") String a,
            @PathVariable("b") String b
    ) {
        Double result = SimpleMath.division(NumberConverter.stringToDouble(a), NumberConverter.stringToDouble(b));
        return new MathResult(new Date(), result,  "Division");
    }

    @RequestMapping("/average/{a}/{b}")
    public MathResult average (
            @PathVariable("a") String a,
            @PathVariable("b") String b
    ) {
        Double result = SimpleMath.average(NumberConverter.stringToDouble(a), NumberConverter.stringToDouble(b));
        return new MathResult(new Date(), result, "Average");
    }

    @RequestMapping("/squareRoot/{a}")
    public MathResult squareRoot (
            @PathVariable("a") String a
    ) {
        Double result = SimpleMath.sqrt(NumberConverter.stringToDouble(a));
        return new MathResult(new Date(), result, "Square Root");
    }
}
