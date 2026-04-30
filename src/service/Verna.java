package service;

public class Verna implements ICar{
    @Override
    public String carPrice(double amount) {
        return "The price of the Verna is "+ amount;
    }
}
