package com.xljt.service;

import com.xljt.pojo.MessageExtremumPojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU
 * @version : 1.0
 * @description : IMessageExtremumTransform 极值转换
 * @date : 2019/9/17 15:04
 */
public interface IMessageExtremumTransform {
    MessageExtremumPojo getMessageExtremum(String oldMessage, int index);
}
