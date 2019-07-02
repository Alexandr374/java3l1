package com.company;
/*Задача:
        1. Даны классы Fruit -> Apple, Orange;
        2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        3. Для хранения фруктов внутри коробки можно использовать ArrayList;
        4. Сделать метод getWeight(), который высчитывает вес коробки.
        Задать вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        5. Внутри класса Box сделать метод Compare, который позволяет сравнить текущую коробку с той,
        которую подадут в Compare в качестве параметра. True – если их массы равны, False в противоположном случае.
        Можно сравнивать коробки с яблоками и апельсинами;
        6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно,
        в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        7. Не забываем про метод добавления фрукта в коробку. */


import com.company.Fruit.Apple;
import com.company.Fruit.Box;
import com.company.Fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static int [] myArray = new int[] {1, 2, 3, 4, 5};
    private static ArrayList numbers = new ArrayList();

    public static void main(String[] args) {
        exch (0,3);
        transformArrayToList();

        Box <Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box <Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками " + appleBox.getTotalWeight()
                + "\nВес коробки с апельсинами " + orangeBox.getTotalWeight());
    }

    private static void exch(int i, int j){
        System.out.println("Первый массив");
        System.out.println(Arrays.toString(myArray));

        int temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;

        System.out.println("Второй массив");
        System.out.println(Arrays.toString(myArray));
    }

    private static void transformArrayToList(){

        for (int i = 0; i < myArray.length; i++) {
            numbers.add(myArray[i]);
        }
        System.out.println("Список: \n" + numbers);
    }
}
