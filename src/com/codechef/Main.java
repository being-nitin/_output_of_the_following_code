package com.codechef;

public class Main {

    public static void main(String[] args) {
        // what will be the output of the following:
        // 11. What will be the output of the below program?

        try {
            int arr[] = {1, 2, 3, 4, 5};
            for (int i = 0; i <= 5; i++) {
                System.out.print("Array elements are : " + arr[i] + "\n");
            }
        } catch (ArrayIndexOutOfBoundsException c) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}