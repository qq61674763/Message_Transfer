package com.xljt.service;

import com.xljt.pojo.MessageDrivingMotorPojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU
 * @version : 1.0
 * @description : IMessageDrivingMotorTransform 驱动电机
 * @date : 2019/9/16 15:58
 */
public interface IMessageDrivingMotorTransform {
    MessageDrivingMotorPojo getMessageDrivingMotor(String oldMessage,int index);
}
