package davideabbadessa.U2_W2_D4_Valid_Es.service;

import davideabbadessa.U2_W2_D4_Valid_Es.entities.Autore;
import davideabbadessa.U2_W2_D4_Valid_Es.repositories.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;

    public List<Autore> findAll() {
        return autoreRepository.findAll();
    }

    public Optional<Autore> findById(UUID id) {
        return autoreRepository.findById(id);
    }

    public Autore save(Autore autore) {
        return autoreRepository.save(autore);
    }

    public Autore saveAutore(Autore autore) {
        autore.setAvatar("https://lui-avatars.com/api?name=" + autore.getNome() + "+" + autore.getCognome());
        return autoreRepository.save(autore);
    }

    public void deleteById(UUID id) {
        autoreRepository.deleteById(id);
    }
}
