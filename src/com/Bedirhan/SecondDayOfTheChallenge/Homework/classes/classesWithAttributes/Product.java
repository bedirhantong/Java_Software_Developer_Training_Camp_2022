package com.Bedirhan.SecondDayOfTheChallenge.Homework.classes.classesWithAttributes;

public class Product {

    // field or attribute
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String kod;


    public Product(int id,String name,String description,double price,int stockAmount){
        this();
        set_id(id);
        set_name(name);
        set_description(description);
        set_price(price);
        set_stockAmount(stockAmount);

    }
    public Product(){
        System.out.println("Product created");
    }

    public int get_id(){
        return _id;
    }
    public void set_id(int id){
        _id = id;
    }

    public String get_name(){
        return _name;
    }
    public void set_name(String name){
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
    public String getKod(){
        return this._name.substring(0,1)+get_id();
    }
}
