package com.xljt.service;

import org.springframework.stereotype.Service;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessageAllTransform <br>
 * @date : 2019/9/17 16:34 <br>
 */
public interface IMessageAllTransform {
    String getNewMessage(String oldMessage);
}
