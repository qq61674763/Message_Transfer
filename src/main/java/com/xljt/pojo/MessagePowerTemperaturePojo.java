package com.xljt.pojo;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessagePowerPojo <br>
 * @date : 2019/9/17 13:11 <br>
 */
@Component
public class MessagePowerTemperaturePojo {

    /**
     * 可充电储能子系统个数
     */
    private String powerTemperatureSystemNumber;
    /**
     * 可充电储能子系统号
     */
    private String powerTemperatureSystemIndex;
    /**
     * 可充电储能温度探针个数
     */
    private String ProbeNumber;
    /**
     * 可充电储能子系统各温度探针检测到的温度值
     */
    private Map<Integer,String> probeTemperature;

    /**
     * 偏移量
     */
    private int index;

    public String getPowerTemperatureSystemNumber() {
        return powerTemperatureSystemNumber;
    }

    public void setPowerTemperatureSystemNumber(String powerTemperatureSystemNumber) {
        this.powerTemperatureSystemNumber = powerTemperatureSystemNumber;
    }

    public String getPowerTemperatureSystemIndex() {
        return powerTemperatureSystemIndex;
    }

    public void setPowerTemperatureSystemIndex(String powerTemperatureSystemIndex) {
        this.powerTemperatureSystemIndex = powerTemperatureSystemIndex;
    }

    public String getProbeNumber() {
        return ProbeNumber;
    }

    public void setProbeNumber(String probeNumber) {
        ProbeNumber = probeNumber;
    }

    public Map<Integer, String> getProbeTemperature() {
        return probeTemperature;
    }

    public void setProbeTemperature(Map<Integer, String> probeTemperature) {
        this.probeTemperature = probeTemperature;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MessagePowerTemperaturePojo{" +
                "powerTemperatureSystemNumber='" + powerTemperatureSystemNumber + '\'' +
                ", powerTemperatureSystemIndex='" + powerTemperatureSystemIndex + '\'' +
                ", ProbeNumber='" + ProbeNumber + '\'' +
                ", probeTemperature=" + probeTemperature +
                ", index=" + index +
                '}';
    }
}
