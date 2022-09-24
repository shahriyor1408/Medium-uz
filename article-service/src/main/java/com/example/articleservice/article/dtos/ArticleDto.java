package com.example.articleservice.article.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {
    private String title;
    private String slug;

    @JsonIgnore
    private String userID;
    private String user;

    LocalDateTime createdAt;
}
