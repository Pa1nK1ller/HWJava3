package HW1;


import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);


    }

    public double getTotalWeight() {
        double totalWeight = 0.0f;
        for (T o : fruitList) {
        totalWeight += o.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box anotherBox) {
        return getTotalWeight() == anotherBox.getTotalWeight();
    }

    public void pourIntoAnother(Box<T> anotherBox) {
        anotherBox.fruitList.addAll(this.fruitList);
        this.fruitList.clear();

    }

}

