package com.xljt.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : DrivingMotorPojo <br>
 * @date : 2019/9/12 15:06 <br>
 */
@Component
public class MessageDrivingMotorPojo {
    /**
     * 驱动电机个数
     */
    private String motorNumber;
    /**
     * 驱动电机序号
     */
    private String motorIndex;
    /**
     * 驱动电机状态
     */
    private String motorStatus;
    /**
     * 驱动电机控制器温度
     */
    private String controlTemperature;
    /**
     * 驱动电机转速
     */
    private String rotatingSpeed;
    /**
     * 驱动电机转矩
     */
    private String torque;
    /**
     * 驱动电机温度
     */
    private String temperature;
    /**
     * 电机控制器输入电压
     */
    private String controlVoltage;
    /**
     * 电机控制器直流母线电流
     */
    private String dcBusCurrent;
    /**
     * 偏移量
     */
    private int index;

    public String getMotorNumber() {
        return motorNumber;
    }

    public void setMotorNumber(String motorNumber) {
        this.motorNumber = motorNumber;
    }

    public String getMotorIndex() {
        return motorIndex;
    }

    public void setMotorIndex(String motorIndex) {
        this.motorIndex = motorIndex;
    }

    public String getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(String motorStatus) {
        this.motorStatus = motorStatus;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MessageDrivingMotorPojo{" +
                "motorNumber='" + motorNumber + '\'' +
                ", motorIndex='" + motorIndex + '\'' +
                ", motorStatus='" + motorStatus + '\'' +
                ", controlTemperature='" + controlTemperature + '\'' +
                ", rotatingSpeed='" + rotatingSpeed + '\'' +
                ", torque='" + torque + '\'' +
                ", temperature='" + temperature + '\'' +
                ", controlVoltage='" + controlVoltage + '\'' +
                ", dcBusCurrent='" + dcBusCurrent + '\'' +
                ", index=" + index +
                '}';
    }
}
