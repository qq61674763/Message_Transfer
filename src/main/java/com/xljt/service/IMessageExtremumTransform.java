package com.xljt.service;

import com.xljt.pojo.MessageExtremumPojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessageExtremumTransform <br>
 * @date : 2019/9/17 15:04 <br>
 */
public interface IMessageExtremumTransform {
    MessageExtremumPojo getMessageExtremum(String oldMessage, int index);
}
