package br.com.ead.authuser.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class ErrorResponse {
// Classe substituída pela classe ErrorRecordResponse

    private int errorCode;
    private String errorMessage;
    private Map<String, String> errorDetails = new HashMap<>();

    public ErrorResponse(int errorCode, String errorMessage, Map<String, String> errorDetails) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
    }
}
