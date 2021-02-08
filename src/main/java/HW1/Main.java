package HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*Integer[] arr = {1,2,3,4,5,6,7,8,9,0};
        convArray(arr);*/


    }


    public static void swap(Object[] arr, int n1, int n2){

        //1е задание
        System.out.println("Исходный массив: "+ Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат перестановки элемнтов массива: "+Arrays.toString(arr));

    }

    public static <T> void convArray (T[]arr){
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,arr);
        System.out.println(arrayList);
    }
}
