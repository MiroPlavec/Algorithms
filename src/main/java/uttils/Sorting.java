package uttils;

import java.util.List;

public class Sorting {

    public static <T extends Comparable<T>> void bubbleSort(List<T> list){
        int n = list.size();
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for(int i=0; i<n-1; i++){
                if(list.get(i).compareTo(list.get(i+1)) > 0){
                    T temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    swapped = true;
                }
            }
            n--;
        }

    }

    public static <T extends Comparable<T>> void selectionSort(List<T> list){

        int start = 0;
        while(start != list.size()-1) {

            T min = list.get(start);
            int minIndex = start;

            for (int i = start+1; i < list.size(); i++) {
                if(list.get(i).compareTo(min) < 0){
                    min = list.get(i);
                    minIndex = i;
                }
            }
            list.set(minIndex, list.get(start));
            list.set(start, min);

            start++;
        }
    }

    public static <T extends Comparable<T>> void insertionSort(List<T> list){
        // [10, 40, 1, 50, 3]

        for(int i=1; i< list.size()-1;i++){

            int beforeIdx = i - 1;

            while(list.get(i).compareTo(list.get(beforeIdx)) < 0 && beforeIdx>0){
                T temp = list.get(i);
                list.set(i, list.get(beforeIdx));
                list.set(beforeIdx, temp);
                beforeIdx--;
            }

        }
    }

}
