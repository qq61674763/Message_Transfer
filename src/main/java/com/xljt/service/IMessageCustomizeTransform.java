package com.xljt.service;

import com.xljt.pojo.MessageCustomizePojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU
 * @version : 1.0
 * @description : IMessageCustomizeTransform 自定义转换
 * @date : 2019/9/17 16:02
 */
public interface IMessageCustomizeTransform {
    MessageCustomizePojo getMessageCustomize(String oldMessage,int index);
}
