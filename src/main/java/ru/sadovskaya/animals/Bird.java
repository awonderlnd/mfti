package ru.sadovskaya.animals;

import lombok.Getter;
import lombok.Setter;
import ru.sadovskaya.interfaces.Singable;

@Getter
@Setter
abstract public class Bird implements Singable {
    private String species;
    private String songType;

    Bird(String species) {
        this.species = species;
    }

    Bird(String species, String songType) {
        this(species);
        this.songType = songType;
    }

}
