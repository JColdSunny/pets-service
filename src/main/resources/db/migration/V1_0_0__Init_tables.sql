CREATE TABLE species
(
    id               INTEGER GENERATED BY DEFAULT AS IDENTITY,
    name             TEXT UNIQUE NOT NULL,
    created_at       TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    last_modified_at TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_species_id PRIMARY KEY (id)
);

CREATE TABLE breeds
(
    id               INTEGER GENERATED BY DEFAULT AS IDENTITY,
    name             TEXT UNIQUE NOT NULL,
    species_id       INTEGER     NOT NULL,
    created_at       TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    last_modified_at TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_breeds_id PRIMARY KEY (id),
    CONSTRAINT fk_breeds_species_id FOREIGN KEY (species_id) REFERENCES species (id)
);

CREATE TABLE pets
(
    id               INTEGER GENERATED BY DEFAULT AS IDENTITY,
    name             TEXT      NOT NULL,
    weight           NUMERIC,
    height           NUMERIC,
    species_id       INTEGER   NOT NULL,
    breed_id         INTEGER   NOT NULL,
    created_at       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    last_modified_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_pets_id PRIMARY KEY (id),
    CONSTRAINT fk_pets_species_id FOREIGN KEY (species_id) REFERENCES species (id)
);
COMMENT ON TABLE pets IS 'General table for all the pets in the system.';
COMMENT ON COLUMN pets.id IS 'Unique identifier for pets.';
