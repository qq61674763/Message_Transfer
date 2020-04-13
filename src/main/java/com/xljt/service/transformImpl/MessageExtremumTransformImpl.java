package com.xljt.service.transformImpl;

import com.xljt.pojo.MessageExtremumPojo;
import com.xljt.service.IMessageExtremumTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageExtremumTransformImpl <br>
 * @date : 2019/9/17 15:23 <br>
 */
@Service
public class MessageExtremumTransformImpl implements IMessageExtremumTransform {

    @Autowired
    MessageExtremumPojo messageExtremum;

    @Override
    public MessageExtremumPojo getMessageExtremum(String oldMessage, int index) {

        //最高电压电池子系统号
        messageExtremum.setHighestVoltageBatterySystemIndx(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;

        // 最高电压电池单体代号
        String substring = oldMessage.substring(index, index + 2);
        messageExtremum.setHighestVoltageBatterySystemCode(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        // 电池单体电压最高值
        messageExtremum.setHighestBatterySingleVoltage(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        // 最低电压电池子系统号
        messageExtremum.setLowestVoltageBatterySystemIndx(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        // 最低电压电池单体代号
        messageExtremum.setLowestVoltageBatterySystemCode(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        // 电池单体电压最低值
        messageExtremum.setLowestBatterySingleVoltage(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        // 最高温度子系统号
        messageExtremum.setHighestTemperatureSystemIndex(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        // 最高温度探针序号
        messageExtremum.setHighestTemperatureProbeIndex(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        // 最高温度值
        messageExtremum.setHighestTemperature(String.valueOf(Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)))-40));
        index += 2;
        // 最低温度子系统号
        messageExtremum.setLowestTemperatureSystemIndex(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        // 最低温度探针序号
        messageExtremum.setLowestTemperatureSProbeIndex(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        // 最低温度值
        messageExtremum.setLowestTemperature(String.valueOf(Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)))-40));
        index += 2;
        // 偏移量
        messageExtremum.setIndex(index);

        return messageExtremum;
    }
}
