package weiner.marta.app.showfilms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weiner.marta.app.showfilms.dto.FilmsDto;
import weiner.marta.app.showfilms.mapper.FilmsMapper;
import weiner.marta.app.showfilms.service.FilmsService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
public class FilmsController {
    private final FilmsMapper filmsMapper;
    private final FilmsService filmsService;

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/")
    public List<FilmsDto> getAll() {
        return filmsService.getAll().stream().map(filmsMapper::map).collect(Collectors.toList());
    }

}
