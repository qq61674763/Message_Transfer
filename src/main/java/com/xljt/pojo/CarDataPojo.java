package com.xljt.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : XU
 * @version : 1.0
 * @description CarData
 * @date : 2019/9/12 10:29
 */
@Component
public class CarDataPojo {


    private String carStatus;
    private String powerStatus;
    private String runType;
    private String speed;
    private String mileage;
    private String totalVoltage;
    private String totalCurrent;
    private String soc;
    private String dcdc;
    private String gear;
    private String moho;
    private String reserve;

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public String getPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
    }

    public String getRunType() {
        return runType;
    }

    public void setRunType(String runType) {
        this.runType = runType;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getTotalVoltage() {
        return totalVoltage;
    }

    public void setTotalVoltage(String totalVoltage) {
        this.totalVoltage = totalVoltage;
    }

    public String getTotalCurrent() {
        return totalCurrent;
    }

    public void setTotalCurrent(String totalCurrent) {
        this.totalCurrent = totalCurrent;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public String getDcdc() {
        return dcdc;
    }

    public void setDcdc(String dcdc) {
        this.dcdc = dcdc;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getMoho() {
        return moho;
    }

    public void setMoho(String moho) {
        this.moho = moho;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }
}
