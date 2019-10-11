package com.xljt.service;

import com.xljt.pojo.MessageAllInfo;
import org.springframework.stereotype.Service;

/**
 * @author : XU
 * @version : 1.0
 * @description : IMessageAllTransform 所有消息解析
 * @date : 2019/9/17 16:34
 */
public interface IMessageAllTransform {
    MessageAllInfo getNewMessage(String oldMessage);
}
