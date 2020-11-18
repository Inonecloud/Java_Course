package ru.digilleague.messager;


public class Client {
    Messager messager;

    public Client(){
        this.messager = new WhatsApp();
        messager.sendMessage("anythig");
        messager.receiveMessage();
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
