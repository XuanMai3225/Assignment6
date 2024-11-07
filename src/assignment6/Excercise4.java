package assignment6;

import java.util.Scanner;
import java.util.Arrays;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sort the Array in Ascending Order: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Elemnt: " +(i + 1) + " ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Input an integer array: ");
        //Sắp xếp mảng
        Arrays.sort(array);
        System.out.println("Array in ascending order: ");
        for(int num : array ){
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
