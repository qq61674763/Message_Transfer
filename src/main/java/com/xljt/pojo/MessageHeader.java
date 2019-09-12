package com.xljt.pojo;

import java.io.Serializable;
import java.util.Map;

/**
 * @author : XU
 * @version : 1.0
 * @description :MessageHeader
 * @date : 2019/9/12 10:23
 */
public class MessageHeader implements Serializable {

    private String headerFirst;
    private String orderTopic;
    private String vin;
    private String encryptionType;
    private String messageLength;
    private Map<Integer,String> messageType;
    private String messageTime;

    public String getHeaderFirst(int a,int b) {
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

    public Map<Integer, String> getMessageType() {
        return messageType;
    }

    public void setMessageType(Map<Integer, String> messageType) {
        this.messageType = messageType;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }
}
