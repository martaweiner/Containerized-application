package weiner.marta.app.showfilms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import weiner.marta.app.showfilms.entity.Film;

import java.util.List;

@Repository
public interface FilmsRepository extends JpaRepository<Film, Long> {
    List<Film> findByFilmName(String filmName);
}
