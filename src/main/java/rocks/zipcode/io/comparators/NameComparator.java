package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    public int compare(Item compName1, Item compName2) {
        String compN1 = compName1.getName();
        String compN2  = compName2.getName();


        return compN1.compareTo(compN2);
        }
    }




