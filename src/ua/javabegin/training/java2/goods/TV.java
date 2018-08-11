package ua.javabegin.training.java2.goods;


public class TV extends ElectronicDevice {
    private int channel, channels;
    private int[] channelArray;

    public int[] getChannelArray() {
        return channelArray;
    }

    public void setChannelArray(int[] channelArray) {
        this.channelArray = channelArray;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public void selectChannel(int channel) {
        System.out.println("\nYou have choosen channel " + channel);
    }

    public int selectChannelList(int channels) {
        System.out.println("Select one channel of: ");
        for (int i = 0; i < this.channelArray.length; i++) {
            System.out.print(channelArray[i] + " ");
        }
        return channels;
    }
}
