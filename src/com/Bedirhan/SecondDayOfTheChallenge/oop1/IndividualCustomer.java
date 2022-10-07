package com.Bedirhan.SecondDayOfTheChallenge.oop1;

public class IndividualCustomer extends Customer{
    private String _firstName;
    private String _lastName;


    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        this._firstName = firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }
}
