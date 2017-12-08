package eddykasp.mathutil;

import java.util.Collection;

public class Math {

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
