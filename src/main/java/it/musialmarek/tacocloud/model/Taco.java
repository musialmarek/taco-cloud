package it.musialmarek.tacocloud.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "name")
@AllArgsConstructor
@NoArgsConstructor
public class Taco {

    private String name;
    private List<Ingredient> ingredients;
}
