package ua.javabegin.training.java2;

import ua.javabegin.training.java2.bank.OschadBank;
import ua.javabegin.training.java2.interfaces.BankInterface;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankInterface myBank = new OschadBank("Oshchad") {

        };
        ((OschadBank) myBank).showResult();
    }
}
