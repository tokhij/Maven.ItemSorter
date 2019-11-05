package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    public int compare(Item item1, Item item2) {
        item1.getId();
        item2.getId();

        if (item1.getId() > item2.getId()) {
            return 1;
        }
        else if (item1.getId() < item2.getId()) {
            return -1;
        }
        else{
            return 0;
        }
    }

}


