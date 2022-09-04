package com.casestudy.model.person.employee;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "level")
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer levelId;
    private String levelName;

    @OneToMany(mappedBy = "levelType")
    private List<Employee> employeeList;

    public Level() {
    }

    public Level(Integer levelId, String levelName) {
        this.levelId = levelId;
        this.levelName = levelName;

    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

}
