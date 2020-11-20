package ru.digilleague.conditions;

public class Main {
    public static void main(String[] args) {
        if(1<2){
//            System.out.println("1<2");
        } else {
//            System.out.println("Мы сломали логику");
        }

        boolean flag = true;

        if(flag){
            System.out.println("true");
        }else {
            System.out.println(false);
        }
//a>b? c: d
        int today =20;
        String string = today == 20 ? "today 20": "no today is not 20";

        System.out.println(string);

        switch (today){
            case 20:
                System.out.println("today 20");
            case 22:
                System.out.println("today is 22");
                break;
            default:
                System.out.println("Sorry");
        }
    }
}
