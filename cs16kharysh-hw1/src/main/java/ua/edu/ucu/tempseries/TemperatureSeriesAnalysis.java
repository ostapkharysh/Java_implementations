package ua.edu.ucu.tempseries;

import java.lang.Math;
import java.util.InputMismatchException;

import static java.lang.Math.*;

public class TemperatureSeriesAnalysis {
    private double[] toDoArray = {4, 324.8, 234.8, 323.4};
    private double temporValue = 244;

    public TemperatureSeriesAnalysis() {
        double[] toDoArray = {2.0, -300, 4.5, 2.5};
        double[] temps = {213, 213, 123, 2342};
        double tempValue = 4.7;
        for (double item : toDoArray) {
            if (item < -273) {
                throw new InputMismatchException();
            }
        }
        for (double item : temps) {
            if (item < -273) {
                throw new InputMismatchException();
            }
        }
    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        toDoArray = temperatureSeries;
    }

    public double average() {
        double everage = 0;
        if (toDoArray.length >= 1) {
            for (int i = 0; i < toDoArray.length; i++) {
                everage += toDoArray[i];
            }
            everage = everage / toDoArray.length;
            return everage;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double deviation() {
        double average = average();
        double sum = 0;
        if (toDoArray.length >= 1) {
            for (int x = 0; x < toDoArray.length; x++) {
                sum += pow(toDoArray[x] - average, 2);
            }
            return sqrt(sum / toDoArray.length);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double min() {

        if (toDoArray.length >= 1) {
            double smallest = toDoArray[0];
            for (int c = 0; c < toDoArray.length; c++) {
                if (smallest > toDoArray[c]) {
                    smallest = toDoArray[c];
                }
            }
            return smallest;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double max() {

        if (toDoArray.length >= 1) {
            double highest = toDoArray[0];
            for (double aToDoArray : toDoArray) {
                if (highest < aToDoArray) {
                    highest = aToDoArray;
                }
            }
            return highest;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double findTempClosestToZero() {
        if (toDoArray.length >= 1) {
            double closest = toDoArray[0];
            for (int c = 0; c < toDoArray.length; c++) {
                if (abs(closest) > abs(toDoArray[c])) {
                    closest = toDoArray[c];
                } else if (abs(closest) == abs(toDoArray[c])) {
                    closest = abs(closest);
                }
            }
            return closest;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double findTempClosestToValue(double tempValue) {
        if (toDoArray.length >= 1) {
            double closest = toDoArray[0];
            for (int c = 1; c < toDoArray.length; c++) {
                if (Math.abs(tempValue - closest) > abs(tempValue - toDoArray[c])) {
                    closest = toDoArray[c];
                }
            }
            return closest;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double[] findTempsLessThen(double tempValue) {
        double[] outputList = new double[toDoArray.length];
        int x = 0;
        if (toDoArray.length >= 1) {
            for (double aToDoArray : toDoArray) {
                if (aToDoArray < tempValue) {
                    outputList[x] = aToDoArray;
                    x++;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        double[] RetList = new double[x];
        for (int p = 0; p < x; p++) {
            RetList[p] = outputList[p];
        }
        return RetList;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        double[] outputList = new double[toDoArray.length];
        int x = 0;
        if (toDoArray.length >= 1) {
            for (double aToDoArray : toDoArray) {
                if (tempValue <= aToDoArray) {
                    outputList[x] = aToDoArray;
                    x++;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        double[] RetList = new double[x];
        for (int p = 0; p < x; p++) {
            RetList[p] = outputList[p];
        }
        return RetList;
    }

    public TempSummaryStatistics summaryStatistics() {
        if (toDoArray.length >= 1) {
            TempSummaryStatistics data = new TempSummaryStatistics(average(), deviation(), max(), min());
            return data;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int addTemps(double... temps) {
        if (temps.length + toDoArray.length == 0) {
            throw new IllegalArgumentException();
        }
        int count = toDoArray.length;
        while ((temps.length + toDoArray.length) > count) {
            count *= 2;
        }
        return count;
    }
}


