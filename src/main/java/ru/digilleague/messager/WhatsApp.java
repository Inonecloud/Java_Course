package ru.digilleague.messager;

public class WhatsApp implements Messager{
    @Override
    public void sendMessage(String text) {
        System.out.println("ths message send via WhatsApp " + text);
    }

    @Override
    public void receiveMessage() {
        System.out.println("ths message received WhatsApp ");
    }
}
