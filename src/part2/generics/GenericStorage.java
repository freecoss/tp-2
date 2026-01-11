package part2.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {
    private List<T> elements;

    public GenericStorage() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T o) {
        elements.add(o);
    }

    public void removeElement(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.size());
        }
    }

    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.size());
        }
    }

    public int getSize() {
        return elements.size();
    }
    
    @Override
    public String toString() {
        return elements.toString();
    }
}
