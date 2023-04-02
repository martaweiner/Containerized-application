package weiner.marta.app.showfilms.mapper;

import org.springframework.stereotype.Component;
import weiner.marta.app.showfilms.dto.FilmsDto;
import weiner.marta.app.showfilms.entity.Film;

@Component
public class FilmsMapper {
    public Film map(FilmsDto dto){
        Film entityFilm = new Film();
        entityFilm.setFilmName(dto.getFilmName());
        entityFilm.setDescription(dto.getDescription());
        entityFilm.setYearOfProduction(dto.getYearOfProduction());
        entityFilm.setRating(dto.getRating());
        return entityFilm;
    }

    public FilmsDto map(Film entityFilm){
        FilmsDto dto = new FilmsDto();
        dto.setFilmName(entityFilm.getFilmName());
        dto.setDescription(entityFilm.getDescription());
        dto.setYearOfProduction(entityFilm.getYearOfProduction());
        dto.setRating(entityFilm.getRating());
        return dto;
    }
}
