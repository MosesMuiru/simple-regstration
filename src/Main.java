import Regestration.Regester;

import Health.health;
 import Accounts.Fees;
public class Main {
    public static void main(String[] args){
        //
        Regester regOne = new Regester();
        health newPerson = new health();
// accounts
        Fees newAccount = new Fees();


        regOne.setAge();
        regOne.setName();
        regOne.setRegNumber();

        regOne.compile();

        newPerson.confirmhealth();

//        accounts and money

        newAccount.payingFee();
        newAccount.regesterUnits();
        System.out.println("Hello world!");
    }
}