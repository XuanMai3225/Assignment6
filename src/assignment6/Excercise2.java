package assignment6;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array of integers: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Element: " +(i + 1));
            array[i] = scanner.nextInt();
        }
        //Tính tổng các ptử
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += array[i];
        }
        //Tính TBC
        float averge = (float) sum / n;
        System.out.println("Average of the elements in the array: " +sum);
        System.out.print("Sum of elements in array: " +averge);
        scanner.close();
    }
}
