package assignment6;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of occurrences of an element in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Element: " +(i + 1) + " ");
            array[i] = scanner.nextInt();   
        }
        System.out.print("Count the number of integers that appear in the array: ");
        int integer = scanner.nextInt();
        //đếm số lần
        int count = 0;
        for(int i = 0; i < n; i++){
            if(array[i] == integer){
                count++;
            }
        }
        System.out.println("The number of times " +integer + " the integer " + count + " appears in the array.");
        scanner.close();
    }
}
