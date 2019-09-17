package com.xljt.service;

import com.xljt.pojo.MessageDrivingMotorPojo;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessageDrivingMotorTransform <br>
 * @date : 2019/9/16 15:58 <br>
 */
public interface IMessageDrivingMotorTransform {
    MessageDrivingMotorPojo getMessageDrivingMotor(String oldMessage,int index);
}
