package ru.digilleague.loops;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
//            System.out.println(i + " Hello for loop");
        }


//        for (int j=0;;){
//            System.out.println(j++);
//        }

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");



        for(String s: list){
//            System.out.println(s);
        }

        int i = 10;
        while (i>0){
//            System.out.println("Hello");
            i--;
        }

        do{
            System.out.println("Friday");
        }while (2<1);


    }
}
