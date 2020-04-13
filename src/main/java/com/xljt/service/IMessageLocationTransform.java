package com.xljt.service;

import com.xljt.pojo.MessageLocationPojo;
import org.springframework.stereotype.Service;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessageLocationTransform <br>
 * @date : 2019/9/16 13:55 <br>
 */
public interface IMessageLocationTransform {

    /**
     * 解析车辆定位单元数据
     * @param oldMessage
     * @param index
     * @return
     */
    MessageLocationPojo getMessageLocation(String oldMessage,int index);
}
