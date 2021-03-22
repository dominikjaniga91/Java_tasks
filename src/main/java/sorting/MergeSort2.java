package sorting;

import java.util.Arrays;

class MergeSort2 {


    void sort(int[] array, int length) {

        if(length < 2) {
            return;
        }
        int middle = length / 2;

        int[] right = Arrays.copyOfRange(array, 0, middle);
        int[] left = Arrays.copyOfRange(array, middle, length);

        sort(right, right.length);
        sort(left, left.length);

        merge(array, right, left);
    }

    void merge(int[] array, int[] right, int[] left) {

        int i = 0, j = 0, k = 0;

        while (j < right.length && k < left.length) {
            if (right[j] <= left[k]) {
                array[i++] = right[j++];
            } else {
                array[i++] = left[k++];
            }
        }

        while (j < right.length ) {
            array[i++] = right[j++];
        }

        while (k < left.length ) {
            array[i++] = left[k++];
        }

    }
}
