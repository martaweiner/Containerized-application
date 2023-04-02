package weiner.marta.app.showfilms.service;

import org.springframework.stereotype.Service;
import weiner.marta.app.showfilms.entity.Film;
import weiner.marta.app.showfilms.repository.FilmsRepository;

import java.util.List;

@Service
public class FilmsService {
    FilmsRepository repository;

    public FilmsService(FilmsRepository repository) {
        this.repository = repository;
    }

    public List<Film> getAll() {
        return repository.findAll();
    }
}
