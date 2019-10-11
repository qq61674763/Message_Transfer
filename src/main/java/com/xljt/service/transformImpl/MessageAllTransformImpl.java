package com.xljt.service.transformImpl;

import com.sun.tools.corba.se.idl.constExpr.Equal;
import com.xljt.pojo.*;
import com.xljt.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author : XU
 * @version : 1.0
 * @description : MessageAllTransformImpl
 * @date : 2019/9/17 16:36
 */
@Service
public class MessageAllTransformImpl implements IMessageAllTransform {

    @Autowired
    private IMessageHeaderTransform messageHeaderTransform;
    /**
     * 整车数据解析
     */
    @Autowired
    IMessageCarTransform iMessageCarTransform;
    /**
     * 自定义数据解析
     */
    @Autowired
    IMessageCustomizeTransform iMessageCustomizeTransform;
    /**
     * 驱动电机数据解析
     */
    @Autowired
    IMessageDrivingMotorTransform iMessageDrivingMotorTransform;
    /**
     * 极值转换数据解析
     */
    @Autowired
    IMessageExtremumTransform iMessageExtremumTransform;
    /**
     * 车辆位置数据解析
     */
    @Autowired
    IMessageLocationTransform iMessageLocationTransform;
    /**
     * 可充能电储能温度数据
     */
    @Autowired
    IMessagePowerTemperatureTransform iMessagePowerTemperatureTransform;
    /**
     * 可充能电储能装置电压数据解析
     */
    @Autowired
    IMessagePowerVoltageTransform iMessagePowerVoltageTransform;
    /**
     * 车辆报警数据解析
     */
    @Autowired
    IMessageWarningTransform iMessageWarningTransform;
    /**
     * 所有消息
     */
    @Autowired
    MessageAllInfo messageAllInfo;

    private int index = 0;

    private int typeIndex = 0;

    private HashMap<Integer, String> messageMap;

    @Override
    public MessageAllInfo getNewMessage(String oldMessage) {

        StringBuilder newMessage = new StringBuilder();
        messageMap = new HashMap<Integer, String>();

        //解析头部数据
        messageAllInfo.setMessageHeaderpojo(messageHeaderTransform.getMessageHeader(oldMessage));
        messageMap.put(typeIndex++, "header");
        index = messageAllInfo.getMessageHeaderpojo().getIndex();

        for (int i = index; i < Integer.valueOf(messageAllInfo.getMessageHeaderpojo().getMessageLength()) * 2 - 2;
             i = index) {
            getTransferInfo(oldMessage);
        }
        messageAllInfo.setMessageMap(messageMap);

        System.out.println(messageAllInfo.getMessageMap());
        return messageAllInfo;
    }

    public void getTransferInfo(String message) {
        String infoType = message.substring(index, index + 2);
        index += 2;
        if ("01".equals(infoType)) {
            System.out.println("type001");
            messageAllInfo.setMessageCarPojo(iMessageCarTransform.getMessageCar(message, index));
            index = messageAllInfo.getMessageCarPojo().getIndex();

            messageMap.put(typeIndex++, "01");
            return;
        }
        if ("02".equals(infoType)) {
            System.out.println("type002");
            messageAllInfo.setMessageDrivingMotorPojo(iMessageDrivingMotorTransform.getMessageDrivingMotor(message, index));
            index = messageAllInfo.getMessageDrivingMotorPojo().getIndex();

            messageMap.put(typeIndex++, "02");

            return;
        }
        if ("05".equals(infoType)) {
            System.out.println("type005");
            messageAllInfo.setMessageLocationPojo(iMessageLocationTransform.getMessageLocation(message, index));
            index = messageAllInfo.getMessageLocationPojo().getIndex();

            messageMap.put(typeIndex++, "05");
            return;
        }
        if ("06".equals(infoType)) {
            System.out.println("type006");
            messageAllInfo.setMessageExtremumPojo(iMessageExtremumTransform.getMessageExtremum(message, index));
            index = messageAllInfo.getMessageExtremumPojo().getIndex();

            messageMap.put(typeIndex++, "06");
            return;
        }
        if ("07".equals(infoType)) {
            System.out.println("type007");
            messageAllInfo.setMessageWarningPojo(iMessageWarningTransform.getMessageWarning(message, index));
            index = messageAllInfo.getMessageWarningPojo().getIndex();

            messageMap.put(typeIndex++, "07");
            return;
        }
        if ("08".equals(infoType)) {
            System.out.println("type008");
            messageAllInfo.setMessagePowerVoltagePojo(iMessagePowerVoltageTransform.getMessagePowerVoltage(message, index));
            index = messageAllInfo.getMessagePowerVoltagePojo().getIndex();

            messageMap.put(typeIndex++, "08");
            return;
        }
        if ("09".equals(infoType)) {
            System.out.println("type009");
            messageAllInfo.setMessagePowerTemperaturePojo(iMessagePowerTemperatureTransform.getMessagePower(message, index));
            index = messageAllInfo.getMessagePowerTemperaturePojo().getIndex();

            messageMap.put(typeIndex++, "09");
            return;
        }
        {
            System.out.println("type000");
            messageAllInfo.setMessageCustomizePojo(iMessageCustomizeTransform.getMessageCustomize(message, index));
            index = messageAllInfo.getMessageCustomizePojo().getIndex();

            messageMap.put(typeIndex++, "80");
            return;
        }
    }
}
