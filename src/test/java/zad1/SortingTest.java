package zad1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    Sorting sorting = new Sorting();

    @Test
    void sortListInts() {
        //given
        List<Integer> inputlist = new ArrayList<>();
        inputlist.add(9);
        inputlist.add(1);
        inputlist.add(13);
        inputlist.add(-2);


        //when
        List actualList = sorting.sortListInts(inputlist);

        //then
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(-2, 1, 9, 13));
        assertEquals(expectedList, actualList);
    }

    @Test
    void sortGenericList() {
        //given
        List<String> stringList = new ArrayList<>(Arrays.asList("Jeden", "Dwa", "Osiem"));
        List<Double> doublesList = new ArrayList<>(Arrays.asList(3.5, 11.7, 1.0));
        //when
        List<String> actuaStringlList = sorting.sortGenericList(stringList);
        List<Double> actualDoubleList = sorting.sortGenericList(doublesList);

        //then
        List<String> expectedList = new ArrayList<>(Arrays.asList("Dwa", "Jeden", "Osiem"));
        assertEquals(expectedList, actuaStringlList);

        List<Double> expectedDoublesList = new ArrayList<>(Arrays.asList(1.0, 3.5, 11.7));
        assertEquals(expectedDoublesList, actualDoubleList);
    }

}