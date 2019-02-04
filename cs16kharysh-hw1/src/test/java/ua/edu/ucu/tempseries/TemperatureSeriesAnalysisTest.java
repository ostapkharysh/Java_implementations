package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.average();

        assertEquals(expResult, actualResult, 0.00001);
    }


    @Test
    public void testDeviationWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;

        // call tested method
        double actualResult = seriesAnalysis.deviation();
        assertEquals(expResult, actualResult, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.deviation();
    }

    @Test
    public void testDeviation() {
        double[] temperatureSeries = {5.0, 10.0, 15.0, 20.0, 25.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 7.07;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.01);
    }

    @Test
    public void testMinWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.min();
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.min();
    }

    @Test
    public void testMin() {
        double[] temperatureSeries = {5.0, -234.7, 15.0, -20.0, 125.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -234.7;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00000001);
    }

    @Test
    public void testMaxWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        // call tested method
        double actualResult = seriesAnalysis.max();
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.max();
    }

    @Test
    public void testMax() {
        double[] temperatureSeries = {5.0, -234.7, 15.0, -20.0, 125.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 125.0;
        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00000001);
    }

    @Test
    public void testFindTempClosestToZeroWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToZero();
        assertEquals(expResult, actualResult, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToZero();
    }

    @Test
    public void testFindTempClosestToZero() {
        double[] temperatureSeries = {-5.0, -234.7, 15.0, -20.0, 125.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;
        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00000001);
    }

    @Test
    public void testFindTempClosestToValueWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToValue(56.0);

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testfindTempClosestToValueWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToValue(67);
    }

    @Test
    public void testFindTempClosestToValue() {
        double[] temperatureSeries = {-1, 4, 56, 3, 2, -2};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 4.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(5);

        assertEquals(expResult, actualResult, 0.00000001);
    }

    @Test
    public void testFindTempsLessThenWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {1.0};

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsLessThen(56.0);
        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempsLessThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempsLessThen(67);
    }

    @Test
    public void testFindTempsLessThen() {
        double[] temperatureSeries = {-1.0, 4.0, 56.0, 3.0, 2.0, -2.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {-1.0, 4.0, 3.0, 2.0, -2.0};
        double[] actualResult = seriesAnalysis.findTempsLessThen(5.0);
        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));
    }

    @Test
    public void testFindTempsGreaterThenWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(56.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempsGreaterThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempsGreaterThen(67);
    }

    @Test
    public void testFindTempsGreaterThen() {
        double[] temperatureSeries = {-1.0, 4.0, 56.0, 3.0, 2.0, -2.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {56.0};
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(5.0);
        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));
    }

    @Test
    public void testAddTemps() {
        // setup input data and expected result
        double[] temperatureSeries = {1.0, 67.9, 654};
        double[] temp = new double[]{67, 86.8};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 6;

        // call tested method
        int actualResult = seriesAnalysis.addTemps(temp);

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTempsWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.addTemps(new double[]{});
    }


    @Test(expected = IllegalArgumentException.class)
    public void testTempSummaryStatistics() {
        double[] tempearatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(tempearatureSeries);
        seriesAnalysis.summaryStatistics();
    }
}
