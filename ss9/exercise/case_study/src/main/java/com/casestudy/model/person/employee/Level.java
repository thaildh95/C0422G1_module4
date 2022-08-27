package com.casestudy.model.person.employee;

public class Level {
    private int levelId;
    private String levelName;

    public Level(int levelId, String levelName) {
        this.levelId = levelId;
        this.levelName = levelName;
    }

    public Level() {
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
