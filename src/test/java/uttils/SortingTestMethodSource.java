package uttils;

import org.junit.jupiter.params.provider.Arguments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingTestMethodSource {

    private static List<Integer> stringArrayToListOfIntegers(String s){
        List<Integer> list = new ArrayList<>();
        String[] elements = s.split(",");
        for(String e : elements){
            e = e.replaceAll("(\\r|\\n)", "");
            e = e.trim();
            int i = Integer.parseInt(e);
            list.add(i);
        }

        return list;

    }

    static List<Arguments> getIntegerTests(){

        List<Arguments> arguments = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("src/test/resources/tests_integer.csv"));
            sc.useDelimiter("\n");
            while(sc.hasNext()){
                String[] arrays = sc.next().split("->");
                if(arrays.length > 2) continue;
                List<Integer> testCase = stringArrayToListOfIntegers(arrays[0]);
                List<Integer> expected = stringArrayToListOfIntegers(arrays[1]);
                arguments.add(Arguments.of(testCase, expected));

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return arguments;
    }

}
