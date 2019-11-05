package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {


    public int compare(Item price1, Item price2) {
        Double compprice1 = price1.getPrice();
        Double compprice2  = price2.getPrice();

//        if (price1.getPrice() > price2.getPrice()) {
//            return 1;
//        }
//        else if (price1.getPrice() < price2.getPrice()) {
//            return -1;
//        }
//        else{
//            return 0;
//          this also works^^^

            return compprice1.compareTo(compprice2);
        }
    }


