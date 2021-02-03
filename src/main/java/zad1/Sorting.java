package zad1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting{

    // metoda sortująca liczby całkowite
    public List<Integer> sortListInts(List<Integer> integers){
        Collections.sort(integers);
        return integers;
    }

    //metoda generyczna sortująca w odwrotnej kolejności
    public <T>List<T> sortGenericList(List<T> inputList){
//        inputList.sort(null);
        Collections.sort(inputList,null);
        return inputList;
    }

    // metoda generyczna wyświetlająca listę
    public <T>void printList(List<T> inputList) {
        for (T i : inputList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
