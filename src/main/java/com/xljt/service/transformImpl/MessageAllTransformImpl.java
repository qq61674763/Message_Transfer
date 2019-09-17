package com.xljt.service.transformImpl;

import com.xljt.pojo.MessageHeaderPojo;
import com.xljt.service.IMessageAllTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageAllTransformImpl <br>
 * @date : 2019/9/17 16:36 <br>
 */
@Service
public class MessageAllTransformImpl implements IMessageAllTransform {

    @Autowired
    private MessageHeaderTransformImpl messageHeaderTransform;

    @Override
    public String getNewMessage(String oldMessage) {

        StringBuilder newMessage = new StringBuilder();
        //解析头部数据
        MessageHeaderPojo messageHeader = messageHeaderTransform.getMessageHeader(oldMessage);

        return String.valueOf(newMessage);
    }
}
