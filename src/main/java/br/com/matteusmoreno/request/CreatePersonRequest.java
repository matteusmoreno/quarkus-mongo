package br.com.matteusmoreno.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreatePersonRequest(
        @NotBlank
        String name,
        @NotNull
        Integer age) {
}
