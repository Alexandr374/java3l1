package com.company.Fruit;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> fruitList;

    private float totalWeight;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit){
        fruitList.add(fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public float getTotalWeight() {
        return totalWeight;
    }

}
