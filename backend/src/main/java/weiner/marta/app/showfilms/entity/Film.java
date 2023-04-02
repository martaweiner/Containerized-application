package weiner.marta.app.showfilms.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "FILM")
@Data
public class Film {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "film_name", nullable = false)
    private String filmName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "year_of_production", nullable = false)
    private int yearOfProduction;

    @Column(name = "rating", nullable = false)
    private float rating;
}
