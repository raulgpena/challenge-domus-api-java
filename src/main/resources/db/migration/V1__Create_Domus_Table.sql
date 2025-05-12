-- SQL script to create the 'writers' table in H2
CREATE TABLE writers (
                         id_writer int AUTO_INCREMENT PRIMARY KEY,   -- Primary key with auto-increment
                         name_writer VARCHAR(50) NOT NULL,           -- Writer's name, max length 50, not null
                         last_name_writer VARCHAR(50) NOT NULL       -- Writer's last name, max length 50, not null
);

-- SQL script to create the 'genres' table in H2
CREATE TABLE genres (
                        id_genre int AUTO_INCREMENT PRIMARY KEY,   -- Primary key with auto-increment
                        name_genre VARCHAR(50) NOT NULL,           -- Genre name, max length 50, not null
                        description_genre VARCHAR(255)             -- Genre description, max length 255, nullable
);

-- SQL script to create the 'actors' table in H2
CREATE TABLE actors (
                        id_actor int AUTO_INCREMENT PRIMARY KEY,   -- Primary key with auto-increment
                        name_actor VARCHAR(50) NOT NULL,           -- Actor's name, max length 50, not null
                        last_name_actor VARCHAR(50) NOT NULL       -- Actor's last name, max length 50, not null
);

-- SQL script to create the 'directors' table in H2
CREATE TABLE directors (
                           id_director int AUTO_INCREMENT PRIMARY KEY,   -- Primary key with auto-increment
                           name_director VARCHAR(50) NOT NULL,           -- Director's name, max length 50, not null
                           last_name_director VARCHAR(50) NOT NULL       -- Director's last name, max length 50, not null
);

-- SQL script to create the 'movies' table in H2
CREATE TABLE movies (
                        id_movie int AUTO_INCREMENT PRIMARY KEY,
                        title_movie VARCHAR(100) NOT NULL,
                        year_movie INT NOT NULL,
                        rated_movie VARCHAR(50) NOT NULL,
                        release_movie DATE NOT NULL,
                        runtime_movie INT NOT NULL,
                        id_genre BIGINT NOT NULL,
                        id_director BIGINT NOT NULL,
                        id_writer BIGINT NOT NULL,
                        CONSTRAINT fk_genre FOREIGN KEY (id_genre) REFERENCES genres(id_genre),
                        CONSTRAINT fk_director FOREIGN KEY (id_director) REFERENCES directors(id_director),
                        CONSTRAINT fk_writer FOREIGN KEY (id_writer) REFERENCES writers(id_writer)
);

-- SQL script to create the 'movie_actors' table in H2
CREATE TABLE movie_actors (
                              id_movie BIGINT NOT NULL,
                              id_actor BIGINT NOT NULL,
                              PRIMARY KEY (id_movie, id_actor),
                              CONSTRAINT fk_movie FOREIGN KEY (id_movie) REFERENCES movies(id_movie) ON DELETE CASCADE,
                              CONSTRAINT fk_actor FOREIGN KEY (id_actor) REFERENCES actors(id_actor) ON DELETE CASCADE
);

-- Populate the 'writers' table
INSERT INTO writers (name_writer, last_name_writer) VALUES
                                                        ('John', 'Doe'),
                                                        ('Jane', 'Smith'),
                                                        ('Robert', 'Brown'),
                                                        ('Emily', 'Clark'),
                                                        ('Michael', 'Johnson'),
                                                        ('Sarah', 'Davis'),
                                                        ('David', 'Wilson'),
                                                        ('Laura', 'Martinez'),
                                                        ('James', 'Anderson'),
                                                        ('Sophia', 'Taylor');

-- Populate the 'genres' table
INSERT INTO genres (name_genre, description_genre) VALUES
                                                       ('Action', 'High-energy movies with lots of stunts and explosions'),
                                                       ('Comedy', 'Movies designed to make the audience laugh'),
                                                       ('Drama', 'Serious movies with emotional themes'),
                                                       ('Horror', 'Movies designed to scare the audience'),
                                                       ('Sci-Fi', 'Movies with futuristic or science-based themes'),
                                                       ('Romance', 'Movies focused on love and relationships'),
                                                       ('Thriller', 'Movies with suspense and excitement'),
                                                       ('Fantasy', 'Movies with magical or supernatural elements'),
                                                       ('Adventure', 'Movies with exciting journeys or quests'),
                                                       ('Animation', 'Movies created using animation techniques');

