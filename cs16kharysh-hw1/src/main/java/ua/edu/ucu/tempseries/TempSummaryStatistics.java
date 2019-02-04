package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    final private double avgTemp;
    final private double devTemp;
    final private double maxTemp;
    final private double minTemp;

    public TempSummaryStatistics(double avgTemp, double devTemp,
                                 double maxTemp, double minTemp) {
        this.avgTemp = avgTemp;
        this.devTemp = devTemp;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }
    public double getMaxTemp() {
        return maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getDevTemp() {
        return devTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }
}
