package davideabbadessa.U2_W2_D4_Valid_Es.payloadRequest;

import java.util.UUID;

public record BlogPostDTO (String categoria, String titolo, String cover, String contenuto, int tempoDiLettura, UUID autoreId) {
}
