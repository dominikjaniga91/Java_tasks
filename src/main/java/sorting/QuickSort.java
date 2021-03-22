package sorting;

import java.util.Arrays;

class QuickSort {

    /**
     * Procedura sortowania w QuickSort dzieli się na część która rozdziela elementy tablicy
     * względem pewnnej wartości P oraz część służącą do właściwego sortowania.
     *
     * Wartość P to jeden z elementów tablicy, który pełni funkcję osi.
     *
     * 1. Procedura.
     *
     *  a) odczytujemy wartość osiowego elementu P - z reguły pierwszy
     *      element analizowanego fragmentu tablicy.
     *
     *  b) dzielimy fragment tablicy
     *
     *  c) elementy mniejsze od P znajdują się po lewej stronie a większe po prawej.
     *
     *  d) sortujemy obydwa fragnemty - lewy i prawy.
     *
     *  Pseudocode:
     *
     *  def sort(tab, int left, int right)
     *      if (left < right) {
     *         int m = left;
     *         sort(tab, left, m - 1)
     *         sort(tab, m + 1, right)
     *      }
     *
     *   left - lewy skrajny index aktualnego fragmentu tablicy
     *   rigth - prawy skrajny index aktualnego elementu tablicy
     *
     */

    void sort(int[] tab, int left, int right) {
        int temp;
        if (left < right) {
            int m = left;
            System.out.println(tab[left]);
            for (int i = left + 1; i <= right; i++) {
                if (tab[i] < tab[left]) {
                    ++m;
                    temp = tab[m];
                    tab[m] = tab[i];
                    tab[i] = temp;
                }
                System.out.println(Arrays.toString(tab));
            }
            temp = tab[left];
            tab[left] = tab[m];
            tab[m] = temp;

            sort(tab, left, m-1);
            sort(tab, m+1, right);
        }
    }
}
