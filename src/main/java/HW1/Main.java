package HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //1е задание
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String arr2[] = {"A", "B", "C", "D", "E"};
        swap(arr1, 1, 5);
        swap(arr2, 0, 4);

        //2е задание
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        convArray(arr);


        //3е задание
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Orange> or2 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        Box<Apple> ap2 = new Box<>();

        or.addFruit(new Orange());
        or.addFruit(new Orange());
        or1.addFruit(new Orange());

        ap.addFruit(new Apple());
        ap.addFruit(new Apple());
        ap1.addFruit(new Apple());

        System.out.println("Box 1: " + or.getTotalWeight());
        System.out.println("Box 2: " + or1.getTotalWeight());
        System.out.println("Box 3: " + ap.getTotalWeight());
        System.out.println("Box 4: " + ap1.getTotalWeight());

        System.out.println("Вес Box 1 равен весу Box 2? "+ or.compare(ap));

        or.pourIntoAnother(or1);
//        or.addFruit(new Orange());
        ap.pourIntoAnother(ap1);
        /*ap.addFruit(new Apple());
        or1.addFruit(new Orange());
        ap1.addFruit(new Apple());
        */
        System.out.println("Orange Box1: " +or.getTotalWeight());
        System.out.println("Orange Box2: "+ or1.getTotalWeight());
        System.out.println("Apple Box1: " +ap.getTotalWeight());
        System.out.println("Apple Box2: "+ ap1.getTotalWeight());
    }


    public static void swap(Object[] arr, int n1, int n2) {

        //1е задание
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
        System.out.println("Результат перестановки элемнтов массива: " + Arrays.toString(arr));

    }

    public static <T> void convArray(T[] arr) {
        //2е задание
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, arr);
        System.out.println(arrayList);
    }
}
