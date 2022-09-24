package com.example.articleservice.article;

import com.example.articleservice.article.dtos.ArticleCreateDto;
import com.example.articleservice.article.dtos.ArticleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/article")
public class ArticleResource {
    private final ArticleService service;

    @PostMapping
    public ResponseEntity<ArticleDto> create(@Valid @RequestBody ArticleCreateDto dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @GetMapping
    public ResponseEntity<ArticleDto> get(@Valid @RequestBody ArticleCreateDto dto) {
        return ResponseEntity.ok(service.create(dto));
    }


}
