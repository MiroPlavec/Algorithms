package uttils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

class SortingTest {


    @ParameterizedTest
    @MethodSource("uttils.SortingTestMethodSource#getIntegerTests")
    <T extends Comparable<T>> void selectionSort(List<T> testInput, List<T> expected) {
        Sorting.selectionSort(testInput);
        Assertions.assertArrayEquals(expected.toArray(), testInput.toArray());
    }

    @ParameterizedTest
    @MethodSource("uttils.SortingTestMethodSource#getIntegerTests")
    <T extends Comparable<T>> void insertionSort_test(List<T> testCase, List<T> expected){
        Sorting.selectionSort(testCase);
        Assertions.assertArrayEquals(expected.toArray(), testCase.toArray());
    }

}