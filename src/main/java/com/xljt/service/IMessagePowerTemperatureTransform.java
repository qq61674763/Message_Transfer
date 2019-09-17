package com.xljt.service;

import com.xljt.pojo.MessagePowerTemperaturePojo;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessagePowerTemperatureTransform <br>
 * @date : 2019/9/17 13:25 <br>
 */
public interface IMessagePowerTemperatureTransform {
    MessagePowerTemperaturePojo getMessagePower(String oldMessage, int index);
}
