package com.xljt.service;

import com.xljt.pojo.MessagePowerTemperaturePojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU
 * @version : 1.0
 * @description : IMessagePowerTemperatureTransform 可充能电储能温度数据
 * @date : 2019/9/17 13:25
 */
public interface IMessagePowerTemperatureTransform {
    MessagePowerTemperaturePojo getMessagePower(String oldMessage, int index);
}
