package com.federicobenedetti.oop.Model;

public class StatsDto implements ISerializableBean {
    private String Field;
    private double Avg = 0;
    private double Min = 0;
    private double Max = 0;
    private double Std = 0;
    private double Sum = 0;
    private int Count = 0;

    public StatsDto() {
    }

    public StatsDto(String field, double avg, double min, double max, double std, double sum, int count) {
        this.Field = field;
        this.Avg = avg;
        this.Min = min;
        this.Max = max;
        this.Std = std;
        this.Sum = sum;
        this.Count = count;
    }

    public String getField() {
        return Field;
    }

    public void setField(String field) {
        Field = field;
    }

    public double getAvg() {
        return Avg;
    }

    public void setAvg(double avg) {
        Avg = avg;
    }

    public double getMin() {
        return Min;
    }

    public void setMin(double min) {
        Min = min;
    }

    public double getMax() {
        return Max;
    }

    public void setMax(double max) {
        Max = max;
    }

    public double getStd() {
        return Std;
    }

    public void setStd(double std) {
        Std = std;
    }

    public double getSum() {
        return Sum;
    }

    public void setSum(double sum) {
        Sum = sum;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }
}
