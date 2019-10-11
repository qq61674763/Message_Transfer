package com.xljt.service;

import com.xljt.pojo.MessagePowerVoltagePojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU
 * @version : 1.0
 * @description : IMessagePowerVoltageTransform 可充能电储能装置电压数据解析
 * @date : 2019/9/17 14:33
 */
public interface IMessagePowerVoltageTransform {
    MessagePowerVoltagePojo getMessagePowerVoltage(String oldMessage, int index);
}
