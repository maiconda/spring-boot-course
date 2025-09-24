package maiconda.request.converters;

import maiconda.exceptions.UnsupportedMathOperationException;

public class NumberConverter {
    public static Double stringToDouble(String value) throws IllegalArgumentException {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new UnsupportedMathOperationException("Not a number");
        }
    }
}