-- Populate the 'actors' table
INSERT INTO actors (name_actor, last_name_actor) VALUES
                                                     ('Tom', 'Hanks'),
                                                     ('Scarlett', 'Johansson'),
                                                     ('Leonardo', 'DiCaprio'),
                                                     ('Meryl', 'Streep'),
                                                     ('Brad', 'Pitt'),
                                                     ('Angelina', 'Jolie'),
                                                     ('Chris', 'Hemsworth'),
                                                     ('Natalie', 'Portman'),
                                                     ('Robert', 'Downey Jr.'),
                                                     ('Emma', 'Stone'),
                                                     ('Ryan', 'Gosling'),
                                                     ('Jennifer', 'Lawrence'),
                                                     ('Denzel', 'Washington'),
                                                     ('Anne', 'Hathaway'),
                                                     ('Will', 'Smith');

-- Populate the 'directors' table
INSERT INTO directors (name_director, last_name_director) VALUES
                                                              ('Steven', 'Spielberg'),
                                                              ('Christopher', 'Nolan'),
                                                              ('Quentin', 'Tarantino'),
                                                              ('James', 'Cameron'),
                                                              ('Martin', 'Scorsese'),
                                                              ('Ridley', 'Scott'),
                                                              ('Peter', 'Jackson'),
                                                              ('Greta', 'Gerwig'),
                                                              ('Denis', 'Villeneuve'),
                                                              ('Guillermo', 'del Toro');

-- Populate the 'movies' table
INSERT INTO movies (title_movie, year_movie, rated_movie, release_movie, runtime_movie, id_genre, id_director, id_writer) VALUES
                                                                                                                              ('Inception', 2010, 'PG-13', '2010-07-16', 148, 5, 2, 1), -- Sci-Fi, Christopher Nolan, John Doe
                                                                                                                              ('Pulp Fiction', 1994, 'R', '1994-10-14', 154, 3, 3, 2),    -- Drama, Quentin Tarantino, Jane Smith
                                                                                                                              ('Kill Bill Vol.1', 2003, 'R', '2003-10-01', 154, 3, 3, 2), -- Action, Quentin Tarantino, Jane Smith
                                                                                                                              ('Kill Bill Vol.2', 2004, 'R', '2004-08-01', 154, 3, 3, 2), -- Action, Quentin Tarantino, Jane Smith
                                                                                                                              ('Forrest Gump', 1994, 'PG-13', '1994-07-06', 142, 3, 1, 3), -- Drama, Steven Spielberg, Robert Brown
                                                                                                                              ('Titanic', 1997, 'PG-13', '1997-12-19', 195, 6, 5, 4), -- Romance, James Cameron, Emily Clark
                                                                                                                              ('The Dark Knight', 2008, 'PG-13', '2008-07-18', 152, 1, 2, 5), -- Action, Christopher Nolan, Michael Johnson
                                                                                                                              ('The Avengers', 2012, 'PG-13', '2012-05-04', 143, 1, 6, 6), -- Action, Joss Whedon, Sarah Davis
                                                                                                                              ('Avatar', 2009, 'PG-13', '2009-12-18', 162, 5, 4, 7), -- Sci-Fi, James Cameron, David Wilson
                                                                                                                              ('The Lord of the Rings: The Fellowship of the Ring', 2001, 'PG-13', '2001-12-19', 178, 9, 7, 8), -- Fantasy, Peter Jackson, Laura Martinez
                                                                                                                              ('La La Land', 2016, 'PG-13', '2016-12-09', 128, 6, 8, 9), -- Romance, Damien Chazelle, James Anderson
                                                                                                                              ('Dune', 2021, 'PG-13', '2021-10-22', 155, 5, 9, 10); -- Sci-Fi, Denis Villeneuve, Sophia Taylor

-- Populate the 'movie_actors' table
INSERT INTO movie_actors (id_movie, id_actor) VALUES
                                                  (1, 3), -- Inception, Leonardo DiCaprio
                                                  (1, 2), -- Inception, Scarlett Johansson
                                                  (2, 4), -- Pulp Fiction, Meryl Streep
                                                  (2, 5), -- Pulp Fiction, Brad Pitt
                                                  (3, 1), -- Forrest Gump, Tom Hanks
                                                  (3, 6), -- Forrest Gump, Angelina Jolie
                                                  (4, 3), -- Titanic, Leonardo DiCaprio
                                                  (4, 6), -- Titanic, Angelina Jolie
                                                  (5, 7), -- The Dark Knight, Chris Hemsworth
                                                  (5, 9), -- The Dark Knight, Robert Downey Jr.
                                                  (6, 9), -- The Avengers, Robert Downey Jr.
                                                  (6, 7), -- The Avengers, Chris Hemsworth
                                                  (7, 8), -- Avatar, Natalie Portman
                                                  (7, 10), -- Avatar, Emma Stone
                                                  (8, 11), -- The Lord of the Rings, Ryan Gosling
                                                  (8, 12), -- The Lord of the Rings, Jennifer Lawrence
                                                  (9, 11), -- La La Land, Ryan Gosling
                                                  (9, 10), -- La La Land, Emma Stone
                                                  (10, 13), -- Dune, Denzel Washington
                                                  (10, 14); -- Dune, Anne Hathaway