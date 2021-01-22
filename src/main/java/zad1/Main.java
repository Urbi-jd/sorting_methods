package zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(Arrays.asList(12, 3, 18, -1, 8));
        List<String> strings = new ArrayList<>();
        strings.add("Jeden");
        strings.add("Osiem");
        strings.add("Dwa");
        strings.add("Cztery");

        Sorting sorting = new Sorting();

        sorting.printList(ints);
        sorting.sortList(ints);
        sorting.printList(ints);

        sorting.printList(strings);
        sorting.sortList(strings);
        sorting.printList(strings);

        Client client1 = new Client("Jan", "Kowalski", 32, 300000, 25);
        Client client2 = new Client("Anna", "Nowak", 45, 450000, 15);
        Client client3 = new Client("Miachał", "Bajor", 28, 650000, 30);
        Client client4 = new Client("Maciej", "Kowalski", 32, 120000, 25);
        Client client5 = new Client("Anna", "Nowak", 32, 240000, 20);
        Client client6 = new Client("Katarzyna", "Kowalska", 40, 1100000, 25);
        List<Client> clientsList = new ArrayList<>(Arrays.asList(client1, client2, client3, client4, client5, client6));

        System.out.println(clientsList);

        // 2.1 przy uzyciu Comparable na klasie obiektow listy
        Collections.sort(clientsList);
        System.out.println(clientsList);

        // 2.2 przez implementacje jakiegos interfejstu przekazane jako parametr do metody sortujacej
        ClientComparatorByLastName ccbn = new ClientComparatorByLastName();
        Collections.sort(clientsList, ccbn);
        System.out.println(clientsList);


        // 2.3 przez interfejs jako parametr + lambda
        clientsList.sort(Client::compareTo);


    }
}
