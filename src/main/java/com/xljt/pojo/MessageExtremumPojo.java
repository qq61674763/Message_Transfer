package com.xljt.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageExtremumPojo <br>
 * @date : 2019/9/17 15:04 <br>
 */
@Component
public class MessageExtremumPojo {
    /**
     * 最高电压电池子系统号
     */
    private String highestVoltageBatterySystemIndx;
    /**
     *  最高电压电池单体代号
     */
    private String highestVoltageBatterySystemCode;
    /**
     *  电池单体电压最高值
     */
    private String highestBatterySingleVoltage;
    /**
     * 最低电压电池子系统号
     */
    private String lowestVoltageBatterySystemIndx;
    /**
     * 最低电压电池单体代号
     */
    private String lowestVoltageBatterySystemCode;
    /**
     * 电池单体电压最低值
     */
    private String lowestBatterySingleVoltage;
    /**
     * 最高温度子系统号
     */
    private String highestTemperatureSystemIndex;
    /**
     * 最高温度探针序号
     */
    private String highestTemperatureProbeIndex;
    /**
     * 最高温度值
     */
    private String highestTemperature;
    /**
     * 最低温度子系统号
     */
    private String lowestTemperatureSystemIndex;
    /**
     * 最低温度探针序号
     */
    private String lowestTemperatureSProbeIndex;
    /**
     * 最低温度值
     */
    private String lowestTemperature;
    /**
     * 偏移量
     */
    private int index;

    public String getHighestVoltageBatterySystemIndx() {
        return highestVoltageBatterySystemIndx;
    }

    public void setHighestVoltageBatterySystemIndx(String highestVoltageBatterySystemIndx) {
        this.highestVoltageBatterySystemIndx = highestVoltageBatterySystemIndx;
    }

    public String getHighestVoltageBatterySystemCode() {
        return highestVoltageBatterySystemCode;
    }

    public void setHighestVoltageBatterySystemCode(String highestVoltageBatterySystemCode) {
        this.highestVoltageBatterySystemCode = highestVoltageBatterySystemCode;
    }

    public String getHighestBatterySingleVoltage() {
        return highestBatterySingleVoltage;
    }

    public void setHighestBatterySingleVoltage(String highestBatterySingleVoltage) {
        this.highestBatterySingleVoltage = highestBatterySingleVoltage;
    }

    public String getLowestVoltageBatterySystemIndx() {
        return lowestVoltageBatterySystemIndx;
    }

    public void setLowestVoltageBatterySystemIndx(String lowestVoltageBatterySystemIndx) {
        this.lowestVoltageBatterySystemIndx = lowestVoltageBatterySystemIndx;
    }

    public String getLowestVoltageBatterySystemCode() {
        return lowestVoltageBatterySystemCode;
    }

    public void setLowestVoltageBatterySystemCode(String lowestVoltageBatterySystemCode) {
        this.lowestVoltageBatterySystemCode = lowestVoltageBatterySystemCode;
    }

    public String getLowestBatterySingleVoltage() {
        return lowestBatterySingleVoltage;
    }

    public void setLowestBatterySingleVoltage(String lowestBatterySingleVoltage) {
        this.lowestBatterySingleVoltage = lowestBatterySingleVoltage;
    }

    public String getHighestTemperatureSystemIndex() {
        return highestTemperatureSystemIndex;
    }

    public void setHighestTemperatureSystemIndex(String highestTemperatureSystemIndex) {
        this.highestTemperatureSystemIndex = highestTemperatureSystemIndex;
    }

    public String getHighestTemperatureProbeIndex() {
        return highestTemperatureProbeIndex;
    }

    public void setHighestTemperatureProbeIndex(String highestTemperatureProbeIndex) {
        this.highestTemperatureProbeIndex = highestTemperatureProbeIndex;
    }

    public String getHighestTemperature() {
        return highestTemperature;
    }

    public void setHighestTemperature(String highestTemperature) {
        this.highestTemperature = highestTemperature;
    }

    public String getLowestTemperatureSystemIndex() {
        return lowestTemperatureSystemIndex;
    }

    public void setLowestTemperatureSystemIndex(String lowestTemperatureSystemIndex) {
        this.lowestTemperatureSystemIndex = lowestTemperatureSystemIndex;
    }

    public String getLowestTemperatureSProbeIndex() {
        return lowestTemperatureSProbeIndex;
    }

    public void setLowestTemperatureSProbeIndex(String lowestTemperatureSProbeIndex) {
        this.lowestTemperatureSProbeIndex = lowestTemperatureSProbeIndex;
    }

    public String getLowestTemperature() {
        return lowestTemperature;
    }

    public void setLowestTemperature(String lowestTemperature) {
        this.lowestTemperature = lowestTemperature;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MessageExtremumPojo{" +
                "highestVoltageBatterySystemIndx='" + highestVoltageBatterySystemIndx + '\'' +
                ", highestVoltageBatterySystemCode='" + highestVoltageBatterySystemCode + '\'' +
                ", highestBatterySingleVoltage='" + highestBatterySingleVoltage + '\'' +
                ", lowestVoltageBatterySystemIndx='" + lowestVoltageBatterySystemIndx + '\'' +
                ", lowestVoltageBatterySystemCode='" + lowestVoltageBatterySystemCode + '\'' +
                ", lowestBatterySingleVoltage='" + lowestBatterySingleVoltage + '\'' +
                ", highestTemperatureSystemIndex='" + highestTemperatureSystemIndex + '\'' +
                ", highestTemperatureProbeIndex='" + highestTemperatureProbeIndex + '\'' +
                ", highestTemperature='" + highestTemperature + '\'' +
                ", lowestTemperatureSystemIndex='" + lowestTemperatureSystemIndex + '\'' +
                ", lowestTemperatureSProbeIndex='" + lowestTemperatureSProbeIndex + '\'' +
                ", lowestTemperature='" + lowestTemperature + '\'' +
                ", index=" + index +
                '}';
    }
}
