package ua.javabegin.training.java2;

import ua.javabegin.training.java2.goods.ElectronicDevice;
import ua.javabegin.training.java2.goods.TV;

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


    }
}
