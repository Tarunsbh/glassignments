package com.greatlearning;

public class MergeSort {
	void sort(int arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, 0, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	void merge(int arr[], int left, int mid, int right) {
		// find the size of two arrays to merge
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// create temp space
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		// fill the data
		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			{

				if (leftArray[i] <= rightArray[j]) {
					arr[i] = leftArray[i];
					i++;
				} else
					arr[k] = rightArray[j];
				j++;
			}
			k++;

		}
		while (i < n1) {
			arr[k] = leftArray[i];
			k++;
			i++;
		}
		while (j < n2) {
			arr[k] = rightArray[j];
			k++;
			j++;

		}
	}
}
