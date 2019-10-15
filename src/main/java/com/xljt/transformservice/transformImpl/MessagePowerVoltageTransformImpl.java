package com.xljt.transformservice.transformImpl;

import com.xljt.pojo.MessagePowerVoltagePojo;
import com.xljt.transformservice.IMessagePowerVoltageTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : XU
 * @version : 1.0
 * @description : MessagePowerVoltageTransformImpl
 * @date : 2019/9/17 14:34
 */
@Service
public class MessagePowerVoltageTransformImpl implements IMessagePowerVoltageTransform {

    @Autowired
    MessagePowerVoltagePojo messagePowerVoltage;

    @Override
    public MessagePowerVoltagePojo getMessagePowerVoltage(String oldMessage, int index) {
        //可充电储能子系统个数
        messagePowerVoltage.setPowerVoltageSystemNumber(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //可充电储能子系统号
        messagePowerVoltage.setPowerVoltageSystemIndex(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //可充电储能装置电压
        messagePowerVoltage.setPowerVoltage(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        //可充电储能装置电流
        messagePowerVoltage.setPowerCurrent(String.valueOf(Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)))-10000));
        index += 4;
        //单体电池总数
        messagePowerVoltage.setSinglePowerNumber(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        //本帧起始电池序号
        messagePowerVoltage.setStartPowerIndex(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        //本帧单体电池总数
        messagePowerVoltage.setFramePowerNumber(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //单体电池电压
        Map<Integer, String> singePowerVoltages = new HashMap<>();
        for (int i = 0; i < Integer.valueOf(messagePowerVoltage.getFramePowerNumber()); i++) {
            singePowerVoltages.put(i + 1, MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
            index += 4;
        }
        messagePowerVoltage.setSingePowerVoltages(singePowerVoltages);

        messagePowerVoltage.setIndex(index);

        return messagePowerVoltage;
    }
}
