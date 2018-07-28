package ua.javabegin.training.java2.bank;

import ua.javabegin.training.java2.interfaces.BankInterface;

public abstract class BaseBank implements BankInterface {

    private String name;
    private String creditDescription;

    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getCreditDescription() {
        return null;
    }
}
