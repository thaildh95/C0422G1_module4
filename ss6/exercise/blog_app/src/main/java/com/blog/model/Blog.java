package com.blog.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;

@Entity
@SpringBootApplication
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String detail;
    private String author;

    public Blog(Integer id, String title, String detail, String author) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.author = author;
    }

    public Blog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
