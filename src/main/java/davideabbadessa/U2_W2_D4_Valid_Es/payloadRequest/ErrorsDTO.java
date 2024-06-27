package davideabbadessa.U2_W2_D4_Valid_Es.payloadRequest;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorsDTO {
    private String message;
    private LocalDateTime timestamp;

    public ErrorsDTO(String message, LocalDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
