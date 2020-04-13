package com.xljt.service.transformImpl;

import com.xljt.pojo.*;
import com.xljt.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

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
    @Autowired
    private IMessageCarTransform messageCarTransform;
    @Autowired
    private IMessageLocationTransform messageLocationTransform;
    @Autowired
    private IMessageDrivingMotorTransform messageDrivingMotorTransform;
    @Autowired
    private IMessageExtremumTransform messageExtremumTransform;
    @Autowired
    private IMessageWarningTransform messageWarningTransform;
    @Autowired
    private IMessagePowerVoltageTransform messagePowerVoltageTransform;
    @Autowired
    private IMessagePowerTemperatureTransform messagePowerTemperatureTransform;
    @Autowired
    private IMessageCustomizeTransform messageCustomizeTransform;

    private static final String carMessage = "01";
    private static final String drivingMotorMessage = "02";
    private static final String locationMessage = "05";
    private static final String extremumMessage = "06";
    private static final String warningMessage = "07";
    private static final String powerVoltageMessage = "08";
    private static final String powerTemperatureMessage = "09";
    private static final String customMessage = "80";


    @Override
    public String getNewMessage(String oldMessage) {
        MessageCarPojo messageCar = null;
        MessageDrivingMotorPojo messageDrivingMotor = null;
        MessageLocationPojo messageLocation = null;
        MessageExtremumPojo messageExtremum = null;
        MessageWarningPojo messageWarning = null;
        MessagePowerVoltagePojo messagePowerVoltage = null;
        MessagePowerTemperaturePojo messagePowerTemperature = null;
        MessageCustomizePojo messageCustomize = null;
        MessageHeaderPojo messageHeader = null;

        StringBuilder newMessage = new StringBuilder();
        int index = 0;
        //解析头部数据
        messageHeader = messageHeaderTransform.getMessageHeader(oldMessage);
        index = messageHeader.getIndex();
        int maxLength = oldMessage.length();

        while (index < oldMessage.length() - 2) {
            String messageType = oldMessage.substring(index, index + 2);
            if (carMessage.equals(messageType)) {
                messageCar = messageCarTransform.getMessageCar(oldMessage, index + 2);
                index = messageCar.getIndex();
            } else if (drivingMotorMessage.equals(messageType)) {
                messageDrivingMotor = messageDrivingMotorTransform.getMessageDrivingMotor(oldMessage, index + 2);
                index = messageDrivingMotor.getIndex();
            } else if (locationMessage.equals(messageType)) {
                messageLocation = messageLocationTransform.getMessageLocation(oldMessage, index + 2);
                index = messageLocation.getIndex();
            } else if (extremumMessage.equals(messageType)) {
                messageExtremum = messageExtremumTransform.getMessageExtremum(oldMessage, index + 2);
                index = messageExtremum.getIndex();
            } else if (warningMessage.equals(messageType)) {
                messageWarning = messageWarningTransform.getMessageWarning(oldMessage, index + 2);
                index = messageWarning.getIndex();
            } else if (powerVoltageMessage.equals(messageType)) {
                messagePowerVoltage = messagePowerVoltageTransform.getMessagePowerVoltage(oldMessage, index + 2);
                index = messagePowerVoltage.getIndex();
            } else if (powerTemperatureMessage.equals(messageType)) {
                messagePowerTemperature = messagePowerTemperatureTransform.getMessagePower(oldMessage, index + 2);
                index = messagePowerTemperature.getIndex();
            } else if (customMessage.equals(messageType)) {
                messageCustomize = messageCustomizeTransform.getMessageCustomize(oldMessage, index + 2);
                index = messageCustomize.getIndex();
            }
            System.out.println(index);
        }
        return String.valueOf(newMessage);
    }

    private void transformAll(String message, int index) {


    }
}
