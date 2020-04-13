package com.xljt.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageWarningPojo <br>
 * @date : 2019/9/17 9:58 <br>
 */
@Component
public class MessageWarningPojo {
    /**
     * 最高报警等级
     */
    private String warningRank;
    /**
     *通用报警等级
     */
    private String warningTag;
    /**
     *可充电储能装置故障总数N1
     */
    private String powerErrorNumberN1;
    /**
     *可充电储能装置故障代码列表
     */
    private String powerErrorCode;
    /**
     *驱动电机故障总数N2
     */
    private String motorErrorNumberN2;
    /**
     *驱动电机故障代码列表
     */
    private String motorErrorCode;
    /**
     *发动机故障总数N3
     */
    private String engineErrorNumberN3;
    /**
     *发动机故障列表
     */
    private String engineErrorCode;
    /**
     *其他故障总数N4
     */
    private String otherErrorNumberN4;
    /**
     *其他故障代码列表
     */
    private String otherErrorCode;
    /**
     *偏移量
     */
    private int index;

    public String getWarningRank() {
        return warningRank;
    }

    public void setWarningRank(String warningRank) {
        this.warningRank = warningRank;
    }

    public String getWarningTag() {
        return warningTag;
    }

    public void setWarningTag(String warningTag) {
        this.warningTag = warningTag;
    }

    public String getPowerErrorNumberN1() {
        return powerErrorNumberN1;
    }

    public void setPowerErrorNumberN1(String powerErrorNumberN1) {
        this.powerErrorNumberN1 = powerErrorNumberN1;
    }

    public String getPowerErrorCode() {
        return powerErrorCode;
    }

    public void setPowerErrorCode(String powerErrorCode) {
        this.powerErrorCode = powerErrorCode;
    }

    public String getMotorErrorNumberN2() {
        return motorErrorNumberN2;
    }

    public void setMotorErrorNumberN2(String motorErrorNumberN2) {
        this.motorErrorNumberN2 = motorErrorNumberN2;
    }

    public String getMotorErrorCode() {
        return motorErrorCode;
    }

    public void setMotorErrorCode(String motorErrorCode) {
        this.motorErrorCode = motorErrorCode;
    }

    public String getEngineErrorNumberN3() {
        return engineErrorNumberN3;
    }

    public void setEngineErrorNumberN3(String engineErrorNumberN3) {
        this.engineErrorNumberN3 = engineErrorNumberN3;
    }

    public String getEngineErrorCode() {
        return engineErrorCode;
    }

    public void setEngineErrorCode(String engineErrorCode) {
        this.engineErrorCode = engineErrorCode;
    }

    public String getOtherErrorNumberN4() {
        return otherErrorNumberN4;
    }

    public void setOtherErrorNumberN4(String otherErrorNumberN4) {
        this.otherErrorNumberN4 = otherErrorNumberN4;
    }

    public String getOtherErrorCode() {
        return otherErrorCode;
    }

    public void setOtherErrorCode(String otherErrorCode) {
        this.otherErrorCode = otherErrorCode;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MessageWarningPojo{" +
                "warningRank='" + warningRank + '\'' +
                ", warningTag='" + warningTag + '\'' +
                ", powerErrorNumberN1='" + powerErrorNumberN1 + '\'' +
                ", powerErrorCode='" + powerErrorCode + '\'' +
                ", motorErrorNumberN2='" + motorErrorNumberN2 + '\'' +
                ", motorErrorCode='" + motorErrorCode + '\'' +
                ", engineErrorNumberN3='" + engineErrorNumberN3 + '\'' +
                ", engineErrorCode='" + engineErrorCode + '\'' +
                ", otherErrorNumberN4='" + otherErrorNumberN4 + '\'' +
                ", otherErrorCode='" + otherErrorCode + '\'' +
                ", index=" + index +
                '}';
    }
}