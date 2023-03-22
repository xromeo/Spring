package com.rivera.propertymanagement.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Created by Omar.Rivera on 14/3/23.
 *
 * @author Omar.Rivera
 */

public record PropertyDto(
        Long id,
        String title,
        String description,
        @NotNull
        @NotEmpty
        String ownerName,
        @NotNull(message = "Email is mandatory")
        @Size(min=1, max = 50, message = "Email should be between 1 to 50 characters in length")
        String ownerEmail,
        Double price,
        String address
        ) {
}
