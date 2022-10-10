package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities;

public class Category extends BaseEntity {
    public Category() {
        super();
    }

    public Category(String name, int id) {
        this.set_id(id);
        this.set_name(name);
    }
}
