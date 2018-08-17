package ua.javabegin.training.java2.employees;

import ua.javabegin.training.java2.customer.CommonCustomer;
import ua.javabegin.training.java2.interfaces.CustomerInterface;

public class Manager extends BaseEmployee {
    public Manager(String name, int age, String sex, boolean workStatus) {
        super(name, age, sex, workStatus);
    }

    public String managePeople() {
        return "Manager manages people";
    }

    public boolean consultantFinding(boolean isFound) {
        return isFound;
    }

    // Applying congregation
    public void consultantAssigning(Consultant consultant, CustomerInterface customer) {
        System.out.println(this.getName() + " assigned " + consultant.getName() + "  to " + ((CommonCustomer) customer).getName());

    }
}
