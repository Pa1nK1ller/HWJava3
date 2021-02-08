package HW1;


import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList;
    private double totalWeight;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);


    }

    public double getTotalWeight() {
        float totalWeight = 0.0f;
        for (T o : fruitList) {
        totalWeight+= o.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box anotherBox) {
        if (getTotalWeight() == anotherBox.getTotalWeight()) return true;
        return false;
    }

    public void pourIntoAnother(Box<T> anotherBox) {
        anotherBox.fruitList.addAll(this.fruitList);
        this.fruitList.clear();

    }

}

