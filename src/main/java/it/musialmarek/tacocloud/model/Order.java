package it.musialmarek.tacocloud.model;

import lombok.*;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {
    @NotBlank(message = "entering your name is necessary")
    private String name;
    @NotBlank(message = "entering street of your address is necessary")
    private String street;
    @NotBlank(message = "entering city of your address is necessary")
    private String city;
    @NotBlank(message = "entering state of your address is necessary")
    private String state;
    @NotBlank(message = "entering zip of your address is necessary")
    private String zip;
    @CreditCardNumber(message = "number of credit card isn't correct")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][1-9])$", message = "wrong date format, use MM/YY")
    private String ccExpiration;
    @Digits(integer = 3,fraction = 0, message = "Incorrect CVV number")
    private String ccCVV;
}
