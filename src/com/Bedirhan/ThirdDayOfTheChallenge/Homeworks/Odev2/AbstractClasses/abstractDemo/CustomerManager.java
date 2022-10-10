package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.AbstractClasses.abstractDemo;

public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager;
    public void getCustomers(){
        /*
        Eğer ki burada subdatabasemanagerlerini kullanırsan sorun var demektir, bağımlı oldun nereden bileceksin
        müşterinin oracle kullandığını
         */
        baseDatabaseManager.getData();


    }
}
