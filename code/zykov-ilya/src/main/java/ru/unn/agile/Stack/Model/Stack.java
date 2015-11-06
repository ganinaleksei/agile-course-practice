package ru.unn.agile.Stack.Model;

public class Stack {
    private Object[] values;
    private int size;

    public Stack() {
        values = new Object[0];
        size = 0;
    }

    public Stack(final Object[] inputArray) {
        values = inputArray.clone();
        size = inputArray.length;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < size; ++i) {
            res += values[i];
            if (i != size - 1) {
                res += " ";
            }
        }
        return res;
    }

    public void push(final Object element) {
        size++;
        if (values.length < size) {
            Object[] newValues = new Object[size * 2];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
        }
        values[size - 1] = element;
    }

    public Object pop() {
        if (size > 0) {
            size--;
            return values[size];
        } else {
            return null;
        }
    }

    public Object peak() {
        if (size > 0) {
            return values[size - 1];
        } else {
            return null;
        }
    }
}
