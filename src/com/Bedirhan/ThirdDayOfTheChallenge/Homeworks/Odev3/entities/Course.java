package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities;

import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.business.BaseManager;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.business.CourseManager;

public class Course extends BaseEntity {
    private int _id;
    private Tutor _tutor;
    private Category _category;
    private double _price;

    public Course() {
        super();
    }

    public Course(String name,int _id, Tutor _tutor, Category _category, double _price) {
        this._id = _id;
        this.set_name(name);
        this._tutor = _tutor;
        this._category = _category;
        this._price = _price;
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public Tutor get_tutor() {
        return _tutor;
    }

    public void set_tutor(Tutor _tutor) {
        this._tutor = _tutor;
    }

    public Category get_category() {
        return _category;
    }

    public void set_category(Category _category) {
        this._category = _category;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }
}
