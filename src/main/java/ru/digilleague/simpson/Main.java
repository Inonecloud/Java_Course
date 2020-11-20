package ru.digilleague.simpson;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Liza().talk("Thhfjh");

        Simpson simpson = new Bart("D'oh");
        simpson.talk();

        Liza liza = new Liza();
        liza.talk();
    }
}
