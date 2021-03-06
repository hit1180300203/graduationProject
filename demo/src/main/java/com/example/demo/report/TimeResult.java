package com.example.demo.report;

public class TimeResult {
    public static final int rsiResponseUdpThreshold = 250;
    public static final int rsiResponseTcpThreshold = 500;
    public static final int rsiPublicationLatencyThreshold = 3900000;
    public static final int rssResponseUdpThreshold = 150;
    public static final int rssResponseTcpThreshold = 300;
    public static final int rssPublicationLatencyThreshold = 2100000;
    private final double value;
    private final int measurementsSize;

    public TimeResult(double value, int measurementsSize) {
        this.value = value;
        this.measurementsSize = measurementsSize;
    }

    public double getValue() {
        return value;
    }

    public int getMeasurementsSize() {
        return measurementsSize;
    }
}
