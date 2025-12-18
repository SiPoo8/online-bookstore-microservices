package com.bookstore.bookservice.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRequest {
    @NotBlank(message = "Title is reqired")
    private String title;
    @NotBlank(message = "Author is required")
    private String author;
    @Min(value = 0, message = "Price must be greater than or equal to 0")
    private Double price;
    @Min(value = 0, message = "Quantity must be greater than or equal to 0")
    private Integer quantity;
}
