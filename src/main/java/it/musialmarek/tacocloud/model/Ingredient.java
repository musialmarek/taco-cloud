package it.musialmarek.tacocloud.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@RequiredArgsConstructor
@ToString
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
