package com.xljt.transformservice.transformImpl;

import com.xljt.pojo.MessageDrivingMotorPojo;
import com.xljt.transformservice.IMessageDrivingMotorTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author : XU
 * @version : 1.0
 * @description : MessageDrivingMotorTransformImpl
 * @date : 2019/9/16 16:00
 */
@Service
public class MessageDrivingMotorTransformImpl implements IMessageDrivingMotorTransform, Serializable {

    @Autowired
    private MessageDrivingMotorPojo messageDrivingMotor;

    @Override
    public MessageDrivingMotorPojo getMessageDrivingMotor(String oldMessage, int index) {

        //驱动电机个数
        messageDrivingMotor.setMotorNumber(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index+=2;
        //驱动电机序号
        messageDrivingMotor.setMotorIndex(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index+=2;
        //驱动电机状态
        messageDrivingMotor.setMotorStatus(oldMessage.substring(index,index+2));
        index+=2;
        //驱动电机控制温度
        int controlTemperature = Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 2))) - 40;
        messageDrivingMotor.setControlTemperature(String.valueOf(controlTemperature));
        index+=2;
        //驱动电机转速
        int rotatingSpeed = Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 4))) - 20000;
        messageDrivingMotor.setRotatingSpeed(String.valueOf(rotatingSpeed));
        index+=4;
        //驱动电机转矩
        int torque = Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 4))) - 20000;
        messageDrivingMotor.setTorque(String.valueOf(torque));
        index+=4;
        //驱动电机温度
        int temperature = Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 2))) - 40;
        messageDrivingMotor.setTemperature(String.valueOf(temperature));
        index+=2;
        //电机控制器输入电压
        messageDrivingMotor.setControlVoltage(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index+=4;
        //电机控制器直流母线电流
        int dcBusCurrent = Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 4))) - 10000;
        messageDrivingMotor.setDcBusCurrent(String.valueOf(dcBusCurrent));
        index+=4;
        //偏移量
        //驱动电机个数
        messageDrivingMotor.setIndex(index);

        return messageDrivingMotor;
    }
}
