package davideabbadessa.U2_W2_D4_Valid_Es.payloadRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BlogPostPayloadRequest {
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;
    private UUID autoreId;
}
