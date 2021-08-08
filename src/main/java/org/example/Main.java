package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        final List<Integer> filteredList = getFilteredList(intList);
        sortList(filteredList);
        printList(filteredList);
    }

    private static List<Integer> getFilteredList(List<Integer> intList) {
        final List<Integer> filteredList = new ArrayList<>();
        for (Integer x : intList) {
            if (x > 0 && x % 2 == 0) {
                filteredList.add(x);
            }
        }
        return filteredList;
    }

    private static void sortList(List<Integer> filteredList) {
        for (int i = 0; i < filteredList.size() - 1; i++) {
            int minElement = filteredList.get(i);
            int minElementPosition = i;

            for (int j = i + 1; j < filteredList.size(); j++) {
                final int currElement = filteredList.get(j);
                if (currElement < minElement) {
                    minElement = currElement;
                    minElementPosition = j;
                }
            }

            filteredList.set(minElementPosition, filteredList.get(i));
            filteredList.set(i, minElement);
        }
    }

    private static void printList(List<Integer> filteredList) {
        for (Integer x : filteredList) {
            System.out.println(x);
        }
    }
}
