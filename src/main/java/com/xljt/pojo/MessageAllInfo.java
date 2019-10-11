package com.xljt.pojo;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @program: messagetransfer
 * @description: 所有消息
 * @author: xu
 * @date: 2019-10-11 13:36
 **/
@Component
public class MessageAllInfo {

    private MessageHeaderPojo messageHeaderpojo;
    private MessageCarPojo messageCarPojo;
    private MessageDrivingMotorPojo messageDrivingMotorPojo;
    private MessageLocationPojo messageLocationPojo;
    private MessageCustomizePojo messageCustomizePojo;
    private MessageExtremumPojo messageExtremumPojo;
    private MessageWarningPojo messageWarningPojo;
    private MessagePowerVoltagePojo messagePowerVoltagePojo;
    private MessagePowerTemperaturePojo messagePowerTemperaturePojo;
    public HashMap<Integer, String> messageMap;

    public MessageHeaderPojo getMessageHeaderpojo() {
        return messageHeaderpojo;
    }

    public void setMessageHeaderpojo(MessageHeaderPojo messageHeaderpojo) {
        this.messageHeaderpojo = messageHeaderpojo;
    }

    public MessageCarPojo getMessageCarPojo() {
        return messageCarPojo;
    }

    public void setMessageCarPojo(MessageCarPojo messageCarPojo) {
        this.messageCarPojo = messageCarPojo;
    }

    public MessageDrivingMotorPojo getMessageDrivingMotorPojo() {
        return messageDrivingMotorPojo;
    }

    public void setMessageDrivingMotorPojo(MessageDrivingMotorPojo messageDrivingMotorPojo) {
        this.messageDrivingMotorPojo = messageDrivingMotorPojo;
    }

    public MessageLocationPojo getMessageLocationPojo() {
        return messageLocationPojo;
    }

    public void setMessageLocationPojo(MessageLocationPojo messageLocationPojo) {
        this.messageLocationPojo = messageLocationPojo;
    }

    public MessageCustomizePojo getMessageCustomizePojo() {
        return messageCustomizePojo;
    }

    public void setMessageCustomizePojo(MessageCustomizePojo messageCustomizePojo) {
        this.messageCustomizePojo = messageCustomizePojo;
    }

    public MessageExtremumPojo getMessageExtremumPojo() {
        return messageExtremumPojo;
    }

    public void setMessageExtremumPojo(MessageExtremumPojo messageExtremumPojo) {
        this.messageExtremumPojo = messageExtremumPojo;
    }

    public MessageWarningPojo getMessageWarningPojo() {
        return messageWarningPojo;
    }

    public void setMessageWarningPojo(MessageWarningPojo messageWarningPojo) {
        this.messageWarningPojo = messageWarningPojo;
    }

    public MessagePowerVoltagePojo getMessagePowerVoltagePojo() {
        return messagePowerVoltagePojo;
    }

    public void setMessagePowerVoltagePojo(MessagePowerVoltagePojo messagePowerVoltagePojo) {
        this.messagePowerVoltagePojo = messagePowerVoltagePojo;
    }

    public MessagePowerTemperaturePojo getMessagePowerTemperaturePojo() {
        return messagePowerTemperaturePojo;
    }

    public void setMessagePowerTemperaturePojo(MessagePowerTemperaturePojo messagePowerTemperaturePojo) {
        this.messagePowerTemperaturePojo = messagePowerTemperaturePojo;
    }

    public HashMap<Integer, String> getMessageMap() {
        return messageMap;
    }

    public void setMessageMap(HashMap<Integer, String> messageMap) {
        this.messageMap = messageMap;
    }

    @Override
    public String toString() {
        return "MessageAllInfo{" +
                "messageHeaderpojo=" + messageHeaderpojo +
                ", messageCarPojo=" + messageCarPojo +
                ", messageDrivingMotorPojo=" + messageDrivingMotorPojo +
                ", messageLocationPojo=" + messageLocationPojo +
                ", messageCustomizePojo=" + messageCustomizePojo +
                ", messageExtremumPojo=" + messageExtremumPojo +
                ", messageWarningPojo=" + messageWarningPojo +
                ", messagePowerVoltagePojo=" + messagePowerVoltagePojo +
                ", messagePowerTemperaturePojo=" + messagePowerTemperaturePojo +
                ", messageMap=" + messageMap +
                '}';
    }
}
