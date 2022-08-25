package com.music.model;

import javax.persistence.*;

@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String singer;
    private String link;

    public Music() {
    }

    public Music(Integer id, String name, String singer, String link) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.link = link;
    }
    public Music( String name, String singer, String link) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
