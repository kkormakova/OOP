package org.example;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(Arrays.asList(new Cat("Barsik"),
                new Cat("Zhorik"),
                new Cat("Murzik"),
                new Cat("Lutik")));
        System.out.println("Использование итератора: ");
        Iterator<Cat> iter = cats.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("Использование компоратора: ");
        cats.getCatList().sort(new NameComparator());
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
}