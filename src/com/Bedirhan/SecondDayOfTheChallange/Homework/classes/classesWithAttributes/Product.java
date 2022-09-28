package com.Bedirhan.SecondDayOfTheChallange.Homework.classes.classesWithAttributes;

public class Product {

    // field or attribute
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;


    public int getId(){
        return _id;
    }
    public void setId(int id){
        _id = id;
    }

    public String getName(){
        return _name;
    }
    public void setName(String name){
        _name = name;
    }

    public String get_description(){
        return _description;
    }
    public void set_description(String description){
        _description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }
}
