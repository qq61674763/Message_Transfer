package com.xljt.service.transformImpl;

import com.xljt.pojo.MessageWarningPojo;
import com.xljt.service.IMessageWarningTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageWarningTransformImol <br>
 * @date : 2019/9/17 10:14 <br>
 */
@Service
public class MessageWarningTransformImpl implements IMessageWarningTransform, Serializable {

    @Autowired
    private MessageWarningPojo messageWarning;

    @Override
    public MessageWarningPojo getMessageWarning(String oldMessage, int index) {
        //最高报警等级
        messageWarning.setWarningRank(oldMessage.substring(index, index + 2));
        index += 2;
        //通用报警标志
        messageWarning.setWarningTag(oldMessage.substring(index, index + 8));
        index += 8;
        //可充电储能装置故障总数N1
        Integer n1 = Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        messageWarning.setPowerErrorNumberN1(String.valueOf(n1));
        index += 2;
        if (n1 != 0) {
            //可充电储能装置故障代码列表
            messageWarning.setPowerErrorCode(oldMessage.substring(index, index + (4 * n1)));
            index = index + (4 * n1);
        }
        //驱动电机故障总数N2
        Integer n2 = Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        messageWarning.setMotorErrorNumberN2(String.valueOf(n2));
        index += 2;
        if (n2 != 0) {
            //驱动电机故障代码列表
            messageWarning.setMotorErrorCode(oldMessage.substring(index, index + (4 * n2)));
            index = index + (4 * n2);
        }
        //发动机故障总数N3
        Integer n3 = Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        messageWarning.setEngineErrorNumberN3(String.valueOf(n3));
        index += 2;
        if (n3 != 0) {
            //发动机故障列表
            messageWarning.setEngineErrorCode(oldMessage.substring(index, index + (4 * n3)));
            index += 4 * n3;
        }
        //其他故障列表总数n4
        Integer n4 = Integer.valueOf(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        messageWarning.setOtherErrorNumberN4(String.valueOf(n4));
        index += 2;
        if (n4 != 0) {
            //其他故障代码列表
            messageWarning.setOtherErrorCode(oldMessage.substring(index, index + (4 * n4)));
            index += 4 * n4;
        }
        messageWarning.setIndex(index);
        return messageWarning;
    }
}
