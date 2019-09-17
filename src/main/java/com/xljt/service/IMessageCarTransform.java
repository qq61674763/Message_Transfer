package com.xljt.service;

import com.xljt.pojo.MessageCarPojo;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessageCarTransform <br>
 * @date : 2019/9/16 14:46 <br>
 */
public interface IMessageCarTransform  {
    MessageCarPojo getMessageCar(String oldMessage,int index);
}
