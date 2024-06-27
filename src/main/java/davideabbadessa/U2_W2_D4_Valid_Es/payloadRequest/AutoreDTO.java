package davideabbadessa.U2_W2_D4_Valid_Es.payloadRequest;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.UUID;

public record AutoreDTO (
        @NotEmpty(message = "il nome non può essere vuoto")
        String nome,
        @NotEmpty(message = "il cognome non può essere vuoto")
        String cognome,
        @NotEmpty(message = "Email non validà")
        String email,
        LocalDate dataDiNascita
) {
}
