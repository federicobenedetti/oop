package com.federicobenedetti.oop;

public class DataSet {
    private String BmiSexAgeQuantileTimeGeo;
    private double BE;
    private double BG;
    private double CZ;
    private double DE;
    private double EE;
    private double EL;
    private double ES;
    private double FR;
    private double CY;
    private double LV;
    private double HU;
    private double MT;
    private double AT;
    private double PL;
    private double RO;
    private double SI;
    private double SK;
    private double TR;

    public DataSet() {
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "BmiSexAgeQuantileTimeGeo = '" + BmiSexAgeQuantileTimeGeo + '\'' +
                ", BE = " + BE +
                ", BG = " + BG +
                ", CZ = " + CZ +
                ", DE = " + DE +
                ", EE = " + EE +
                ", EL = " + EL +
                ", ES = " + ES +
                ", FR = " + FR +
                ", CY = " + CY +
                ", LV = " + LV +
                ", HU = " + HU +
                ", MT = " + MT +
                ", AT = " + AT +
                ", PL = " + PL +
                ", RO = " + RO +
                ", SI = " + SI +
                ", SK = " + SK +
                ", TR = " + TR +
                '}';
    }

    public String getBmiSexAgeQuantileTimeGeo() {
        return BmiSexAgeQuantileTimeGeo;
    }

    public void setBmiSexAgeQuantileTimeGeo(String bmiSexAgeQuantileTimeGeo) {
        BmiSexAgeQuantileTimeGeo = bmiSexAgeQuantileTimeGeo;
    }

    private double StringToBoolean(String number) {
        return Double.parseDouble(number);
    }

    public double getBE() {
        return BE;
    }

    public void setBE(String BE) {
        this.BE = StringToBoolean(BE);
    }

    public double getBG() {
        return BG;
    }

    public void setBG(String BG) {
        this.BG = StringToBoolean(BG);
    }

    public double getCZ() {
        return CZ;
    }

    public void setCZ(String CZ) {
        this.CZ = StringToBoolean(CZ);
    }

    public double getDE() {
        return DE;
    }

    public void setDE(String DE) {
        this.DE = StringToBoolean(DE);
    }

    public double getEE() {
        return EE;
    }

    public void setEE(String EE) {
        this.EE = StringToBoolean(EE);
    }

    public double getEL() {
        return EL;
    }

    public void setEL(String EL) {
        this.EL = StringToBoolean(EL);
    }

    public double getES() {
        return ES;
    }

    public void setES(String ES) {
        this.ES = StringToBoolean(ES);
    }

    public double getFR() {
        return FR;
    }

    public void setFR(String FR) {
        this.FR = StringToBoolean(FR);
    }

    public double getCY() {
        return CY;
    }

    public void setCY(String CY) {
        this.CY = StringToBoolean(CY);
    }

    public double getLV() {
        return LV;
    }

    public void setLV(String LV) {
        this.LV = StringToBoolean(LV);
    }

    public double getHU() {
        return HU;
    }

    public void setHU(String HU) {
        this.HU = StringToBoolean(HU);
    }

    public double getMT() {
        return MT;
    }

    public void setMT(String MT) {
        this.MT = StringToBoolean(MT);
    }

    public double getAT() {
        return AT;
    }

    public void setAT(String AT) {
        this.AT = StringToBoolean(AT);
    }

    public double getPL() {
        return PL;
    }

    public void setPL(String PL) {
        this.PL = StringToBoolean(PL);
    }

    public double getRO() {
        return RO;
    }

    public void setRO(String RO) {
        this.RO = StringToBoolean(RO);
    }

    public double getSI() {
        return SI;
    }

    public void setSI(String SI) {
        this.SI = StringToBoolean(SI);
    }

    public double getSK() {
        return SK;
    }

    public void setSK(String SK) {
        this.SK = StringToBoolean(SK);
    }

    public double getTR() {
        return TR;
    }

    public void setTR(String TR) {
        this.TR = StringToBoolean(TR);
    }
}
