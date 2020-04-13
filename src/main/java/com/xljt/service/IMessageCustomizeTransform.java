package com.xljt.service;

import com.xljt.pojo.MessageCustomizePojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessageCustomizeTransform <br>
 * @date : 2019/9/17 16:02 <br>
 */
public interface IMessageCustomizeTransform {
    MessageCustomizePojo getMessageCustomize(String oldMessage,int index);
}
