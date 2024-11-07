package assignment6;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array of integers: ");
        int n = scanner.nextInt();
        int[] array = new int [n];
        for(int i = 0; i < n; i++){ //nhập từng phần tử của mảng
            System.out.println("Elemnet: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        //Tạo giá trị, là ptử đ/tiên của mảng
        int max = array[0];
        int min = array[0];
        //Ktra mảng, v/lặp bđ từ element T2
        for(int i = 1; i < n; i++){  
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Largest element: " +max);
        System.out.println("Smallest element: " +min);
        scanner.close();
    }
}
