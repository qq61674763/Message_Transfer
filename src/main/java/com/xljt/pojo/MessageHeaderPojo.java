package com.xljt.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author : XU
 * @version : 1.0
 * @description :MessageHeader
 * @date : 2019/9/12 10:23
 */
@Component
public class MessageHeaderPojo implements Serializable {


    /**
     * 报文长度
     */
    private String messageLength;
    /**
     * 起始符
     */
    private String headerFirst;
    /**
     * 命令单元
     */
    private String orderTopic;
    /**
     * 应答标志符
     */
    private String answerTag;
    /**
     * VIN码
     */
    private String vin;
    /**
     * 加密方式
     */
    private String encryptionType;
    /**
     * 数据单元长度
     */
    private String dataUnitLength;
    /**
     * 年
     */
    private String year;
    /**
     * 月
     */
    private String month;
    /**
     * 日
     */
    private String day;
    /**
     * 时
     */
    private String hour;
    /**
     * 分
     */
    private String minute;
    /**
     * 秒
     */
    private String second;
    /**
     * 数据信息类型
     */
    private String dataUnitType;
    /**
     * 偏移量
     */
    private int index;

    public String getDataUnitLength() {
        return dataUnitLength;
    }

    public void setDataUnitLength(String dataUnitLength) {
        this.dataUnitLength = dataUnitLength;
    }

    public String getAnswerTag() {
        return answerTag;
    }

    public void setAnswerTag(String answerTag) {
        this.answerTag = answerTag;
    }

    public String getHeaderFirst() {
        return headerFirst;
    }

    public void setHeaderFirst(String headerFirst) {
        this.headerFirst = headerFirst;
    }

    public String getOrderTopic() {
        return orderTopic;
    }

    public void setOrderTopic(String orderTopic) {
        this.orderTopic = orderTopic;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public String getMessageLength() {
        return messageLength;
    }

    public void setMessageLength(String messageLength) {
        this.messageLength = messageLength;
    }

    public String getDataUnitType() {
        return dataUnitType;
    }

    public void setDataUnitType(String dataUnitType) {
        this.dataUnitType = dataUnitType;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MessageHeaderPojo{" +
                "messageLength='" + messageLength + '\'' +
                ", headerFirst='" + headerFirst + '\'' +
                ", orderTopic='" + orderTopic + '\'' +
                ", answerTag='" + answerTag + '\'' +
                ", vin='" + vin + '\'' +
                ", encryptionType='" + encryptionType + '\'' +
                ", dataUnitLength='" + dataUnitLength + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", hour='" + hour + '\'' +
                ", minute='" + minute + '\'' +
                ", second='" + second + '\'' +
                ", dataUnitType='" + dataUnitType + '\'' +
                ", index=" + index +
                '}';
    }
}
