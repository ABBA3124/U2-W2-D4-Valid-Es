package davideabbadessa.U2_W2_D4_Valid_Es.exceptions;

import lombok.Data;

@Data
public class ErrorDetails {
    private String message;
    private String details;

    public ErrorDetails(String message, String details) {
        this.message = message;
        this.details = details;
    }


}
