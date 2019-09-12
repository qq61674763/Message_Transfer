package com.xljt.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

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
    private String dataTopicLength;
    /**
     * 数据信息类型
     */
    private Map<Integer, String> messageType;


    public String getDataTopicLength() {
        return dataTopicLength;
    }

    public void setDataTopicLength(String dataTopicLength) {
        this.dataTopicLength = dataTopicLength;
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

    public Map<Integer, String> getMessageType() {
        return messageType;
    }

    public void setMessageType(Map<Integer, String> messageType) {
        this.messageType = messageType;
    }

}
