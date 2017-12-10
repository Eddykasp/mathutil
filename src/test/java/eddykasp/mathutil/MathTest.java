package eddykasp.mathutil;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MathTest {

    @Test
    void testAverageWithEmptyCollection(){
        Collection<Double> collection = new ArrayList<>();
        Double result = Math.average(collection);
        assertNull(result);
    }

    @Test
    void testAverageWithNullCollection(){
        Collection<Double> collection = null;
        Double result = Math.average(collection);
        assertNull(result);
    }

    @Test
    void testAverageLowValues(){
        Collection<Double> collection = new ArrayList<>();
        collection.add(1.5);
        collection.add(2.5);
        collection.add(3.7);
        collection.add(5.5);
        Double result = Math.average(collection);
        Double expectedResult = 3.3;
        assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    void testAverageHighValues(){
        Collection<Double> collection = new ArrayList<>();
        collection.add(12344.6);
        collection.add(234234.5);
        collection.add(235432523.3);
        Double result = Math.average(collection);
        Double expectedResult = 78559700.8;
        assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    void testAverageNegativeValues(){
        Collection<Double> collection = new ArrayList<>();
        collection.add(-2343234.0);
        collection.add(-233.5);
        collection.add(-5436.435);
        Double result = Math.average(collection);
        Double expectedResult = -782967.9783333333;
        assertEquals(expectedResult, result, 0.000001);
    }

    @Test
    void testSumPositiveValues(){
        Collection<Double> collection = new ArrayList<>();
        collection.add(2.5);
        collection.add(5.4);
        collection.add(4.6);
        Double result = Math.sum(collection);
        Double expectedResult = 12.5;
        assertEquals(expectedResult, result, 0.01);
    }

    @Test
    void testSumWithNegativeValues(){
        Collection<Double> collection = new ArrayList<>();
        collection.add(-2.5);
        collection.add(-5.4);
        collection.add(-4.6);
        Double result = Math.sum(collection);
        Double expectedResult = -12.5;
        assertEquals(expectedResult, result, 0.01);
    }

    @Test
    public void testSumWithEmptyCollection(){
        Collection<Double> collection = new ArrayList<>();
        Double result = Math.sum(collection);
        assertNull(result);
    }

    @Test
    public void testSumWithNull(){
        Collection<Double> collection = null;
        Double result = Math.sum(collection);
        assertNull(collection);
    }

    @Test
    public void testProduct(){
        Collection<Double> collection = new ArrayList<>();
        collection.add(2.0);
        collection.add(3.0);
        collection.add(-4.5);
        Double result = Math.product(collection);
        Double expectedResult = -27.0;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testProductWithEmptyCollection(){
        Collection<Double> collection = new ArrayList<>();
        Double result = Math.product(collection);
        assertNull(result);
    }

    @Test
    public void testProductWithNull(){
        Collection<Double> collection = null;
        Double result = Math.product(collection);
        assertNull(result);
    }
}
