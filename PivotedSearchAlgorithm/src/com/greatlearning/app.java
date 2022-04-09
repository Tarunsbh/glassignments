package com.greatlearning;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// Read the size of the array
		System.out.println("Enter the size of the array");
		try (Scanner sc = new Scanner(System.in)) {

			int size = sc.nextInt();
			int arr[] = new int[size];

			System.out.println("Enter the ellements of array");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Input array");
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
			MergeSort mergeSort = new MergeSort();
			mergeSort.divide(arr, 0, size - 1);

			System.out.println("Sorted array");
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
			Rotation rotate = new Rotation();
			rotate.rotate(arr, size);
			
			System.out.println("Rotate array");
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

}
