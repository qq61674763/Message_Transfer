package com.xljt.service.transformImpl;

import com.xljt.pojo.MessagePowerTemperaturePojo;
import com.xljt.service.IMessagePowerTemperatureTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : messagePowerTransformImpl <br>
 * @date : 2019/9/17 13:33 <br>
 */
@Service
public class MessagePowerTemperatureTemperatureTransformImpl implements IMessagePowerTemperatureTransform, Serializable {
    @Autowired
    MessagePowerTemperaturePojo messagePowerTemperature;

    @Override
    public MessagePowerTemperaturePojo getMessagePower(String oldMessage, int index) {
        //可充电储能子系统个数
        messagePowerTemperature.setPowerTemperatureSystemNumber(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //可充电储能子系统号
        messagePowerTemperature.setPowerTemperatureSystemIndex(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //可充电储能温度探针个数
        messagePowerTemperature.setProbeNumber(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        //可充电储能子系统各温度探针检测到的温度值
        Map<Integer, String> probeTemperatures = new HashMap<>();
        for (int i = 0; i < Integer.valueOf(messagePowerTemperature.getProbeNumber()); i++) {
            probeTemperatures.put(i + 1, String.valueOf(Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 2))) - 40));
            index =index + 2;
        }
        messagePowerTemperature.setProbeTemperature(probeTemperatures);

        messagePowerTemperature.setIndex(index);

        //偏移量
        return messagePowerTemperature;
    }
}
