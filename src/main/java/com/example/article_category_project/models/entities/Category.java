package com.example.article_category_project.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter private Long id;
    @Column(name = "category_name") @Getter @Setter private String name;
    @ManyToOne Category category;
}
