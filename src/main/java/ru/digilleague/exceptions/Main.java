package ru.digilleague.exceptions;

public class Main {

    public static void main(String[] args) {

        try{
            System.out.println(myMethod(6));
        } catch (Exception ex){
            System.out.println("Ops, exception");
        } finally {
            System.out.println("Finally");
        }


    }


    private static String myMethod(int a) throws Exception {
        if (a>5) {
            throw new Exception();
        }
        return "Ok";
    }
}
