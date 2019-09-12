package com.xljt.service.transformImpl;

import com.xljt.pojo.MessageHeaderPojo;
import com.xljt.service.IMessageHeaderTransform;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageHeaderTransform <br>
 * @date : 2019/9/12 16:28 <br>
 */
public class MessageHeaderTransform implements IMessageHeaderTransform, Serializable {

    @Autowired
    private MessageHeaderPojo messageHeaderPojo;

    /**
     * 将原始报文解析，此处只解析头部和主体数据
     *
     * @param oldMessage 原始完整报文
     * @return
     */
    @Override
    public MessageHeaderPojo getMessage(String oldMessage) {

        //
        messageHeaderPojo.setMessageLength(String.valueOf(oldMessage.length()));

        int index = 0;
        //起始符
        messageHeaderPojo.setHeaderFirst("##");
        index += 4;
        //命令单元
        oldMessage.substring(index,index+2);
        //应答标志
        //VIN
        //数据单元加密方式
        //数据单元长度

        return null;
    }

}
