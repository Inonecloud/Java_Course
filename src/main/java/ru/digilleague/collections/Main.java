package ru.digilleague.collections;

public class Main {
    public static void main(String[] args) {

        String[] str = {"A", "B", "C", null, null};
        String[] str2 = new String[0];
        ArrayList<String> stringArrayList = new ArrayList<>();

        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList.isEmpty());
        stringArrayList.add("new string1");
        stringArrayList.add("new string2");
        stringArrayList.add(null);
        stringArrayList.add(null);
        stringArrayList.add(null);
        stringArrayList.add("new string3");
        stringArrayList.add("new string4");
        stringArrayList.add("new string5");
        stringArrayList.add("new string6");

        for(int i=0; i<stringArrayList.size(); i++){
            System.out.println("stringArrayList [" + i + "] = " + stringArrayList.get(i));
        }

    }
}
