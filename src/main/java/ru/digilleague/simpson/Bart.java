package ru.digilleague.simpson;

public class Bart extends Simpson {
    String prank;

    Bart(String prank){
        this.prank = prank;
    }

    @Override
    void talk() {
        System.out.println("Eat my shorts!");
    }

    @Override
    protected void prank(String prank) {
        super.prank(prank);
        System.out.println("Knock Homer down!");
    }
}
