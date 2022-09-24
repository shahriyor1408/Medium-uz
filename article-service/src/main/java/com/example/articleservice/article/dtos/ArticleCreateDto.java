package com.example.articleservice.article.dtos;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleCreateDto {

    @NotBlank(message = "Title can not be blank!")
    private String title;

    @NotBlank(message = "Conclusion can not be blank!")
    private String conclusion;

    @NotBlank(message = "User id can not be blank!")
    private String userId;

    @NotBlank(message = "Body can not be blank!")
    private String body;
}
