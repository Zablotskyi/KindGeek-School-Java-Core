package model;

import java.util.Arrays;

public class MyLIst<T>{
    private T[] arr;
    private Integer capacity;

    public MyLIst() {
        this.capacity = 10;
        this.arr = (T[]) new Object[10];
    }

    public void add(T t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = t;
                return;
            }
        }
        this.capacity = (capacity * 3) / 2 + 1;
        T[] newArr = copyAllArgsFromArrayToNewArray(this.arr);
        newArr[this.arr.length] = t;
        this.arr = newArr;
    }

    private T[] copyAllArgsFromArrayToNewArray(T[] oldArray) {
        T[] newArray = (T[]) new Object[this.capacity];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = this.arr[i];
        }
        return newArray;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        if (this.arr[0] == null) {
            builder.append("]");
            return builder.toString();
        }
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i + 1 <= this.arr.length && this.arr[i + 1] != null) {
                builder.append(", ");
            } else {
                builder.append("]");
                return builder.toString();
            }
        }
        return builder.toString();
//        Arrays.stream(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == null) {
//                break;
//            }
//        }
//        return "MyLIst{" +
//                "arr=" + Arrays.toString(arr) +
//                '}';
//    }
    }
}
