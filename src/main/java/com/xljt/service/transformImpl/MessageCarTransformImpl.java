package com.xljt.service.transformImpl;

import com.xljt.pojo.MessageCarPojo;
import com.xljt.service.IMessageCarTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageCarTransformIml <br>
 * @date : 2019/9/16 14:48 <br>
 */
@Service
public class MessageCarTransformImpl implements IMessageCarTransform, Serializable {

    @Autowired
    MessageCarPojo messageCarPojo;

    @Override
    public MessageCarPojo getMessageCar(String oldMessage, int index) {
        //车辆状态
        messageCarPojo.setCarStatus(oldMessage.substring(index, index + 2));
        index += 2;
        //充电状态
        messageCarPojo.setPowerStatus(oldMessage.substring(index, index + 2));
        index += 2;
        //运行模式
        messageCarPojo.setRunType(oldMessage.substring(index, index + 2));
        index += 2;
        //车速
        messageCarPojo.setSpeed(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        //累计里程
        messageCarPojo.setMileage(MessageFormat.numberToInt(oldMessage.substring(index, index + 8)));
        index += 8;
        //总电压
        messageCarPojo.setTotalVoltage(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        //总电流
        messageCarPojo.setTotalCurrent(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        //SOC
        messageCarPojo.setSoc(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //DC-DC状态
        messageCarPojo.setDcStatus(oldMessage.substring(index, index + 2));
        index += 2;
        //档位
        messageCarPojo.setGear(oldMessage.substring(index, index + 2));
        index += 2;
        //绝缘电阻
        messageCarPojo.setInsulationResistance(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //预留
        messageCarPojo.setReserved(oldMessage.substring(index, index + 2));
        index += 2;
        //偏移量
        messageCarPojo.setIndex(index);

        return messageCarPojo;
    }
}
