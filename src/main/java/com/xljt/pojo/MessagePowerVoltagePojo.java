package com.xljt.pojo;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessagePowerVoltagePojo <br>
 * @date : 2019/9/17 14:30 <br>
 */
@Component
public class MessagePowerVoltagePojo {
    /**
     * 可充电储能子系统个数
     */
    private String powerVoltageSystemNumber;
    /**
     * 可充电储能子系统号
     */
    private String powerVoltageSystemIndex;
    /**
     * 可充电储能装置电压
     */
    private String powerVoltage;
    /**
     * 可充电储能装置电流
     */
    private String powerCurrent;
    /**
     * 单体电池总数
     */
    private String singlePowerNumber;
    /**
     * 本帧起始电池序号
     */
    private String startPowerIndex;
    /**
     * 本帧单体电池总数
     */
    private String framePowerNumber;
    /**
     * 单体电池电压
     */
    private Map<Integer,String> singePowerVoltages;
    /**
     * 偏移量
     */
    private int index;


    public String getPowerVoltageSystemNumber() {
        return powerVoltageSystemNumber;
    }

    public void setPowerVoltageSystemNumber(String powerVoltageSystemNumber) {
        this.powerVoltageSystemNumber = powerVoltageSystemNumber;
    }

    public String getPowerVoltageSystemIndex() {
        return powerVoltageSystemIndex;
    }

    public void setPowerVoltageSystemIndex(String powerVoltageSystemIndex) {
        this.powerVoltageSystemIndex = powerVoltageSystemIndex;
    }

    public String getPowerVoltage() {
        return powerVoltage;
    }

    public void setPowerVoltage(String powerVoltage) {
        this.powerVoltage = powerVoltage;
    }

    public String getPowerCurrent() {
        return powerCurrent;
    }

    public void setPowerCurrent(String powerCurrent) {
        this.powerCurrent = powerCurrent;
    }

    public String getSinglePowerNumber() {
        return singlePowerNumber;
    }

    public void setSinglePowerNumber(String singlePowerNumber) {
        this.singlePowerNumber = singlePowerNumber;
    }

    public String getStartPowerIndex() {
        return startPowerIndex;
    }

    public void setStartPowerIndex(String startPowerIndex) {
        this.startPowerIndex = startPowerIndex;
    }

    public String getFramePowerNumber() {
        return framePowerNumber;
    }

    public void setFramePowerNumber(String framePowerNumber) {
        this.framePowerNumber = framePowerNumber;
    }

    public Map<Integer, String> getSingePowerVoltages() {
        return singePowerVoltages;
    }

    public void setSingePowerVoltages(Map<Integer, String> singePowerVoltages) {
        this.singePowerVoltages = singePowerVoltages;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MessagePowerVoltagePojo{" +
                "powerVoltageSystemNumber='" + powerVoltageSystemNumber + '\'' +
                ", powerVoltageSystemIndex='" + powerVoltageSystemIndex + '\'' +
                ", powerVoltage='" + powerVoltage + '\'' +
                ", powerCurrent='" + powerCurrent + '\'' +
                ", singlePowerNumber='" + singlePowerNumber + '\'' +
                ", startPowerIndex='" + startPowerIndex + '\'' +
                ", framePowerNumber='" + framePowerNumber + '\'' +
                ", singePowerVoltages=" + singePowerVoltages +
                ", index=" + index +
                '}';
    }
}
