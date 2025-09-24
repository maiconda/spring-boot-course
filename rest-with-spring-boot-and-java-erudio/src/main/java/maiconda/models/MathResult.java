package maiconda.models;

import java.util.Date;

public record MathResult(Date timestamp, Double result, String operationType) {
}
