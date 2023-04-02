CREATE TABLE FILM (
    id BIGINT NOT NULL AUTO_INCREMENT,
    film_name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    year_of_production INT NOT NULL,
    rating FLOAT NOT NULL,
    PRIMARY KEY (id)
);