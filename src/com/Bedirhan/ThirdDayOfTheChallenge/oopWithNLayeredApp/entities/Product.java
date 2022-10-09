package com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.entities;

public class Product {
    private int _id;
    private String _name;
    private double _unitPrice;

    public Product() {
        super();
    }

    public Product(int id, String name, double unitPrice) {
        super();
        _id = id;
        _name = name;
        _unitPrice = unitPrice;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public double get_unitPrice() {
        return _unitPrice;
    }

    public void set_unitPrice(double _unitPrice) {
        this._unitPrice = _unitPrice;
    }
}
