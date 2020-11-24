package ru.digilleague.collections;

public class Main {
    public static void main(String[] args) {

        String[] str = {"A", "B", "C"};
        ArrayList<String> stringArrayList = new ArrayList<>(str);

//        System.out.println(stringArrayList.size());
//        System.out.println(stringArrayList.get(0));
        System.out.println(stringArrayList.isEmpty());
        stringArrayList.remove();
        System.out.println(stringArrayList.isEmpty());


    }
}
