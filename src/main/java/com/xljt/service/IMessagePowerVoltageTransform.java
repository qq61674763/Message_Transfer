package com.xljt.service;

import com.xljt.pojo.MessagePowerVoltagePojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessagePowerVoltageTransform <br>
 * @date : 2019/9/17 14:33 <br>
 */
public interface IMessagePowerVoltageTransform {
    MessagePowerVoltagePojo getMessagePowerVoltage(String oldMessage, int index);
}
