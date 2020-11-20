package ru.digilleague.airport;

import ru.digilleague.messager.Telegram;

public class Airport {
    private Plane plane;
    private Terminal terminal;

    public Airport(Plane plane){
        this.plane = plane;
        terminal = new Terminal();
    }
}
