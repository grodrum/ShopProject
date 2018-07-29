package ua.javabegin.training.java2.bank;

public class OschadBank extends BaseBank {
    private String name;

    protected OschadBank(String oshchad) {
        this.name = "Oschad123";
    }

    public void showResult() {
        System.out.println("This is my bank: " + this.name);
    }
}
