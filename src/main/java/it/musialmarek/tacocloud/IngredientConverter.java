package it.musialmarek.tacocloud;

import it.musialmarek.tacocloud.model.Ingredient;
import org.springframework.core.convert.converter.Converter;

import java.util.Arrays;
import java.util.List;

import static it.musialmarek.tacocloud.model.Ingredient.Type;

public class IngredientConverter implements Converter<String, Ingredient> {
    private List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
            new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
            new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
            new Ingredient("CARN", "Carnitas", Type.PROTEIN),
            new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
            new Ingredient("LETC", "Lettuce", Type.VEGGIES),
            new Ingredient("CHED", "Cheddar", Type.CHEESE),
            new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
            new Ingredient("SLSA", "Salsa", Type.SAUCE),
            new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
    );

    @Override
    public Ingredient convert(String id) {
        return ingredients.stream().filter(i -> i.getId().equals(id)).findFirst().get();
    }
}
