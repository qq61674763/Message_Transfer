package com.xljt.service;

import com.xljt.pojo.MessageCarPojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU
 * @version : 1.0
 * @description : IMessageCarTransform 整车数据
 * @date : 2019/9/16 14:46
 */
public interface IMessageCarTransform  {
    MessageCarPojo getMessageCar(String oldMessage,int index);
}
