package org.example;

import java.util.Iterator;
import java.util.List;

public class ListOfCatIterator implements Iterator<Cat> {
    private List<Cat> catListIterator;
    private int counter;
    public ListOfCatIterator(List<Cat> catList){
        this.catListIterator = catList;
        counter = 0;
    }
    public void setCounter(int counter){
        this.counter = counter;
    }
    @Override
    public boolean hasNext(){
        return counter < catListIterator.size();
    }
    @Override
    public Cat next(){
        return catListIterator.get(counter++);
    }
}
