package com.xljt.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageCarPojo <br>
 * @date : 2019/9/16 14:32 <br>
 */
@Component
public class MessageCarPojo {
    /**
     * 车辆状态
     */
    private String carStatus;
    /**
     * 充电状态
     */
    private String powerStatus;
    /**
     * 运行状态
     */
    private String runType;
    /**
     * 速度
     */
    private String speed;
    /**
     * 累计里程
     */
    private String mileage;
    /**
     * 总电压
     */
    private String totalVoltage;
    /**
     * 总电流
     */
    private String totalCurrent;
    /**
     * soc
     */
    private String soc;
    /**
     * DC-DC状态
     */
    private String dcStatus;
    /**
     * 档位
     */
    private String gear;
    /**
     * 绝缘电阻
     */
    private String insulationResistance;
    /**
     * 预留
     */
    private String reserved;
    /**
     * 偏移量
     */
    private int index;

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

    public String getDcStatus() {
        return dcStatus;
    }

    public void setDcStatus(String dcStatus) {
        this.dcStatus = dcStatus;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getInsulationResistance() {
        return insulationResistance;
    }

    public void setInsulationResistance(String insulationResistance) {
        this.insulationResistance = insulationResistance;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MessageCarPojo{" +
                "carStatus='" + carStatus + '\'' +
                ", powerStatus='" + powerStatus + '\'' +
                ", runType='" + runType + '\'' +
                ", speed='" + speed + '\'' +
                ", mileage='" + mileage + '\'' +
                ", totalVoltage='" + totalVoltage + '\'' +
                ", totalCurrent='" + totalCurrent + '\'' +
                ", soc='" + soc + '\'' +
                ", dcStatus='" + dcStatus + '\'' +
                ", gear='" + gear + '\'' +
                ", insulationResistance='" + insulationResistance + '\'' +
                ", reserved='" + reserved + '\'' +
                ", index=" + index +
                '}';
    }
}
