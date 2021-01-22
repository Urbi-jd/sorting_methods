package zad1;

import java.util.Comparator;

public class ClientComparatorByLastName implements Comparator<Client> {
    @Override
    public int compare(Client c1, Client c2) {
        if (c1.getLastName().compareTo(c2.getLastName()) == 0) {
            if (c1.getFirstName().compareTo(c2.getFirstName()) == 0) {
                if (c1.getLoanAmmount() > c2.getLoanAmmount())
                    return 1;
                else if (c1.getLoanAmmount() < c2.getLoanAmmount())
                    return -1;
                else
                    return 0;
            } else
                return c1.getFirstName().compareTo(c2.getFirstName());
        } else
            return c1.getLastName().compareTo(c2.getLastName());
    }
}
