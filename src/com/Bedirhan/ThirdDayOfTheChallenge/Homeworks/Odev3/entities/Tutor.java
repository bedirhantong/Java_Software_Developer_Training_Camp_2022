package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities;

public class Tutor extends BaseEntity{
    private int _age;
    private int _experienceYear;
    public Tutor() {
        super();
    }

    public Tutor(String _name,int _id,int _age, int _experienceYear) {
        this._age = _age;
        this._experienceYear = _experienceYear;
        this.set_id(_id);
        this.set_name(_name);
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public int get_experienceYear() {
        return _experienceYear;
    }

    public void set_experienceYear(int _experienceYear) {
        this._experienceYear = _experienceYear;
    }
}
