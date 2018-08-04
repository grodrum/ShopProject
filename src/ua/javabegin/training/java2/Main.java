package ua.javabegin.training.java2;

import ua.javabegin.training.java2.bank.OschadBank;
import ua.javabegin.training.java2.goods.TV;
import ua.javabegin.training.java2.interfaces.BankInterface;
import ua.javabegin.training.java2.interfaces.GoodsInterface;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankInterface myBank = new OschadBank("Oshchad") {

        };
        ((OschadBank) myBank).showResult();
        GoodsInterface goods = new TV();
        ((TV) goods).selectChannel(true);
        System.out.println("Number of channels is " + ((TV) goods).selectChannel(35));
    }
}
