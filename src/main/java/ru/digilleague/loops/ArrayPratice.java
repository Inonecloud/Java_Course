package ru.digilleague.loops;

public class ArrayPratice {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 14, 5, 9};


        int maxValue = array[0];
//        for (int i = 0; i<array.length; i++){
//            if(array[i]>maxValue){
//                maxValue = array[i];
//            }
//        }

        int i =1;
        while (i<array.length){
            if (array[i]>maxValue) maxValue=array[i];
            i++;
        }

//        int maxValue = array[0];
//        int i = 0;
//        while(i<array.length){
//            if(array[i]>maxValue){
//                maxValue = array[i];
//            }
//            i++;
//        }

        System.out.println(maxValue);
    }
}
