package ru.digilleague.messager;


public class Telegram implements Messager {

    @Override
    public void sendMessage(String text) {
        System.out.println("ths message send via Telegram " + text);
    }

    @Override
    public void receiveMessage() {
        System.out.println("ths message received Telegram ");
    }


}
