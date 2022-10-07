package com.Bedirhan.SecondDayOfTheChallenge.oop1;

public class CorporateCustomer extends Customer{
    private String _companyName;
    private String _taxNumber;

    public String get_taxNumber() {
        return _taxNumber;
    }

    public void set_taxNumber(String _taxNumber) {
        this._taxNumber = _taxNumber;
    }

    public String get_companyName() {
        return _companyName;
    }

    public void set_companyName(String _companyName) {
        this._companyName = _companyName;
    }
}
