package org.example.week06_javacrud1.dto;

public record GameResponse(
        Long id,
        String title,
        String genre,
        String developer,
        int price,
        double rating
) {}