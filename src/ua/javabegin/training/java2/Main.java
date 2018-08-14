package ua.javabegin.training.java2;

import ua.javabegin.training.java2.building.SellingRoom;
import ua.javabegin.training.java2.employees.*;
import ua.javabegin.training.java2.goods.ElectronicDevice;
import ua.javabegin.training.java2.goods.TV;
import ua.javabegin.training.java2.interfaces.EmployeeInterface;
import ua.javabegin.training.java2.interfaces.RoomInterface;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ElectronicDevice tv = new TV();
        int[] chArr = new int[23];
        for (int i = 0; i < 23; i++) {
            chArr[i] = i + 1;
        }
        ((TV) tv).setChannelArray(chArr);
        ((TV) tv).selectChannelList(23);
        System.out.print("\nSelect channel, please: ");
        Scanner selectedChannel = new Scanner(System.in);
        int ch = selectedChannel.nextInt();
        selectedChannel.close();
        ((TV) tv).selectChannel(ch);
        EmployeeInterface worker = new Seller("Bob", 25, "man", true);
        System.out.println("Our the best seller is " + worker.getName() + ". He is " + worker.getAge() + " now.");
        EmployeeInterface worker2 = new Manager("Robin", 47, "woman", true);
        System.out.println("Our the best manager is " + worker2.getName() + ". He is " + worker2.getAge() + " now.");
        EmployeeInterface worker3 = new Guard("Charlie", 44, "man", true);
        System.out.println("Our the best guard is " + worker3.getName() + ". He is " + worker3.getAge() + " now.");
        EmployeeInterface worker4 = new Loader("Garry", 29, "man", true);
        EmployeeInterface worker5 = new Director("Sam", 50, "man", true);
        EmployeeInterface worker6 = new Consultant("Pet", 18, "woman", true);
        RoomInterface tradeCenter = new SellingRoom("Circle", 3, 0, 0, 10, 0);
        System.out.println("The volume of the selling room is " + tradeCenter.getVolume(3, 7));
    }
}
