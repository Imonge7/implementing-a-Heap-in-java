package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    var heap = new Heap();
	    heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);
        heap.remove();
        System.out.println("Done");

        int[] numbers = {25, 33, 35, 18, 22, 29, 55, 3 , 1, 98};
        MaxHeap.heapify(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(MaxHeap.getKthLargest(numbers,1));
    }
}
