package cn.vanillazi.learn.room.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    private String name;
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String homePage;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
