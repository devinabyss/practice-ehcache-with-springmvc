package com.dwuthk.practice.ehcache.model;

/**
 *
 * @author HK
 */
public class Character {

    private Long id;

    private String name;

    private String appearance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "Character{" + "id=" + id + ", name=" + name + ", appearance=" + appearance + '}';
    }

}
