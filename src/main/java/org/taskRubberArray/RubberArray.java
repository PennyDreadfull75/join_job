package org.taskRubberArray;

import java.util.Arrays;

public class RubberArray {
    private int size;
    private int[] array;

    public RubberArray() {
        this.size = 0;
        this.array = new int[this.size];
    }
    public void append (int item) {
        size++;
        int [] newArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[size-1] = item;

        array = newArray;
    }

    public void appendRange (int ... items) {
        for (int i = 0; i < items.length; i++) {
            append(items[i]);
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res += String.valueOf(array[i]) + " ";
        }
        return "[" + res.trim() + "]";
    }
}
