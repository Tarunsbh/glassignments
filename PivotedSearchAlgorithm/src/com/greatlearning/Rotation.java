package com.greatlearning;

public class Rotation {
	void rotate(int arr[], int num) {
		int temp = arr[0];
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[size - 1] = temp;
	}

}
