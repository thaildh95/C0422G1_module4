package com.blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "catalogy")
public class Catalogy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameCatalogy;
    @OneToMany(mappedBy = "catalogy")
    @JsonBackReference
    private List<Blog> blogList;

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public Catalogy() {
    }

    public Catalogy(Integer id, String nameCatalogy) {
        this.id = id;
        this.nameCatalogy = nameCatalogy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCatalogy() {
        return nameCatalogy;
    }

    public void setNameCatalogy(String nameCatalogy) {
        this.nameCatalogy = nameCatalogy;
    }
}
