package com.example.articleservice.article;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.Clock;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Article {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    private String id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String conclusion;

    @Column(nullable = false, unique = true)
    private String slug;

    @Column(nullable = false)
    private String userId;

    @Lob
    @Column(nullable = false)
    private String body;

    @Builder.Default
    @CreatedDate
    @CreationTimestamp
    private LocalDateTime createdAt = LocalDateTime.now(Clock.systemUTC());
}
