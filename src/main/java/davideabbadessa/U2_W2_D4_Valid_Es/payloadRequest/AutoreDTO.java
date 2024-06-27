package davideabbadessa.U2_W2_D4_Valid_Es.payloadRequest;

import java.time.LocalDate;
import java.util.UUID;

public record AutoreDTO (String nome, String cognome, String email, LocalDate dataDiNascita) {
}
