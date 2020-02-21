package com.federicobenedetti.oop.Model;

public class StatsDto implements ISerializableBean {
    private String Field;
    private int Avg = 0;
    private int Min = 0;
    private int Max = 0;
    private int Std = 0;
    private int Sum = 0;

    public StatsDto() {
    }

    public StatsDto(String field, int avg, int min, int max, int std, int sum) {
        this.Field = field;
        this.Avg = avg;
        this.Min = min;
        this.Max = max;
        this.Std = std;
        this.Sum = sum;
    }

    public String getField() {
        return Field;
    }

    public void setField(String field) {
        Field = field;
    }

    public int getAvg() {
        return Avg;
    }

    public void setAvg(int avg) {
        Avg = avg;
    }

    public int getMin() {
        return Min;
    }

    public void setMin(int min) {
        Min = min;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int max) {
        Max = max;
    }

    public int getStd() {
        return Std;
    }

    public void setStd(int std) {
        Std = std;
    }

    public int getSum() {
        return Sum;
    }

    public void setSum(int sum) {
        Sum = sum;
    }
}
