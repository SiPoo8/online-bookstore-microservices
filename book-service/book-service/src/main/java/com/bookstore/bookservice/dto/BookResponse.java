package com.bookstore.bookservice.dto;

import com.bookstore.bookservice.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BookResponse {
    private Long id;
    private String title;
    private String author;
    private double price;
    private Integer quantity;
    LocalDateTime createdAt;
    public BookResponse(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.price = book.getPrice();
        this.quantity = book.getQuantity();
        this.createdAt = book.getCreatedAt();
    }



}
