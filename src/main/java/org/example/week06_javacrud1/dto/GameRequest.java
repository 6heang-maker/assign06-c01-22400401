package org.example.week06_javacrud1.dto;

public record GameRequest(
        String title,
        String genre,
        String developer,
        int price,
        double rating
) {}