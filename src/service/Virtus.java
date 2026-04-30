package service;

public class Virtus implements ICar{
    @Override
    public String carPrice(double amount) {
        return "The price of the Virtus is "+ amount;
    }
}
