package davideabbadessa.U2_W2_D4_Valid_Es.payloadRequest;

import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

public record BlogPostDTO (
        @NotEmpty(message = "Categoria non validà")
        String categoria,
        @NotEmpty(message = "Titolo non valido")
        String titolo,
        @NotEmpty(message = "Cover non valida")
        String cover,
        @NotEmpty(message = "Contenuto non valido")
        String contenuto,
        @NotEmpty(message = "Tempo di lettura non valido")
        int tempoDiLettura,
        @NotEmpty(message = "UUID non valido")
        UUID autoreId
) {
}
