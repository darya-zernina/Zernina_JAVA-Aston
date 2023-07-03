package org.example;

import java.util.Scanner;

//Составить алгоритм: на входе есть числовой массив,
// необходимо вывести элементы массива кратные 3
class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Вывод элементов кратных 3: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
