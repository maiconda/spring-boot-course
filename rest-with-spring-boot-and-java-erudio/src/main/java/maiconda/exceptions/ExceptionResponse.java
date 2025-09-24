package maiconda.exceptions;

import maiconda.models.Greeting;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {
}
