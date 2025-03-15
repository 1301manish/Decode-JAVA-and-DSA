package Week_17_PriorityQueue;

import java.util.Scanner;

public class ConvertArrayToHeap {
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void heapifyUp(int[] array, int index) {
        int parent = (index - 1) / 2;

        if (index > 0 && array[index] > array[parent]) {
            swap(array, index, parent);
            heapifyUp(array, parent);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            heapifyUp(array, i);
        }

        System.out.println("Array converted to Max Heap:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
