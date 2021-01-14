package it.musialmarek.tacocloud.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "name")
@AllArgsConstructor
@NoArgsConstructor
public class Taco {
    @NotNull
    @Size(min = 5, message = "the name should contain at least 5 characters")
    private String name;
    @Size(min=1, message = "You have to take at least one ingredient")
    private List<Ingredient> ingredients;
}
