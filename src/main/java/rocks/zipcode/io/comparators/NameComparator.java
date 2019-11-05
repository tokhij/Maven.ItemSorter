package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    public int compare(Item name1, Item name2) {
        name1.getPrice();
        name2.getPrice();

        if (name1.getName().equals(name2.getName())) {
            return 1;
        }
        else{
            return 0;
        }
    }



}
