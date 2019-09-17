package com.xljt.service.transformImpl;

import com.xljt.pojo.MessageHeaderPojo;
import com.xljt.service.IMessageHeaderTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageHeaderTransform <br>
 * @date : 2019/9/12 16:28 <br>
 */
@Service
public class MessageHeaderTransformImpl implements IMessageHeaderTransform, Serializable {

    @Autowired
    private MessageHeaderPojo messageHeaderPojo;

    /**
     * 将原始报文解析，此处只解析头部和主体数据
     *
     * @param oldMessage 原始完整报文
     * @return
     */
    @Override
    public MessageHeaderPojo getMessageHeader(String oldMessage) {

        //报文总长度
        messageHeaderPojo.setMessageLength(String.valueOf(oldMessage.length() / 2));
        int index = 0;
        //起始符
        messageHeaderPojo.setHeaderFirst("##");
        index += 4;
        //命令单元
        messageHeaderPojo.setOrderTopic(oldMessage.substring(index, index + 2));
        index += 2;
        //应答标志
        messageHeaderPojo.setAnswerTag(oldMessage.substring(index, index + 2));
        index += 2;
        //VIN
        messageHeaderPojo.setVin(MessageFormat.numberToString(oldMessage.substring(index, index + 34)));
        index += 34;
        //数据单元加密方式
        messageHeaderPojo.setEncryptionType(oldMessage.substring(index, index + 2));
        index += 2;
        //数据单元长度
        messageHeaderPojo.setDataUnitLength(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        //年
        messageHeaderPojo.setYear(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //月
        messageHeaderPojo.setMonth(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //日
        messageHeaderPojo.setDay(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //时
        messageHeaderPojo.setHour(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //分
        messageHeaderPojo.setMinute(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //秒
        messageHeaderPojo.setSecond(MessageFormat.numberToInt(oldMessage.substring(index, index + 2)));
        index += 2;
        //单元类型
        messageHeaderPojo.setDataUnitType(oldMessage.substring(index, index + 2));
        index += 2;
        messageHeaderPojo.setIndex(index);
        return messageHeaderPojo;
    }

}
