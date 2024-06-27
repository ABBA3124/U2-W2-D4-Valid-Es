package davideabbadessa.U2_W2_D4_Valid_Es.repositories;

import davideabbadessa.U2_W2_D4_Valid_Es.entities.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, UUID> {
}
