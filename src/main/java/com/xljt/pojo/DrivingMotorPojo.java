package com.xljt.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : DrivingMotorPojo <br>
 * @date : 2019/9/12 15:06 <br>
 */
@Component
public class DrivingMotorPojo {
    private String number;
    private String order;
    private String status;
    private String controlTemperature;
    private String rotatingSpeed;
    private String torque;
    private String temperature;
    private String controlVoltage;
    private String dcBusCurrent;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getControlTemperature() {
        return controlTemperature;
    }

    public void setControlTemperature(String controlTemperature) {
        this.controlTemperature = controlTemperature;
    }

    public String getRotatingSpeed() {
        return rotatingSpeed;
    }

    public void setRotatingSpeed(String rotatingSpeed) {
        this.rotatingSpeed = rotatingSpeed;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getControlVoltage() {
        return controlVoltage;
    }

    public void setControlVoltage(String controlVoltage) {
        this.controlVoltage = controlVoltage;
    }

    public String getDcBusCurrent() {
        return dcBusCurrent;
    }

    public void setDcBusCurrent(String dcBusCurrent) {
        this.dcBusCurrent = dcBusCurrent;
    }
}
