package eddykasp.mathutil;

import java.util.Collection;

public class Math {

    /**
     * Calculates the average value of a collection of numbers.
     * @param collection A collection of Double values.
     * @return The average value of all values passed in the collection,
     * returns null if the collection is empty or null.
     */
    public static Double average(Collection<Double> collection){
        if(collection.size() == 0){
            return null;
        }
        Double sum = 0d;
        for (Double n :
                collection) {
            sum += n;
        }
        return sum/collection.size();
    }
}
